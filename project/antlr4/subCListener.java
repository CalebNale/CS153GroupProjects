// Generated from subC.g4 by ANTLR 4.8

    package antlr4;
    import java.util.HashMap;
    import intermediate.symtab.SymtabEntry;
    import intermediate.type.Typespec;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link subCParser}.
 */
public interface subCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link subCParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(subCParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(subCParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#mainProgram}.
	 * @param ctx the parse tree
	 */
	void enterMainProgram(subCParser.MainProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#mainProgram}.
	 * @param ctx the parse tree
	 */
	void exitMainProgram(subCParser.MainProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(subCParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(subCParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#functionDefinitions}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinitions(subCParser.FunctionDefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#functionDefinitions}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinitions(subCParser.FunctionDefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(subCParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(subCParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(subCParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(subCParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(subCParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(subCParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallStatement(subCParser.FunctionCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallStatement(subCParser.FunctionCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(subCParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(subCParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(subCParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(subCParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(subCParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(subCParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(subCParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(subCParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(subCParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(subCParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(subCParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(subCParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(subCParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(subCParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStatement(subCParser.DeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStatement(subCParser.DeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(subCParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(subCParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#lhs}.
	 * @param ctx the parse tree
	 */
	void enterLhs(subCParser.LhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#lhs}.
	 * @param ctx the parse tree
	 */
	void exitLhs(subCParser.LhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#rhs}.
	 * @param ctx the parse tree
	 */
	void enterRhs(subCParser.RhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#rhs}.
	 * @param ctx the parse tree
	 */
	void exitRhs(subCParser.RhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(subCParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(subCParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#trueStatement}.
	 * @param ctx the parse tree
	 */
	void enterTrueStatement(subCParser.TrueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#trueStatement}.
	 * @param ctx the parse tree
	 */
	void exitTrueStatement(subCParser.TrueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#falseStatement}.
	 * @param ctx the parse tree
	 */
	void enterFalseStatement(subCParser.FalseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#falseStatement}.
	 * @param ctx the parse tree
	 */
	void exitFalseStatement(subCParser.FalseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(subCParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(subCParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#switchBranchList}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBranchList(subCParser.SwitchBranchListContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#switchBranchList}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBranchList(subCParser.SwitchBranchListContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#caseBranch}.
	 * @param ctx the parse tree
	 */
	void enterCaseBranch(subCParser.CaseBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#caseBranch}.
	 * @param ctx the parse tree
	 */
	void exitCaseBranch(subCParser.CaseBranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#caseConstantList}.
	 * @param ctx the parse tree
	 */
	void enterCaseConstantList(subCParser.CaseConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#caseConstantList}.
	 * @param ctx the parse tree
	 */
	void exitCaseConstantList(subCParser.CaseConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#caseCompound}.
	 * @param ctx the parse tree
	 */
	void enterCaseCompound(subCParser.CaseCompoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#caseCompound}.
	 * @param ctx the parse tree
	 */
	void exitCaseCompound(subCParser.CaseCompoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#defaultBranch}.
	 * @param ctx the parse tree
	 */
	void enterDefaultBranch(subCParser.DefaultBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#defaultBranch}.
	 * @param ctx the parse tree
	 */
	void exitDefaultBranch(subCParser.DefaultBranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#caseConstant}.
	 * @param ctx the parse tree
	 */
	void enterCaseConstant(subCParser.CaseConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#caseConstant}.
	 * @param ctx the parse tree
	 */
	void exitCaseConstant(subCParser.CaseConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(subCParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(subCParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(subCParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(subCParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#forInitialization}.
	 * @param ctx the parse tree
	 */
	void enterForInitialization(subCParser.ForInitializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#forInitialization}.
	 * @param ctx the parse tree
	 */
	void exitForInitialization(subCParser.ForInitializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(subCParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(subCParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#forIncrementStatement}.
	 * @param ctx the parse tree
	 */
	void enterForIncrementStatement(subCParser.ForIncrementStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#forIncrementStatement}.
	 * @param ctx the parse tree
	 */
	void exitForIncrementStatement(subCParser.ForIncrementStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(subCParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(subCParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#formatString}.
	 * @param ctx the parse tree
	 */
	void enterFormatString(subCParser.FormatStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#formatString}.
	 * @param ctx the parse tree
	 */
	void exitFormatString(subCParser.FormatStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#writeArguments}.
	 * @param ctx the parse tree
	 */
	void enterWriteArguments(subCParser.WriteArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#writeArguments}.
	 * @param ctx the parse tree
	 */
	void exitWriteArguments(subCParser.WriteArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#writeArgument}.
	 * @param ctx the parse tree
	 */
	void enterWriteArgument(subCParser.WriteArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#writeArgument}.
	 * @param ctx the parse tree
	 */
	void exitWriteArgument(subCParser.WriteArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(subCParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(subCParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(subCParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(subCParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(subCParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(subCParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableFactor}
	 * labeled alternative in {@link subCParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterVariableFactor(subCParser.VariableFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableFactor}
	 * labeled alternative in {@link subCParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitVariableFactor(subCParser.VariableFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberFactor}
	 * labeled alternative in {@link subCParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNumberFactor(subCParser.NumberFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberFactor}
	 * labeled alternative in {@link subCParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNumberFactor(subCParser.NumberFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code characterFactor}
	 * labeled alternative in {@link subCParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterCharacterFactor(subCParser.CharacterFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code characterFactor}
	 * labeled alternative in {@link subCParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitCharacterFactor(subCParser.CharacterFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringFactor}
	 * labeled alternative in {@link subCParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterStringFactor(subCParser.StringFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringFactor}
	 * labeled alternative in {@link subCParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitStringFactor(subCParser.StringFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallFactor}
	 * labeled alternative in {@link subCParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallFactor(subCParser.FunctionCallFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallFactor}
	 * labeled alternative in {@link subCParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallFactor(subCParser.FunctionCallFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notFactor}
	 * labeled alternative in {@link subCParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNotFactor(subCParser.NotFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notFactor}
	 * labeled alternative in {@link subCParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNotFactor(subCParser.NotFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedFactor}
	 * labeled alternative in {@link subCParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedFactor(subCParser.ParenthesizedFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedFactor}
	 * labeled alternative in {@link subCParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedFactor(subCParser.ParenthesizedFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(subCParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(subCParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(subCParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(subCParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(subCParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(subCParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(subCParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(subCParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(subCParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(subCParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(subCParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(subCParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedNumber(subCParser.UnsignedNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedNumber(subCParser.UnsignedNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#integerConstant}.
	 * @param ctx the parse tree
	 */
	void enterIntegerConstant(subCParser.IntegerConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#integerConstant}.
	 * @param ctx the parse tree
	 */
	void exitIntegerConstant(subCParser.IntegerConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#realConstant}.
	 * @param ctx the parse tree
	 */
	void enterRealConstant(subCParser.RealConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#realConstant}.
	 * @param ctx the parse tree
	 */
	void exitRealConstant(subCParser.RealConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#characterConstant}.
	 * @param ctx the parse tree
	 */
	void enterCharacterConstant(subCParser.CharacterConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#characterConstant}.
	 * @param ctx the parse tree
	 */
	void exitCharacterConstant(subCParser.CharacterConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void enterStringConstant(subCParser.StringConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void exitStringConstant(subCParser.StringConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#relOp}.
	 * @param ctx the parse tree
	 */
	void enterRelOp(subCParser.RelOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#relOp}.
	 * @param ctx the parse tree
	 */
	void exitRelOp(subCParser.RelOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#addOp}.
	 * @param ctx the parse tree
	 */
	void enterAddOp(subCParser.AddOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#addOp}.
	 * @param ctx the parse tree
	 */
	void exitAddOp(subCParser.AddOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link subCParser#mulOp}.
	 * @param ctx the parse tree
	 */
	void enterMulOp(subCParser.MulOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link subCParser#mulOp}.
	 * @param ctx the parse tree
	 */
	void exitMulOp(subCParser.MulOpContext ctx);
}