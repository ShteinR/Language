// Generated from C:/Users/User/Desktop/����/FirstAntlr/src/main/java/antlr\AntlrTest.g4 by ANTLR 4.9.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AntlrTestParser}.
 */
public interface AntlrTestListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AntlrTestParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(AntlrTestParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrTestParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(AntlrTestParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defineVariable}
	 * labeled alternative in {@link AntlrTestParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDefineVariable(AntlrTestParser.DefineVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defineVariable}
	 * labeled alternative in {@link AntlrTestParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDefineVariable(AntlrTestParser.DefineVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idk}
	 * labeled alternative in {@link AntlrTestParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdk(AntlrTestParser.IdkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idk}
	 * labeled alternative in {@link AntlrTestParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdk(AntlrTestParser.IdkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link AntlrTestParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParens(AntlrTestParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link AntlrTestParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParens(AntlrTestParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not}
	 * labeled alternative in {@link AntlrTestParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNot(AntlrTestParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not}
	 * labeled alternative in {@link AntlrTestParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNot(AntlrTestParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusMinus}
	 * labeled alternative in {@link AntlrTestParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlusMinus(AntlrTestParser.PlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusMinus}
	 * labeled alternative in {@link AntlrTestParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlusMinus(AntlrTestParser.PlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compare}
	 * labeled alternative in {@link AntlrTestParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCompare(AntlrTestParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compare}
	 * labeled alternative in {@link AntlrTestParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCompare(AntlrTestParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryOperator}
	 * labeled alternative in {@link AntlrTestParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(AntlrTestParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryOperator}
	 * labeled alternative in {@link AntlrTestParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(AntlrTestParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code num}
	 * labeled alternative in {@link AntlrTestParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNum(AntlrTestParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code num}
	 * labeled alternative in {@link AntlrTestParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNum(AntlrTestParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code name}
	 * labeled alternative in {@link AntlrTestParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterName(AntlrTestParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code name}
	 * labeled alternative in {@link AntlrTestParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitName(AntlrTestParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link AntlrTestParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterId(AntlrTestParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link AntlrTestParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitId(AntlrTestParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logic}
	 * labeled alternative in {@link AntlrTestParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogic(AntlrTestParser.LogicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logic}
	 * labeled alternative in {@link AntlrTestParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogic(AntlrTestParser.LogicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link AntlrTestParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(AntlrTestParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link AntlrTestParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(AntlrTestParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrTestParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(AntlrTestParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrTestParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(AntlrTestParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrTestParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(AntlrTestParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrTestParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(AntlrTestParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrTestParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(AntlrTestParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrTestParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(AntlrTestParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrTestParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(AntlrTestParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrTestParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(AntlrTestParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrTestParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(AntlrTestParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrTestParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(AntlrTestParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrTestParser#break}.
	 * @param ctx the parse tree
	 */
	void enterBreak(AntlrTestParser.BreakContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrTestParser#break}.
	 * @param ctx the parse tree
	 */
	void exitBreak(AntlrTestParser.BreakContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrTestParser#continue}.
	 * @param ctx the parse tree
	 */
	void enterContinue(AntlrTestParser.ContinueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrTestParser#continue}.
	 * @param ctx the parse tree
	 */
	void exitContinue(AntlrTestParser.ContinueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrTestParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(AntlrTestParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrTestParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(AntlrTestParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrTestParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(AntlrTestParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrTestParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(AntlrTestParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrTestParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void enterMainFunction(AntlrTestParser.MainFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrTestParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void exitMainFunction(AntlrTestParser.MainFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrTestParser#cool}.
	 * @param ctx the parse tree
	 */
	void enterCool(AntlrTestParser.CoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrTestParser#cool}.
	 * @param ctx the parse tree
	 */
	void exitCool(AntlrTestParser.CoolContext ctx);
}