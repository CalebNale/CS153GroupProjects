// Generated from C:/Users/Neil Majumdar/Downloads/Final\SubC.g4 by ANTLR 4.8

    package antlr4;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link antlr4.SubCParser}.
 */
public interface SubCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(antlr4.SubCParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(antlr4.SubCParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#programHeader}.
	 * @param ctx the parse tree
	 */
	void enterProgramHeader(antlr4.SubCParser.ProgramHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#programHeader}.
	 * @param ctx the parse tree
	 */
	void exitProgramHeader(antlr4.SubCParser.ProgramHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#programIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterProgramIdentifier(antlr4.SubCParser.ProgramIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#programIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitProgramIdentifier(antlr4.SubCParser.ProgramIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#mainProgram}.
	 * @param ctx the parse tree
	 */
	void enterMainProgram(antlr4.SubCParser.MainProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#mainProgram}.
	 * @param ctx the parse tree
	 */
	void exitMainProgram(antlr4.SubCParser.MainProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(antlr4.SubCParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(antlr4.SubCParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#functionDefinitions}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinitions(antlr4.SubCParser.FunctionDefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#functionDefinitions}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinitions(antlr4.SubCParser.FunctionDefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(antlr4.SubCParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(antlr4.SubCParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(antlr4.SubCParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(antlr4.SubCParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(antlr4.SubCParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(antlr4.SubCParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#parameterIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterParameterIdentifier(antlr4.SubCParser.ParameterIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#parameterIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitParameterIdentifier(antlr4.SubCParser.ParameterIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallStatement(antlr4.SubCParser.FunctionCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallStatement(antlr4.SubCParser.FunctionCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(antlr4.SubCParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(antlr4.SubCParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(antlr4.SubCParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(antlr4.SubCParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(antlr4.SubCParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(antlr4.SubCParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(antlr4.SubCParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(antlr4.SubCParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(antlr4.SubCParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(antlr4.SubCParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(antlr4.SubCParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(antlr4.SubCParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(antlr4.SubCParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(antlr4.SubCParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStatement(antlr4.SubCParser.DeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStatement(antlr4.SubCParser.DeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(antlr4.SubCParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(antlr4.SubCParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#lhs}.
	 * @param ctx the parse tree
	 */
	void enterLhs(antlr4.SubCParser.LhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#lhs}.
	 * @param ctx the parse tree
	 */
	void exitLhs(antlr4.SubCParser.LhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#rhs}.
	 * @param ctx the parse tree
	 */
	void enterRhs(antlr4.SubCParser.RhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#rhs}.
	 * @param ctx the parse tree
	 */
	void exitRhs(antlr4.SubCParser.RhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(antlr4.SubCParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(antlr4.SubCParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#trueStatement}.
	 * @param ctx the parse tree
	 */
	void enterTrueStatement(antlr4.SubCParser.TrueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#trueStatement}.
	 * @param ctx the parse tree
	 */
	void exitTrueStatement(antlr4.SubCParser.TrueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#falseStatement}.
	 * @param ctx the parse tree
	 */
	void enterFalseStatement(antlr4.SubCParser.FalseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#falseStatement}.
	 * @param ctx the parse tree
	 */
	void exitFalseStatement(antlr4.SubCParser.FalseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(antlr4.SubCParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(antlr4.SubCParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#switchBranchList}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBranchList(antlr4.SubCParser.SwitchBranchListContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#switchBranchList}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBranchList(antlr4.SubCParser.SwitchBranchListContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#caseBranch}.
	 * @param ctx the parse tree
	 */
	void enterCaseBranch(antlr4.SubCParser.CaseBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#caseBranch}.
	 * @param ctx the parse tree
	 */
	void exitCaseBranch(antlr4.SubCParser.CaseBranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#caseConstantList}.
	 * @param ctx the parse tree
	 */
	void enterCaseConstantList(antlr4.SubCParser.CaseConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#caseConstantList}.
	 * @param ctx the parse tree
	 */
	void exitCaseConstantList(antlr4.SubCParser.CaseConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#caseCompound}.
	 * @param ctx the parse tree
	 */
	void enterCaseCompound(antlr4.SubCParser.CaseCompoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#caseCompound}.
	 * @param ctx the parse tree
	 */
	void exitCaseCompound(antlr4.SubCParser.CaseCompoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#defaultBranch}.
	 * @param ctx the parse tree
	 */
	void enterDefaultBranch(antlr4.SubCParser.DefaultBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#defaultBranch}.
	 * @param ctx the parse tree
	 */
	void exitDefaultBranch(antlr4.SubCParser.DefaultBranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#caseConstant}.
	 * @param ctx the parse tree
	 */
	void enterCaseConstant(antlr4.SubCParser.CaseConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#caseConstant}.
	 * @param ctx the parse tree
	 */
	void exitCaseConstant(antlr4.SubCParser.CaseConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(antlr4.SubCParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(antlr4.SubCParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(antlr4.SubCParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(antlr4.SubCParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#forInitialization}.
	 * @param ctx the parse tree
	 */
	void enterForInitialization(antlr4.SubCParser.ForInitializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#forInitialization}.
	 * @param ctx the parse tree
	 */
	void exitForInitialization(antlr4.SubCParser.ForInitializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(antlr4.SubCParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(antlr4.SubCParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#forIncrementStatement}.
	 * @param ctx the parse tree
	 */
	void enterForIncrementStatement(antlr4.SubCParser.ForIncrementStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#forIncrementStatement}.
	 * @param ctx the parse tree
	 */
	void exitForIncrementStatement(antlr4.SubCParser.ForIncrementStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(antlr4.SubCParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(antlr4.SubCParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#formatString}.
	 * @param ctx the parse tree
	 */
	void enterFormatString(antlr4.SubCParser.FormatStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#formatString}.
	 * @param ctx the parse tree
	 */
	void exitFormatString(antlr4.SubCParser.FormatStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#writeArguments}.
	 * @param ctx the parse tree
	 */
	void enterWriteArguments(antlr4.SubCParser.WriteArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#writeArguments}.
	 * @param ctx the parse tree
	 */
	void exitWriteArguments(antlr4.SubCParser.WriteArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#writeArgument}.
	 * @param ctx the parse tree
	 */
	void enterWriteArgument(antlr4.SubCParser.WriteArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#writeArgument}.
	 * @param ctx the parse tree
	 */
	void exitWriteArgument(antlr4.SubCParser.WriteArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(antlr4.SubCParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(antlr4.SubCParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(antlr4.SubCParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(antlr4.SubCParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(antlr4.SubCParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(antlr4.SubCParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableFactor}
	 * labeled alternative in {@link antlr4.SubCParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterVariableFactor(antlr4.SubCParser.VariableFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableFactor}
	 * labeled alternative in {@link antlr4.SubCParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitVariableFactor(antlr4.SubCParser.VariableFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberFactor}
	 * labeled alternative in {@link antlr4.SubCParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNumberFactor(antlr4.SubCParser.NumberFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberFactor}
	 * labeled alternative in {@link antlr4.SubCParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNumberFactor(antlr4.SubCParser.NumberFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code characterFactor}
	 * labeled alternative in {@link antlr4.SubCParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterCharacterFactor(antlr4.SubCParser.CharacterFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code characterFactor}
	 * labeled alternative in {@link antlr4.SubCParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitCharacterFactor(antlr4.SubCParser.CharacterFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringFactor}
	 * labeled alternative in {@link antlr4.SubCParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterStringFactor(antlr4.SubCParser.StringFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringFactor}
	 * labeled alternative in {@link antlr4.SubCParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitStringFactor(antlr4.SubCParser.StringFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallFactor}
	 * labeled alternative in {@link antlr4.SubCParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallFactor(antlr4.SubCParser.FunctionCallFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallFactor}
	 * labeled alternative in {@link antlr4.SubCParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallFactor(antlr4.SubCParser.FunctionCallFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notFactor}
	 * labeled alternative in {@link antlr4.SubCParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNotFactor(antlr4.SubCParser.NotFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notFactor}
	 * labeled alternative in {@link antlr4.SubCParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNotFactor(antlr4.SubCParser.NotFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedFactor}
	 * labeled alternative in {@link antlr4.SubCParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedFactor(antlr4.SubCParser.ParenthesizedFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedFactor}
	 * labeled alternative in {@link antlr4.SubCParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedFactor(antlr4.SubCParser.ParenthesizedFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#variableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableIdentifier(antlr4.SubCParser.VariableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#variableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableIdentifier(antlr4.SubCParser.VariableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(antlr4.SubCParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(antlr4.SubCParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(antlr4.SubCParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(antlr4.SubCParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(antlr4.SubCParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(antlr4.SubCParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(antlr4.SubCParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(antlr4.SubCParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedNumber(antlr4.SubCParser.UnsignedNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedNumber(antlr4.SubCParser.UnsignedNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#integerConstant}.
	 * @param ctx the parse tree
	 */
	void enterIntegerConstant(antlr4.SubCParser.IntegerConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#integerConstant}.
	 * @param ctx the parse tree
	 */
	void exitIntegerConstant(antlr4.SubCParser.IntegerConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#realConstant}.
	 * @param ctx the parse tree
	 */
	void enterRealConstant(antlr4.SubCParser.RealConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#realConstant}.
	 * @param ctx the parse tree
	 */
	void exitRealConstant(antlr4.SubCParser.RealConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#characterConstant}.
	 * @param ctx the parse tree
	 */
	void enterCharacterConstant(antlr4.SubCParser.CharacterConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#characterConstant}.
	 * @param ctx the parse tree
	 */
	void exitCharacterConstant(antlr4.SubCParser.CharacterConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void enterStringConstant(antlr4.SubCParser.StringConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void exitStringConstant(antlr4.SubCParser.StringConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#relOp}.
	 * @param ctx the parse tree
	 */
	void enterRelOp(antlr4.SubCParser.RelOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#relOp}.
	 * @param ctx the parse tree
	 */
	void exitRelOp(antlr4.SubCParser.RelOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#addOp}.
	 * @param ctx the parse tree
	 */
	void enterAddOp(antlr4.SubCParser.AddOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#addOp}.
	 * @param ctx the parse tree
	 */
	void exitAddOp(antlr4.SubCParser.AddOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlr4.SubCParser#mulOp}.
	 * @param ctx the parse tree
	 */
	void enterMulOp(antlr4.SubCParser.MulOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlr4.SubCParser#mulOp}.
	 * @param ctx the parse tree
	 */
	void exitMulOp(SubCParser.MulOpContext ctx);
}