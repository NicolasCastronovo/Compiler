// Generated from C:/Users/guill/IdeaProjects/2122_IHDCB332_G10/src/main/antlr4/tmp\PlayPlus.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PlayPlusParser}.
 */
public interface PlayPlusListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(PlayPlusParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(PlayPlusParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#programme}.
	 * @param ctx the parse tree
	 */
	void enterProgramme(PlayPlusParser.ProgrammeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#programme}.
	 * @param ctx the parse tree
	 */
	void exitProgramme(PlayPlusParser.ProgrammeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#impDecl}.
	 * @param ctx the parse tree
	 */
	void enterImpDecl(PlayPlusParser.ImpDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#impDecl}.
	 * @param ctx the parse tree
	 */
	void exitImpDecl(PlayPlusParser.ImpDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#fileDecl}.
	 * @param ctx the parse tree
	 */
	void enterFileDecl(PlayPlusParser.FileDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#fileDecl}.
	 * @param ctx the parse tree
	 */
	void exitFileDecl(PlayPlusParser.FileDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#fileName}.
	 * @param ctx the parse tree
	 */
	void enterFileName(PlayPlusParser.FileNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#fileName}.
	 * @param ctx the parse tree
	 */
	void exitFileName(PlayPlusParser.FileNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#fctDecl}.
	 * @param ctx the parse tree
	 */
	void enterFctDecl(PlayPlusParser.FctDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#fctDecl}.
	 * @param ctx the parse tree
	 */
	void exitFctDecl(PlayPlusParser.FctDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(PlayPlusParser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(PlayPlusParser.ArglistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#instBlock}.
	 * @param ctx the parse tree
	 */
	void enterInstBlock(PlayPlusParser.InstBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#instBlock}.
	 * @param ctx the parse tree
	 */
	void exitInstBlock(PlayPlusParser.InstBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(PlayPlusParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(PlayPlusParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 */
	void enterActionType(PlayPlusParser.ActionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 */
	void exitActionType(PlayPlusParser.ActionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#exprG}.
	 * @param ctx the parse tree
	 */
	void enterExprG(PlayPlusParser.ExprGContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#exprG}.
	 * @param ctx the parse tree
	 */
	void exitExprG(PlayPlusParser.ExprGContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#exprBool}.
	 * @param ctx the parse tree
	 */
	void enterExprBool(PlayPlusParser.ExprBoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#exprBool}.
	 * @param ctx the parse tree
	 */
	void exitExprBool(PlayPlusParser.ExprBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void enterExprEnt(PlayPlusParser.ExprEntContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void exitExprEnt(PlayPlusParser.ExprEntContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprD(PlayPlusParser.ExprDContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprD(PlayPlusParser.ExprDContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#enumDecl}.
	 * @param ctx the parse tree
	 */
	void enterEnumDecl(PlayPlusParser.EnumDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#enumDecl}.
	 * @param ctx the parse tree
	 */
	void exitEnumDecl(PlayPlusParser.EnumDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstDecl(PlayPlusParser.ConstDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstDecl(PlayPlusParser.ConstDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(PlayPlusParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(PlayPlusParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void enterInitVariable(PlayPlusParser.InitVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#initVariable}.
	 * @param ctx the parse tree
	 */
	void exitInitVariable(PlayPlusParser.InitVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#initArrays}.
	 * @param ctx the parse tree
	 */
	void enterInitArrays(PlayPlusParser.InitArraysContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#initArrays}.
	 * @param ctx the parse tree
	 */
	void exitInitArrays(PlayPlusParser.InitArraysContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(PlayPlusParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(PlayPlusParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#scalar}.
	 * @param ctx the parse tree
	 */
	void enterScalar(PlayPlusParser.ScalarContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#scalar}.
	 * @param ctx the parse tree
	 */
	void exitScalar(PlayPlusParser.ScalarContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(PlayPlusParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(PlayPlusParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#structure}.
	 * @param ctx the parse tree
	 */
	void enterStructure(PlayPlusParser.StructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#structure}.
	 * @param ctx the parse tree
	 */
	void exitStructure(PlayPlusParser.StructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(PlayPlusParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(PlayPlusParser.CharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(PlayPlusParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(PlayPlusParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#symbole}.
	 * @param ctx the parse tree
	 */
	void enterSymbole(PlayPlusParser.SymboleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#symbole}.
	 * @param ctx the parse tree
	 */
	void exitSymbole(PlayPlusParser.SymboleContext ctx);
}