package be.unamur.info.b314.compiler.visitor;

import be.unamur.info.b314.compiler.PlayPlusBaseVisitor;
import be.unamur.info.b314.compiler.PlayPlusLexer;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.exception.SemanticException;
import be.unamur.info.b314.compiler.printer.NBCPrinter;
import be.unamur.info.b314.compiler.symbols.helpers.ArraySymbolHelper;
import be.unamur.info.b314.compiler.symbols.helpers.SymbolHelper;
import be.unamur.info.b314.compiler.symbols.manager.SymbolMapManager;
import be.unamur.info.b314.compiler.symbols.models.ArraySymbol;
import be.unamur.info.b314.compiler.symbols.models.DirEnum;
import be.unamur.info.b314.compiler.symbols.models.FunctionSymbol;
import be.unamur.info.b314.compiler.symbols.models.GameMapSymbol;
import be.unamur.info.b314.compiler.symbols.models.ScalarTypeEnum;
import be.unamur.info.b314.compiler.symbols.models.ScalarVariableSymbol;
import be.unamur.info.b314.compiler.symbols.models.StructureSymbol;
import be.unamur.info.b314.compiler.symbols.models.Symbol;
import be.unamur.info.b314.compiler.symbols.models.SymbolTypeEnum;
import com.google.common.collect.ImmutableList;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Print PCode for a given tree using provided symbol table and printer. This
 * class uses ANTLR visitor mechanism.
 */
@Slf4j
@RequiredArgsConstructor
public class NBCVisitor extends PlayPlusBaseVisitor<Object> {

    private final NBCPrinter printer;
    private final String currentDirectory;
    private final SymbolMapManager symbolMapManager = new SymbolMapManager();
    private static final List<Class<? extends ParserRuleContext>> VARIABLE_SCOPES = ImmutableList.of(
            PlayPlusParser.ProgrammeContext.class,
            PlayPlusParser.FctDeclContext.class,
            PlayPlusParser.WhileInstructionContext.class,
            PlayPlusParser.RepeatInstructionContext.class,
            PlayPlusParser.IfInstructionContext.class,
            PlayPlusParser.IfElseInstructionContext.class);
    private GameMapSymbol gameMapSymbol = null;

    /**
     * Visite le root et gère le squelette du print
     *
     * @param ctx
     * @return this.gameMapSymbol
     */
    @Override
    public GameMapSymbol visitRoot(PlayPlusParser.RootContext ctx) {
        printer.printInclude();
        printer.printComments("Start instructions");
        super.visitRoot(ctx); // Print instructions
        printer.printComments("End instructions");
        printer.printStop(); // Stop execution
        return this.gameMapSymbol;
    }

