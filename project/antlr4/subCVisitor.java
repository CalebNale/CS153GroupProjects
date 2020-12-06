// Generated from SubC.g4 by ANTLR 4.8

    package antlr4;
    import java.util.HashMap;
    import intermediate.symtab.SymtabEntry;
    import intermediate.type.Typespec;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SubCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SubCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SubCParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SubCParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#mainProgram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainProgram(SubCParser.MainProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(SubCParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#functionDefinitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinitions(SubCParser.FunctionDefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(SubCParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(SubCParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(SubCParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#parameterIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterIdentifier(SubCParser.ParameterIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#functionCallStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallStatement(SubCParser.FunctionCallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(SubCParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(SubCParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(SubCParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(SubCParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SubCParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(SubCParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(SubCParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#declarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStatement(SubCParser.DeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(SubCParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#lhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhs(SubCParser.LhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#rhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRhs(SubCParser.RhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(SubCParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#trueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueStatement(SubCParser.TrueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#falseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseStatement(SubCParser.FalseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(SubCParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#switchBranchList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBranchList(SubCParser.SwitchBranchListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#caseBranch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBranch(SubCParser.CaseBranchContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#caseConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseConstantList(SubCParser.CaseConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#caseCompound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseCompound(SubCParser.CaseCompoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#defaultBranch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultBranch(SubCParser.DefaultBranchContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#caseConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseConstant(SubCParser.CaseConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(SubCParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(SubCParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#forInitialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInitialization(SubCParser.ForInitializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(SubCParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#forIncrementStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForIncrementStatement(SubCParser.ForIncrementStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(SubCParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#formatString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormatString(SubCParser.FormatStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#writeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteArguments(SubCParser.WriteArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#writeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteArgument(SubCParser.WriteArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SubCParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpression(SubCParser.SimpleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(SubCParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableFactor}
	 * labeled alternative in {@link SubCParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableFactor(SubCParser.VariableFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberFactor}
	 * labeled alternative in {@link SubCParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberFactor(SubCParser.NumberFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code characterFactor}
	 * labeled alternative in {@link SubCParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterFactor(SubCParser.CharacterFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringFactor}
	 * labeled alternative in {@link SubCParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringFactor(SubCParser.StringFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallFactor}
	 * labeled alternative in {@link SubCParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallFactor(SubCParser.FunctionCallFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notFactor}
	 * labeled alternative in {@link SubCParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotFactor(SubCParser.NotFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedFactor}
	 * labeled alternative in {@link SubCParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedFactor(SubCParser.ParenthesizedFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#variableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableIdentifier(SubCParser.VariableIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(SubCParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(SubCParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(SubCParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(SubCParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#unsignedNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedNumber(SubCParser.UnsignedNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#integerConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerConstant(SubCParser.IntegerConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#realConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealConstant(SubCParser.RealConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#characterConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterConstant(SubCParser.CharacterConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#stringConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringConstant(SubCParser.StringConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#relOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelOp(SubCParser.RelOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#addOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOp(SubCParser.AddOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubCParser#mulOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulOp(SubCParser.MulOpContext ctx);
}