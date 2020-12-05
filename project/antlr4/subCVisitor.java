// Generated from subC.g4 by ANTLR 4.8

    package antlr4;
    import java.util.HashMap;
    import intermediate.symtab.SymtabEntry;
    import intermediate.type.Typespec;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link subCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface subCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link subCParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(subCParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#mainProgram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainProgram(subCParser.MainProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(subCParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#functionDefinitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinitions(subCParser.FunctionDefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(subCParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(subCParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(subCParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#functionCallStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallStatement(subCParser.FunctionCallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(subCParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(subCParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(subCParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(subCParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(subCParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(subCParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(subCParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#declarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStatement(subCParser.DeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(subCParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#lhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhs(subCParser.LhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#rhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRhs(subCParser.RhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(subCParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#trueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueStatement(subCParser.TrueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#falseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseStatement(subCParser.FalseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(subCParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#switchBranchList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBranchList(subCParser.SwitchBranchListContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#caseBranch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBranch(subCParser.CaseBranchContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#caseConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseConstantList(subCParser.CaseConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#caseCompound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseCompound(subCParser.CaseCompoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#defaultBranch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultBranch(subCParser.DefaultBranchContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#caseConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseConstant(subCParser.CaseConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(subCParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(subCParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#forInitialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInitialization(subCParser.ForInitializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(subCParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#forIncrementStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForIncrementStatement(subCParser.ForIncrementStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(subCParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#formatString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormatString(subCParser.FormatStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#writeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteArguments(subCParser.WriteArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#writeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteArgument(subCParser.WriteArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(subCParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpression(subCParser.SimpleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(subCParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableFactor}
	 * labeled alternative in {@link subCParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableFactor(subCParser.VariableFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberFactor}
	 * labeled alternative in {@link subCParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberFactor(subCParser.NumberFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code characterFactor}
	 * labeled alternative in {@link subCParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterFactor(subCParser.CharacterFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringFactor}
	 * labeled alternative in {@link subCParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringFactor(subCParser.StringFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallFactor}
	 * labeled alternative in {@link subCParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallFactor(subCParser.FunctionCallFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notFactor}
	 * labeled alternative in {@link subCParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotFactor(subCParser.NotFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedFactor}
	 * labeled alternative in {@link subCParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedFactor(subCParser.ParenthesizedFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(subCParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(subCParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(subCParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(subCParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(subCParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(subCParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#unsignedNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedNumber(subCParser.UnsignedNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#integerConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerConstant(subCParser.IntegerConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#realConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealConstant(subCParser.RealConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#characterConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterConstant(subCParser.CharacterConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#stringConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringConstant(subCParser.StringConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#relOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelOp(subCParser.RelOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#addOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOp(subCParser.AddOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link subCParser#mulOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulOp(subCParser.MulOpContext ctx);
}