package be.unamur.info.b314.compiler.symbols.helpers;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.symbols.models.ScalarTypeEnum;
import be.unamur.info.b314.compiler.symbols.models.ScalarVariableSymbol;
import be.unamur.info.b314.compiler.symbols.models.Symbol;
import be.unamur.info.b314.compiler.symbols.models.SymbolTypeEnum;
import lombok.experimental.UtilityClass;
import lombok.val;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Cette classe utilitaire (statique) fourni des méthodes utiles pour les symboles
 */
@UtilityClass
public class SymbolHelper {

    /**
     * Enrichi un symbole avec sa valeur
     *
     * @param symbol le symbole à enrichir
     * @param value  la valeur du symbole
     */
    public void enrichSymbolWithInitValue(final Symbol symbol, final Object value) {
        switch (symbol.getSymbolType()) {
            case ARRAY:
            case SCALAR_VARIABLE:
            case CONSTANT:
                symbol.setValue(value);
                break;
            default:
                break;
        }
    }

    /**
     * Prend un typeSubDeclContext et en sort tous les symboles nécessaires
     *
     * @param scope              le scope des symboles
     * @param typeSubDeclContext le typeSubDeclContext
     * @return la liste des symboles correspondant au typeSubDeclContext
     */
    public List<Symbol> typeSubDeclContextToSymbolsMapper(final ParserRuleContext scope, final PlayPlusParser.TypeSubDeclContext typeSubDeclContext) {
        final List<Symbol> symbolList = new ArrayList<>();
        val scalar = typeSubDeclContext.type().scalar();
        if (scalar != null) {

            val ids = typeSubDeclContext.ID();
            val type = ScalarTypeEnum.fromScalar(scalar);
            Object value = null;
            switch (type) {
                case BOOLEAN:
                    value = false;
                    break;
                case INTEGER:
                    value = 0;
                    break;
                case CHAR:
                    value = '\0';
                    break;
            }
            for (TerminalNode id : ids) {
                val variableSymbol = ScalarVariableSymbol.builder()
                        .symbolType(SymbolTypeEnum.SCALAR_VARIABLE)
                        .type(type)
                        .value(value)
                        .name(id.getText())
                        .scope(scope)
                        .build();
                symbolList.add(variableSymbol);
            }
            return symbolList;
        }

        val array = typeSubDeclContext.type().array();
        if (array != null) {
            val ids = typeSubDeclContext.ID();
            for (TerminalNode id : ids) {
                symbolList.add(ArraySymbolHelper.fromArrayContext(id.getText(), scope, array));
            }
            return symbolList;
        }

        val structure = typeSubDeclContext.type().structure();
        if (structure != null) {
            val ids = typeSubDeclContext.ID();
            for (TerminalNode id : ids) {
                symbolList.add(StructureSymbolHelper.fromStructureContext(id.getText(), scope, structure));
            }
            return symbolList;
        }
        return Collections.emptyList();
    }

    /**
     * Prend un constDeclContext et en sort tous le symbole nécessaire
     *
     * @param scope            le scope des symboles
     * @param constDeclContext le constDeckContext
     * @return le symbole correspondant au constDeclContext
     */
    public Symbol constDeclContextToSymbolsMapper(final ParserRuleContext scope, final PlayPlusParser.ConstDeclContext constDeclContext) {
        val scalar = constDeclContext.type().scalar();
        if (scalar != null) {
            val type = ScalarTypeEnum.fromScalar(scalar);
            return ScalarVariableSymbol.builder()
                    .symbolType(SymbolTypeEnum.SCALAR_VARIABLE)
                    .type(type)
                    .name(constDeclContext.ID().getText())
                    .scope(scope)
                    .build();
        }

        val array = constDeclContext.type().array();
        if (array != null) {
            return ArraySymbolHelper.fromArrayContext(constDeclContext.ID().getText(), scope, array);
        }

        val structure = constDeclContext.type().structure();
        if (structure != null) {
            return StructureSymbolHelper.fromStructureContext(constDeclContext.ID().getText(), scope, structure);
        }
        return null;
    }
}
