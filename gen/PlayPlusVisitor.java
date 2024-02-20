// Generated from C:/Users/guill/IdeaProjects/2122_IHDCB332_G10/src/main/antlr4/tmp\PlayPlus.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PlayPlusParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PlayPlusVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(PlayPlusParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#programme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramme(PlayPlusParser.ProgrammeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#impDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpDecl(PlayPlusParser.ImpDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#fileDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileDecl(PlayPlusParser.FileDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#fileName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileName(PlayPlusParser.FileNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#fctDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFctDecl(PlayPlusParser.FctDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#arglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArglist(PlayPlusParser.ArglistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#instBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstBlock(PlayPlusParser.InstBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(PlayPlusParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#actionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionType(PlayPlusParser.ActionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#exprG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprG(PlayPlusParser.ExprGContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#exprBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBool(PlayPlusParser.ExprBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#exprEnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEnt(PlayPlusParser.ExprEntContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprD(PlayPlusParser.ExprDContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#enumDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDecl(PlayPlusParser.EnumDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#constDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDecl(PlayPlusParser.ConstDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(PlayPlusParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#initVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitVariable(PlayPlusParser.InitVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#initArrays}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitArrays(PlayPlusParser.InitArraysContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PlayPlusParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#scalar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalar(PlayPlusParser.ScalarContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(PlayPlusParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#structure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructure(PlayPlusParser.StructureContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter(PlayPlusParser.CharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(PlayPlusParser.MapContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#symbole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbole(PlayPlusParser.SymboleContext ctx);
}