    /**
     * Visite map
     * Contient validations
     * Sauvegarde la map
     *
     * @param ctx le MapContext
     * @return null
     */
    @Override
    public Void visitGameMap(PlayPlusParser.GameMapContext ctx) {
        int lines = Integer.parseInt(ctx.ENTIER(0).getText());
        int columns = Integer.parseInt(ctx.ENTIER(1).getText());
        int positionOccurences = 0;
        int treasureOccurences = 0;
        int ennemiesOccurences = 0;
        Point startPos = new Point(0, 0);

        //Check: Le nombre d'éléments correspond à la taille de la matrice
        if (lines * columns != ctx.mapElement().size()) {
            throw new SemanticException("La taille annoncée de la map ne correspond pas à sa taille réelle");
        }

        //Initialisation de l'objet
        val gameMap = new Character[lines][columns];
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                gameMap[i][j] = ctx.mapElement().get(i * columns + j).getText().charAt(0);
                if (gameMap[i][j] == '@') {
                    positionOccurences++;
                    startPos = new Point(i, j);
                } else if (gameMap[i][j] == 'X') {
                    treasureOccurences++;
                } else if (gameMap[i][j] == 'Q') {
                    ennemiesOccurences++;
                }
            }
        }

        //Check: Il y a absolument une seule position de départ pour le robot
        if (positionOccurences < 1) {
            throw new SemanticException("Il n'y a pas de position de départ pour le robot");
        } else if (positionOccurences > 1) {
            throw new SemanticException("Il y a plus d'une position de départ pour le robot");
        }

        //Check: Il y a absolument un seul trésor sur la map
        if (treasureOccurences < 1) {
            throw new SemanticException("Il n'y a pas de trésor sur la carte");
        } else if (treasureOccurences > 1) {
            throw new SemanticException("Il y a plus d'un trésor sur la carte");
        }

        //Check: Il y au moins un ennemi sur la map
        if (ennemiesOccurences < 1) {
            throw new SemanticException("Il n'y a pas d'ennemis sur la carte");
        }

        this.gameMapSymbol = GameMapSymbol.builder()
                .gameMap(gameMap)
                .position(startPos)
                .lines(lines)
                .columns(columns)
                .dir(DirEnum.U)
                .build();

        return null;
    }

    /**
     * Prends la map
     *
     * @param ctx
     * @return null
     */
    @Override
    public Void visitFileDecl(PlayPlusParser.FileDeclContext ctx) {
        String filename = ctx.FILENAME().getText().replace("\"", "");

        try {
            if (currentDirectory.contains("codegeneration")) {
                File inputFile = new File(currentDirectory + filename);

                ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(inputFile));
                CommonTokenStream tokens = new CommonTokenStream(new PlayPlusLexer(input));

                PlayPlusParser parser = new PlayPlusParser(tokens);
                PlayPlusParser.RootContext tree = parser.root();

                NBCVisitor visitor = new NBCVisitor(printer, currentDirectory);
                this.gameMapSymbol = (GameMapSymbol) visitor.visit(tree);
            }

        } catch (IOException e) {
            log.info("il n'y a pas de map ou le nom de la map est incorrect");
        }
        return null;
    }


    /**
     * Visite programme
     * Set le programGlobalScope
     *
     * @param ctx le ProgrammeContext
     * @return Object
     */
    @Override
    public Object visitProgramme(PlayPlusParser.ProgrammeContext ctx) {
        symbolMapManager.setProgramGlobalScope(ctx);
        return super.visitProgramme(ctx);
    }

    /**
     * Visite la condition du while
     * Si la condition est fausse return null (sort du while)
     * Sinon visite le while dans la super
     * Puis refresh la table des symboles du scope courant ctx
     * Puis revisite le while
     *
     * @param ctx
     * @return null
     */
    @Override
    public Void visitWhileInstruction(PlayPlusParser.WhileInstructionContext ctx) {
        val condition = (Boolean) this.visit(ctx.exprD());
        if (!condition) {
            return null;
        }
        super.visitWhileInstruction(ctx);
        symbolMapManager.getSymbolMap().remove(ctx);
        this.visitWhileInstruction(ctx);
        return null;
    }

    /**
     * Visite le repeat dans la super
     * Visite la condition du repeat
     * Si la condition est fausse refresh la table des symboles du scope courant ctx
     * Puis revisite le repeat
     * Sinon return null
     *
     * @param ctx
     * @return null
     */
    @Override
    public Void visitRepeatInstruction(PlayPlusParser.RepeatInstructionContext ctx) {
        super.visitRepeatInstruction(ctx);
        val condition = (Boolean) this.visit(ctx.exprD());
        if (!condition) {
            symbolMapManager.getSymbolMap().remove(ctx);
            this.visitRepeatInstruction(ctx);
        }
        return null;
    }

    /**
     * Si l'indexSymbol n'existe pas, crée l'indexSymbol
     * Visite la condition
     * Si la condition est fausse return null
     * Sinon visite le for dans la super
     * Puis refresh la table des symboles du scope courant ctx
     * Puis réajoute l'indexSymbol dans la table des symboles du scope courant ctx
     * Puis revisite le for
     *
     * @param ctx
     * @return null
     */
    @Override
    public Void visitForInstruction(PlayPlusParser.ForInstructionContext ctx) {
        ScalarVariableSymbol indexSymbol;
        if (symbolMapManager.getSymbolMap().containsKey(ctx) && symbolMapManager.getSymbolMap().get(ctx).containsKey(ctx.ID().getText())) {
            indexSymbol = (ScalarVariableSymbol) symbolMapManager.getSymbolMap().get(ctx).get(ctx.ID().getText());
        } else {
            Integer index;
            try {
                index = (Integer) this.visit(ctx.exprD(0));
            } catch (ClassCastException classCastException) {
                throw new SemanticException("L'index d'un for doit être un entier");
            }

            indexSymbol = ScalarVariableSymbol.builder()
                    .symbolType(SymbolTypeEnum.SCALAR_VARIABLE)
                    .scope(ctx)
                    .name(ctx.ID().getText())
                    .value(index)
                    .type(ScalarTypeEnum.INTEGER)
                    .build();

            symbolMapManager.addSymbol(ctx, indexSymbol);
        }

        Boolean condition;
        try {
            condition = (Boolean) this.visit(ctx.exprD(1));
        } catch (ClassCastException classCastException) {
            throw new SemanticException("La condition d'un for doit être un boolean");
        }

        if (!condition) {
            return null;
        }

        super.visitForInstruction(ctx);
        symbolMapManager.getSymbolMap().remove(ctx);
        symbolMapManager.addSymbol(ctx, indexSymbol);
        this.visitForInstruction(ctx);
        return null;
    }

    /**
     * Visite le if
     * Visite la condition du if
     * Visite les instruction dans le if si la condition est vraie sinon non
     *
     * @param ctx le IfInstructionContext
     * @return null
     */
    @Override
    public Void visitIfInstruction(PlayPlusParser.IfInstructionContext ctx) {
        val condition = (Boolean) this.visit(ctx.exprD());
        if (condition) {
            this.visit(ctx.ifBlock());
        }
        return null;
    }

    /**
     * Visite le if else
     * Visite la condition
     * Visite les instructions de la branche if si la condition est vraie, sinon visite les instructions de la branche else
     *
     * @param ctx le IfElseInstructionContext
     * @return null
     */
    @Override
    public Void visitIfElseInstruction(PlayPlusParser.IfElseInstructionContext ctx) {
        val condition = (Boolean) this.visit(ctx.exprD());
        if (condition) {
            this.visit(ctx.ifBlock());
        } else {
            this.visit(ctx.elseBlock());
        }
        return null;
    }

    /**
     * Visite l'actionType
     * Visite l'argument et le valide
     *
     * @param ctx l'ActionTypeContext
     * @return null
     */
    @Override
    public Void visitActionType(PlayPlusParser.ActionTypeContext ctx) {

        if (ctx.exprD() != null) {
            val parameter = this.visit(ctx.exprD());
            if (parameter != null && !parameter.getClass().equals(Integer.class)) {
                throw new SemanticException("Le paramètre d'un actionType doit être de type INTEGER");
            }
            if (gameMapSymbol != null) {
                int x = gameMapSymbol.getPosition().x;
                int y = gameMapSymbol.getPosition().y;
                Point newPos = new Point(x, y);
                if (parameter != null) {
                    val parameterInt = (Integer) parameter;
                    val parameterString = parameterInt.toString();
                    if (ctx.LEFT() != null) {
                        printer.printLeft(parameterString);
                        gameMapSymbol.setDir(DirEnum.L);
                        y = y - parameterInt;
                    } else if (ctx.RIGHT() != null) {
                        printer.printRight(parameterString);
                        gameMapSymbol.setDir(DirEnum.R);
                        y = y + parameterInt;
                    } else if (ctx.UP() != null) {
                        printer.printUp(parameterString);
                        gameMapSymbol.setDir(DirEnum.U);
                        x = x - parameterInt;
                    } else if (ctx.DOWN() != null) {
                        printer.printDown(parameterString);
                        gameMapSymbol.setDir(DirEnum.D);
                        x = x + (parameterInt);
                    }
                }

                //Check: la nouvelle position est à l'intérieur de la carte
                if (x > gameMapSymbol.getLines() - 1 || x < 0 || y < 0 || y > gameMapSymbol.getColumns() - 1) {
                    throw new SemanticException("Le robot va sortir de la carte");
                }

                //Check: il n'y a pas d'obstacle sur la route
                List<Character> obstacles = Arrays.asList('B', 'P', 'T', '_', 'S');
                List<Character> playerPath = new ArrayList<>();
                int i = 0;
                int j = 0;
                do {
                    do {
                        if (gameMapSymbol.getDir().equals(DirEnum.L)) {
                            j--;
                        } else if (gameMapSymbol.getDir().equals(DirEnum.R)) {
                            j++;
                        }
                        playerPath.add(gameMapSymbol.getGameMap()[newPos.x + i][newPos.y + j]);
                    } while (j != y - newPos.y && newPos.y - y != 0);
                    if (gameMapSymbol.getDir().equals(DirEnum.U)) {
                        i--;
                    } else if (gameMapSymbol.getDir().equals(DirEnum.D)) {
                        i++;
                    }
                } while (i != x - newPos.x && newPos.x - x != 0);
                if (!playerPath.retainAll(obstacles)) {
                    throw new SemanticException("Le robot est bloqué par un obstacle");
                }

                newPos = new Point(x, y);
                gameMapSymbol.setPosition(newPos);
            }
        } else {
            if (ctx.DIG() != null) {
                printer.printDig();
            } else if (ctx.JUMP() != null) {
                printer.printJump();
            } else if (ctx.FIGHT() != null) {
                printer.printFight();
            }
        }
        return null;
    }

    /**
     * Visite le functionCall
     * Trouve la FunctionSymbol
     * Valide les arguments
     * Set les values des arguments dans la FunctionSymbol
     * Visite le fctDeclContext pour execution de la function
     *
     * @param ctx le FunctionCallInstructionContext
     * @return Object
     */
    @Override
    public Object visitFunctionCallInstruction(PlayPlusParser.FunctionCallInstructionContext ctx) {
        val functionSymbol = symbolMapManager.findFunctionSymbol(ctx.ID(0).getText());
        printer.printCallThread(functionSymbol.getName());
        if (functionSymbol.getArgumentList().size() != ctx.ID().size() - 1) {
            throw new SemanticException("La function est appellée avec un nombre d'arguments différents de sa définition");
        }

        for (int i = 1; i < ctx.ID().size(); i++) {
            val symbol = symbolMapManager.findSymbol(ctx, ctx.ID(i).getText());
            functionSymbol.getArgumentList().get(i + 1).setValue(symbol.getValue());
        }

        return this.visitFctDecl(functionSymbol.getFctDeclContext());
    }

    /**
     * Visite le exprDFunctionCall
     * Trouve la FunctionSymbol
     * Valide les arguments
     * Set les values des arguments dans la FunctionSymbol
     * Visite le fctDeclContext pour execution de la function
     * Retourne la valeur de retour de la function (value du FunctionSymbol)
     *
     * @param ctx le ExprDFunctionCallContext
     * @return la valeur renvoyée par la function
     */
    @Override
    public Object visitExprDFunctionCall(PlayPlusParser.ExprDFunctionCallContext ctx) {
        val functionSymbol = symbolMapManager.findFunctionSymbol(ctx.ID().getText());
        if (functionSymbol.getArgumentList().size() != ctx.exprD().size()) {
            throw new SemanticException("La function est appellée avec un nombre d'arguments différents de sa définition");
        }

        for (int i = 0; i < ctx.exprD().size(); i++) {
            val value = this.visit(ctx.exprD(i));
            functionSymbol.getArgumentList().get(i).setValue(value);
        }

        this.visitFctDecl(functionSymbol.getFctDeclContext());
        return functionSymbol.getValue();
    }

    /**
     * Visite le fctDecl
     * Si le FunctionSymbol correspondant à la fctDecl existe alors on visit fctDecl via la super
     * Sinon on crée les symboles correspondants à la function et aux arguments de celle-ci pour les ajouter dans la symbolMap
     *
     * @param ctx le FctDeclContext
     * @return Object
     */
    @Override
    public Object visitFctDecl(PlayPlusParser.FctDeclContext ctx) {
        val functionName = ctx.ID().getText();
        if (ctx.scalar() != null) {
            if (ctx.scalar().BOOLEAN() != null) {
                printer.printOpenThread(functionName, "sbyte");
            } else if (ctx.scalar().INTEGER() != null) {
                printer.printOpenThread(functionName, "sword");
            } else if (ctx.scalar().CHAR() != null) {
                printer.printOpenThread(functionName, "byte");
            }
        } else {
            printer.printOpenThread(functionName, "void");
        }
        if (!symbolMapManager.symbolExistsInGlobalScope(functionName)) {
            List<Symbol> argumentList = Collections.emptyList();
            if (ctx.arglist() != null) {
                argumentList = new ArrayList<>();
                val typeSubDeclContextList = ctx.arglist().typeSubDecl();
                for (PlayPlusParser.TypeSubDeclContext typeSubDeclContext : typeSubDeclContextList) {
                    argumentList.addAll(SymbolHelper.typeSubDeclContextToSymbolsMapper(ctx, typeSubDeclContext));
                }
            }

            final ScalarTypeEnum returnType = ScalarTypeEnum.fromScalar(ctx.scalar());

            // function scope always global
            val functionSymbol = FunctionSymbol.builder()
                    .symbolType(SymbolTypeEnum.FUNCTION)
                    .scope(symbolMapManager.getProgramGlobalScope())
                    .name(functionName)
                    .returnType(returnType)
                    .argumentList(argumentList)
                    .fctDeclContext(ctx)
                    .build();

            symbolMapManager.addSymbol(symbolMapManager.getProgramGlobalScope(), functionSymbol);
            symbolMapManager.addSymbols(ctx, argumentList);

            return null;
        }

        return super.visitFctDecl(ctx);
    }

    /**
     * Visit la varDecl
     * On crée les symboles necessaires pour les ajouter dans la symbolMap
     *
     * @param ctx le VarDeclContext
     * @return Object
     */
    @Override
    public Object visitVarDecl(PlayPlusParser.VarDeclContext ctx) {
        // need to find scope
        ParserRuleContext scope = ctx.getParent();
        while (!VARIABLE_SCOPES.contains(scope.getClass())) {
            scope = scope.getParent();
        }

        val symbolList = SymbolHelper.typeSubDeclContextToSymbolsMapper(scope, ctx.typeSubDecl());

        if (ctx.typeSubDecl().type().structure() != null) {
            printer.printStrucDecl(ctx.typeSubDecl().ID().toString());
            for (val element : ctx.typeSubDecl().type().structure().varDecl()) {
                super.visitVarDecl(element);
            }
            printer.printStrucDeclEnd();
        } else if (ctx.typeSubDecl().type().array() != null) {
            if (ctx.typeSubDecl().type().array().ENTIER().size() == 1) {
                printer.printVarDeclArray(ctx.typeSubDecl().type().getText(), ctx.typeSubDecl().ID().toString(), 1, ctx.typeSubDecl().type().array().ENTIER(0).getText(), "");
            } else {
                printer.printVarDeclArray(ctx.typeSubDecl().type().getText(), ctx.typeSubDecl().ID().toString(), 1, ctx.typeSubDecl().type().array().ENTIER(0).getText(), ctx.typeSubDecl().type().array().ENTIER(1).getText());
            }
        } else {
            printer.printVarDecl(ctx.typeSubDecl().type().getText(), ctx.typeSubDecl().ID().get(0).toString());
        }

        if (ctx.initVariable() != null) {
            val value = this.visit(ctx.initVariable());
            symbolList.forEach(symbol -> SymbolHelper.enrichSymbolWithInitValue(symbol, value));
            printer.printVarDeclInit(ctx.typeSubDecl().type().getText(), ctx.typeSubDecl().ID().toString(), value.toString());
        }

        symbolMapManager.addSymbols(scope, symbolList);

        return super.visitVarDecl(ctx);
    }

    /**
     * Visit la constDecl
     * On crée les symboles necessaires pour les ajouter dans la symbolMap
     *
     * @param ctx le CosntDeclContext
     * @return Object
     */
    @Override
    public Void visitConstDecl(PlayPlusParser.ConstDeclContext ctx) {
        // need to find scope
        ParserRuleContext scope = ctx.getParent();
        while (!VARIABLE_SCOPES.contains(scope.getClass())) {
            scope = scope.getParent();
        }

        val symbol = SymbolHelper.constDeclContextToSymbolsMapper(scope, ctx);

        if (ctx.type().structure() != null) {
            printer.printStrucDecl(ctx.ID().toString());
            for (val element : ctx.type().structure().varDecl()) {
                super.visitVarDecl(element);
            }
            printer.printStrucDeclEnd();
        } else if (ctx.type().array() != null) {
            if (ctx.type().array().ENTIER().size() == 1) {
                printer.printVarDeclArray(ctx.type().getText(), ctx.ID().toString(), 1, ctx.type().array().ENTIER(0).getText(), "");
            } else {
                printer.printVarDeclArray(ctx.type().getText(), ctx.ID().toString(), 1, ctx.type().array().ENTIER(0).getText(), ctx.type().array().ENTIER(1).getText());
            }
        } else {
            printer.printAssignationIdContextConstant(ctx.type().getText(), ctx.ID().toString());
        }

        val value = this.visit(ctx.initVariable());
        SymbolHelper.enrichSymbolWithInitValue(symbol, value);
        printer.printVarDeclInit(ctx.type().getText(), ctx.ID().toString(), value.toString());

        symbolMapManager.addSymbol(scope, symbol);

        return null;
    }

    /**
     * Visite l'initVariable
     *
     * @param ctx l'InitVariableContext
     * @return Object
     */
    @Override
    public Object visitInitVariable(PlayPlusParser.InitVariableContext ctx) {
        if (ctx.initArrays() != null) {
            return this.visit(ctx.initArrays());
        } else if (ctx.exprD() != null) {
            return this.visit(ctx.exprD());
        }
        return null;
    }

    /**
     * Visite l'initArrays
     *
     * @param ctx le InitArraysContext
     * @return une liste d'objets qui in fine sera une liste de valeurs correspondant aux valeurs des exprD
     */
    @Override
    public List<Object> visitInitArrays(PlayPlusParser.InitArraysContext ctx) {
        return ctx.initVariable().stream().map(this::visitInitVariable).collect(Collectors.toList());
    }

    /**
     * Visite l'assignationInstruction
     * Trouve les symboles correspondant aux exprG
     * Après avoir visité les exprD pour avoir la ou les valeurs finales,
     * Sauve cette ou ces valeurs dans le symbole
     *
     * @param ctx l'AssignationInstructionContext
     * @return Object
     */
    @Override
    public Object visitAssignationInstruction(PlayPlusParser.AssignationInstructionContext ctx) {
        val exprG = ctx.exprG();
        Symbol symbol;
        if (exprG.getClass().equals(PlayPlusParser.ExprGIdContext.class)) {
            symbol = symbolMapManager.findSymbol(ctx, exprG.getText());
            val value = this.visit((ctx.exprD()));
            switch (symbol.getSymbolType()) {
                case SCALAR_VARIABLE:
                    printer.printAssignationIdContextScalar(ctx.exprG().getText(), value.toString());
                    symbol.setValue(value);
                    break;
                case FUNCTION:
                    printer.printAssignationIdContextScalar(ctx.exprG().getText(), value.toString());
                    printer.printCloseThread();
                    symbol.setValue(value);
                    return value;
                default:
                    throw new SemanticException("Lorsqu'on est sur ExprGId le type du symbol ne peut être " + symbol.getSymbolType());
            }
        } else if (exprG.getClass().equals(PlayPlusParser.ExprGArrayContext.class)) {
            val exprGArrayContext = (PlayPlusParser.ExprGArrayContext) exprG;
            symbol = symbolMapManager.findSymbol(ctx, exprGArrayContext.ID().getText());
            val value = this.visit(ctx.exprD());
            val index1D = (Integer) this.visit(exprGArrayContext.exprD(0));
            if (exprGArrayContext.exprD().size() == 1) {
                ArraySymbolHelper.setArraySymbolValue(symbol, value, index1D);
                // PRINT ASSIGNATION ARRAY CONTEXT SIMPLE
                printer.printAssignationArrayContextSimple(exprGArrayContext.ID().getText(), value.toString(), index1D.toString());
            } else if (exprGArrayContext.exprD().size() == 2) {
                val index2D = (Integer) this.visit(exprGArrayContext.exprD(1));
                ArraySymbolHelper.setArraySymbolValue(symbol, value, index1D, index2D);
                // PRINT ASSIGNATION ARRAY CONTEXT DOUBLE
                printer.printAssignationArrayContextDouble(exprGArrayContext.ID().getText(), value.toString(), index1D.toString(), index2D.toString());
            }
            return null;
        } else if (exprG.getClass().equals(PlayPlusParser.ExprGRecordCallContext.class)) {
            val exprGRecordCallContext = (PlayPlusParser.ExprGRecordCallContext) exprG;
            symbol = symbolMapManager.findSymbol(ctx, exprGRecordCallContext.ID(0).getText());
            if (symbol.getSymbolType() == SymbolTypeEnum.STRUCTURE) {
                val structureSymbol = (StructureSymbol) symbol;
                val key = exprGRecordCallContext.ID(1).getText();
                val value = this.visit(ctx.exprD());
                if (exprGRecordCallContext.exprD().isEmpty()) {
                    structureSymbol.getRecords().get(key).setValue(value);
                    // PRINT ASSIGNATION RECORD CONTEXT
                    printer.printAssignationRecordContext(exprGRecordCallContext.ID(0).getText(), key, value.toString());
                } else {
                    val index1D = (Integer) this.visit(exprGRecordCallContext.exprD(0));
                    if (exprGRecordCallContext.exprD().size() == 1) {
                        ArraySymbolHelper.setArraySymbolValue(structureSymbol.getRecords().get(key), value, index1D);
                        // PRINT ASSIGNATION ARRAY RECORD CONTEXT SIMPLE
                        printer.printAssignationArrayRecordContextSimple(exprGRecordCallContext.ID(0).getText(), key, value.toString(), index1D.toString());
                    } else {
                        val index2D = (Integer) this.visit(exprGRecordCallContext.exprD(1));
                        ArraySymbolHelper.setArraySymbolValue(structureSymbol.getRecords().get(key), value, index1D, index2D);
                        // PRINT ASSIGNATION ARRAY RECORD CONTEXT DOUBLE
                        printer.printAssignationArrayRecordContextDouble(exprGRecordCallContext.ID(0).getText(), key, value.toString(), index1D.toString(), index2D.toString());
                    }
                }
            }
            return null;
        }

        return super.visitAssignationInstruction(ctx);
    }


    // toutes les méthodes suivantes correspondant à exprD consistent à renvoyer la valeur de l'exprD, la précedence des opérations est gérée par l'ordre dans la grammaire
    @Override
    public Integer visitExprDEntier(PlayPlusParser.ExprDEntierContext ctx) {
        return Integer.valueOf(ctx.ENTIER().getText());
    }

    @Override
    public Boolean visitExprDTrue(PlayPlusParser.ExprDTrueContext ctx) {
        return Boolean.valueOf(ctx.TRUE().getText());
    }

    @Override
    public String visitExprDString(PlayPlusParser.ExprDStringContext ctx) {
        return ctx.STRING().getText();
    }

    @Override
    public Boolean visitExprDFalse(PlayPlusParser.ExprDFalseContext ctx) {
        return Boolean.valueOf(ctx.FALSE().getText());
    }

    @Override
    public String visitExprDId(PlayPlusParser.ExprDIdContext ctx) {
        return ctx.ID().getText();
    }

    @Override
    public Character visitExprDCharacter(PlayPlusParser.ExprDCharacterContext ctx) {
        return ctx.character().CHARACTER().getText().charAt(1);
    }

    @Override
    public Object visitNotExprD(PlayPlusParser.NotExprDContext ctx) {
        return !(Boolean) super.visitNotExprD(ctx);
    }

    @Override
    public Object visitMinusExprD(PlayPlusParser.MinusExprDContext ctx) {
        return -1 * (Integer) super.visitMinusExprD(ctx);
    }

    @Override
    public Object visitExprDPar(PlayPlusParser.ExprDParContext ctx) {
        return super.visit(ctx.exprD());
    }

    @Override
    public Object visitExprDMultiplication(PlayPlusParser.ExprDMultiplicationContext ctx) {
        val left = (Integer) this.visit(ctx.left);
        val right = (Integer) this.visit(ctx.right);
        return left * right;
    }

    @Override
    public Object visitExprDDivision(PlayPlusParser.ExprDDivisionContext ctx) {
        val left = (Integer) this.visit(ctx.left);
        val right = (Integer) this.visit(ctx.right);
        return left / right;
    }

    @Override
    public Object visitExprDModulo(PlayPlusParser.ExprDModuloContext ctx) {
        val left = (Integer) this.visit(ctx.left);
        val right = (Integer) this.visit(ctx.right);
        return Math.abs(left % right);
    }

    @Override
    public Object visitExprDAddition(PlayPlusParser.ExprDAdditionContext ctx) {
        val left = (Integer) this.visit(ctx.left);
        val right = (Integer) this.visit(ctx.right);
        return left + right;
    }

    @Override
    public Object visitExprDSubstraction(PlayPlusParser.ExprDSubstractionContext ctx) {
        return (Integer) this.visit(ctx.left) - (Integer) this.visit(ctx.right);
    }

    @Override
    public Object visitExprDBigger(PlayPlusParser.ExprDBiggerContext ctx) {
        val left = (Integer) this.visit(ctx.exprD(0));
        val right = (Integer) this.visit(ctx.exprD(1));
        return left > right;
    }

    @Override
    public Object visitExprDBiggeq(PlayPlusParser.ExprDBiggeqContext ctx) {
        val left = (Integer) this.visit(ctx.exprD(0));
        val right = (Integer) this.visit(ctx.exprD(1));
        return left >= right;
    }

    @Override
    public Object visitExprDSmaller(PlayPlusParser.ExprDSmallerContext ctx) {
        val left = (Integer) this.visit(ctx.exprD(0));
        val right = (Integer) this.visit(ctx.exprD(1));
        return left < right;
    }

    @Override
    public Object visitExprDSmaleq(PlayPlusParser.ExprDSmaleqContext ctx) {
        val left = (Integer) this.visit(ctx.exprD(0));
        val right = (Integer) this.visit(ctx.exprD(1));
        return left <= right;
    }

    @Override
    public Object visitExprDAnd(PlayPlusParser.ExprDAndContext ctx) {
        val left = (Boolean) this.visit(ctx.exprD(0));
        val right = (Boolean) this.visit(ctx.exprD(1));
        return left && right;
    }

    @Override
    public Object visitExprDOr(PlayPlusParser.ExprDOrContext ctx) {
        val left = (Boolean) this.visit(ctx.exprD(0));
        val right = (Boolean) this.visit(ctx.exprD(1));
        return left || right;
    }

    @Override
    public Object visitExprDEqual(PlayPlusParser.ExprDEqualContext ctx) {
        val leftObject = this.visit(ctx.exprD(0));
        val rightObject = this.visit(ctx.exprD(1));
        if (leftObject.getClass().equals(rightObject.getClass())) {
            val left = leftObject.getClass().cast(leftObject);
            val right = rightObject.getClass().cast(rightObject);
            return left.equals(right);
        }
        throw new SemanticException("left et right exprD ne sont pas du même type");
    }

    @Override
    public Object visitExprDDifferent(PlayPlusParser.ExprDDifferentContext ctx) {
        val leftObject = this.visit(ctx.exprD(0));
        val rightObject = this.visit(ctx.exprD(1));
        if (leftObject.getClass().equals(rightObject.getClass())) {
            val left = leftObject.getClass().cast(leftObject);
            val right = rightObject.getClass().cast(rightObject);
            return !left.equals(right);
        }
        throw new SemanticException("left et right exprD ne sont pas du même type");
    }

    @Override
    public Object visitExprDExprG(PlayPlusParser.ExprDExprGContext ctx) {
        val exprG = ctx.exprG();
        Symbol symbol;
        if (exprG.getClass().equals(PlayPlusParser.ExprGIdContext.class)) {
            symbol = symbolMapManager.findSymbol(ctx, exprG.getText());
            switch (symbol.getSymbolType()) {
                case SCALAR_VARIABLE:
                case CONSTANT:
                    return symbol.getValue();
                default:
                    return super.visitExprDExprG(ctx);
            }
        } else if (exprG.getClass().equals(PlayPlusParser.ExprGArrayContext.class)) {
            val exprGArrayContext = (PlayPlusParser.ExprGArrayContext) exprG;
            symbol = symbolMapManager.findSymbol(ctx, exprGArrayContext.ID().getText());
            if (symbol.getSymbolType() == SymbolTypeEnum.ARRAY) {
                val arraySymbol = (ArraySymbol) symbol;
                val index1D = (Integer) this.visit(exprGArrayContext.exprD(0));
                if (arraySymbol.getSize().size() == 1) {
                    val array1D = (List<Object>) arraySymbol.getValue();
                    return array1D.get(index1D);
                } else if (arraySymbol.getSize().size() == 2) {
                    val array2D = (List<List<Object>>) arraySymbol.getValue();
                    val index2D = (Integer) this.visit(exprGArrayContext.exprD(1));
                    return array2D.get(index1D).get(index2D);
                }
            }
            return super.visitExprDExprG(ctx);
        } else if (exprG.getClass().equals(PlayPlusParser.ExprGRecordCallContext.class)) {
            val exprGRecordCallContext = (PlayPlusParser.ExprGRecordCallContext) exprG;
            val structureSymbol = (StructureSymbol) symbolMapManager.findSymbol(ctx, exprGRecordCallContext.ID(0).getText());
            val recordSymbol = structureSymbol.getRecords().get(exprGRecordCallContext.ID(1).getText());
            switch (recordSymbol.getSymbolType()) {
                case SCALAR_VARIABLE:
                case CONSTANT:
                    return recordSymbol.getValue();
                case ARRAY:
                    val arraySymbol = (ArraySymbol) recordSymbol;
                    val index1D = (Integer) this.visit(exprGRecordCallContext.exprD(0));
                    if (arraySymbol.getSize().size() == 1) {
                        val array1D = (List<Object>) arraySymbol.getValue();
                        return array1D.get(index1D);
                    } else if (arraySymbol.getSize().size() == 2) {
                        val array2D = (List<List<Object>>) arraySymbol.getValue();
                        val index2D = (Integer) this.visit(exprGRecordCallContext.exprD(1));
                        return array2D.get(index1D).get(index2D);
                    }
            }
        }

        return super.visitExprDExprG(ctx);
    }
}
