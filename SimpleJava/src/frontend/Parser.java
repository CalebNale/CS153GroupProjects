/**
 * Parser class for a simple interpreter.
 * 
 * (c) 2020 by Ronald Mak
 * Department of Computer Science
 * San Jose State University
 */
package frontend;

import java.util.HashSet;

import intermediate.*;


import static frontend.Token.TokenType.*;
import static frontend.Token.TokenType.OR;
import static intermediate.Node.NodeType.*;
import static intermediate.Node.NodeType.IF;
import static intermediate.Node.NodeType.NOT;

public class Parser
{
    private Scanner scanner;
    private Symtab symtab;
    private Token currentToken;
    private int lineNumber;
    private int errorCount;
    
    public Parser(Scanner scanner, Symtab symtab)
    {
        this.scanner = scanner;
        this.symtab  = symtab;
        this.currentToken = null;
        this.lineNumber = 1;
        this.errorCount = 0;
    }
    
    public int errorCount() { return errorCount; }
    
    public Node parseProgram()
    {
        Node programNode = new Node(Node.NodeType.PROGRAM);
        
        currentToken = scanner.nextToken();  // first token!
        
        if (currentToken.type == Token.TokenType.PROGRAM) 
        {
            currentToken = scanner.nextToken();  // consume PROGRAM
        }
        else syntaxError("Expecting PROGRAM");
        
        if (currentToken.type == IDENTIFIER) 
        {
            String programName = currentToken.text;
            symtab.enter(programName);
            programNode.text = programName;
            
            currentToken = scanner.nextToken();  // consume program name
        }
        else syntaxError("Expecting program name");
        
        if (currentToken.type == SEMICOLON) 
        {
            currentToken = scanner.nextToken();  // consume ;
        }
        else syntaxError("Missing ;");

        if (currentToken.type != BEGIN) syntaxError("Expecting BEGIN");
        
        // The PROGRAM node adopts the COMPOUND tree.
        programNode.adopt(parseCompoundStatement());
        
        if (currentToken.type != PERIOD) syntaxError("Expecting .");
        return programNode;
    }
    
    private static HashSet<Token.TokenType> statementStarters;
    private static HashSet<Token.TokenType> statementFollowers;
    private static HashSet<Token.TokenType> relationalOperators;
    private static HashSet<Token.TokenType> simpleExpressionOperators;
    private static HashSet<Token.TokenType> termOperators;

    static
    {
        statementStarters = new HashSet<Token.TokenType>();
        statementFollowers = new HashSet<Token.TokenType>();
        relationalOperators = new HashSet<Token.TokenType>();
        simpleExpressionOperators = new HashSet<Token.TokenType>();
        termOperators = new HashSet<Token.TokenType>();
        
        // Tokens that can start a statement.
        statementStarters.add(BEGIN);
        statementStarters.add(IDENTIFIER);
        statementStarters.add(REPEAT);
        statementStarters.add(Token.TokenType.WRITE);
        statementStarters.add(Token.TokenType.WRITELN);
        
        // Tokens that can immediately follow a statement.
        statementFollowers.add(SEMICOLON);
        statementFollowers.add(END);
        statementFollowers.add(UNTIL);
        statementFollowers.add(END_OF_FILE);
        
        relationalOperators.add(EQUALS);
        relationalOperators.add(LESS_THAN);
        relationalOperators.add(GREATER_THAN);
        relationalOperators.add(GREATER_THAN_EQUALS);
        relationalOperators.add(LESS_THAN_EQUALS);
        relationalOperators.add(NOT_EQUALS);
        simpleExpressionOperators.add(PLUS);
        simpleExpressionOperators.add(MINUS);
        simpleExpressionOperators.add(OR);
        
        termOperators.add(STAR);
        termOperators.add(SLASH);
        termOperators.add(MOD);
        termOperators.add(Token.TokenType.AND);

    }
    
    private Node parseStatement()
    {
        Node stmtNode = null;
        int savedLineNumber = currentToken.lineNumber;
        lineNumber = savedLineNumber;
        
        switch (currentToken.type)
        {
            case IDENTIFIER : stmtNode = parseAssignmentStatement(); break;
            case BEGIN      : stmtNode = parseCompoundStatement();   break;
            case REPEAT     : stmtNode = parseRepeatStatement();     break;
            case WHILE      : stmtNode = parseWhileStatement();      break;
            case IF         : stmtNode = parseIfStatement();         break;
            case FOR        : stmtNode = parseForStatement();        break;
            case WRITE      : stmtNode = parseWriteStatement();      break;
            case WRITELN    : stmtNode = parseWritelnStatement();    break;
            case SEMICOLON  : stmtNode = null; break;  // empty statement
            
            default : syntaxError("Unexpected token");
        }
        
        if (stmtNode != null) stmtNode.lineNumber = savedLineNumber;
        return stmtNode;
    }
    
    private Node parseAssignmentStatement()
    {
        // The current token should now be the left-hand-side variable name.
        
        Node assignmentNode = new Node(ASSIGN);

        // Enter the variable name into the symbol table
        // if it isn't already in there.
        String variableName = currentToken.text;
        SymtabEntry variableId = symtab.lookup(variableName.toLowerCase());
        if (variableId == null) variableId = symtab.enter(variableName);
    
        // The assignment node adopts the variable node as its first child.
        Node lhsNode  = new Node(VARIABLE);
        lhsNode.text  = variableName;
        lhsNode.entry = variableId;
        assignmentNode.adopt(lhsNode);
        currentToken = scanner.nextToken();  // consume the LHS variable;
        
        if (currentToken.type == COLON_EQUALS) 
        {
            currentToken = scanner.nextToken();  // consume :=
        }
        else syntaxError("Missing :=");
        
        // The assignment node adopts the expression node as its second child.
        Node rhsNode = parseExpression();
        assignmentNode.adopt(rhsNode);
        
        return assignmentNode;
    }
    
    private Node parseCompoundStatement()
    {
        Node compoundNode = new Node(COMPOUND);
        compoundNode.lineNumber = currentToken.lineNumber;
        
        currentToken = scanner.nextToken();  // consume BEGIN
        parseStatementList(compoundNode, END);    
        
        if (currentToken.type == END) 
        {
            currentToken = scanner.nextToken();  // consume END
        }
        else syntaxError("Expecting END");
        
        return compoundNode;
    }
    
    private void parseStatementList(Node parentNode, Token.TokenType terminalType)
    {
        while (   (currentToken.type != terminalType) 
                && (currentToken.type != END_OF_FILE))
        {
            Node stmtNode = parseStatement();
            if (stmtNode != null) parentNode.adopt(stmtNode);
            
            // A semicolon separates statements.
            if (currentToken.type == SEMICOLON)
            {
                while (currentToken.type == SEMICOLON)
                {
                    currentToken = scanner.nextToken();  // consume ;
                }
            }
            else if (statementStarters.contains(currentToken.type))
            {
                syntaxError("Missing ;");
            }
        }
    }

    private Node parseRepeatStatement()
    {
        // The current token should now be REPEAT.
        
        // Create a LOOP node.
        Node loopNode = new Node(LOOP);
        currentToken = scanner.nextToken();  // consume REPEAT
        
        parseStatementList(loopNode, UNTIL);    
        
        if (currentToken.type == UNTIL) 
        {
            // Create a TEST node. It adopts the test expression node.
            Node testNode = new Node(TEST);
            lineNumber = currentToken.lineNumber;
            testNode.lineNumber = lineNumber;
            currentToken = scanner.nextToken();  // consume UNTIL
            
            testNode.adopt(parseExpression());
            
            // The LOOP node adopts the TEST node as its final child.
            loopNode.adopt(testNode);
        }
        else syntaxError("Expecting UNTIL");
        
        return loopNode;
    }

    /**
     *
     * @return loopNode. the node that contains information about the loop for the while statement
     */
    private Node parseWhileStatement()
    {
        // The current token should now be WHILE.

        // Create a LOOP node.
        Node loopNode = new Node(LOOP); // a while loop is in fact, a loop
        lineNumber = currentToken.lineNumber;
        loopNode.lineNumber = lineNumber;
        currentToken = scanner.nextToken();  // consume WHILE
        
        Node testNode = new Node(TEST); // create a new node
        testNode.adopt(parseExpression());  // use testnode to parse the expression the while loop uses
        lineNumber = currentToken.lineNumber;
        testNode.lineNumber = lineNumber;
        loopNode.adopt(testNode);
        
        currentToken = scanner.nextToken();  // consume DO
        if(currentToken.type!= BEGIN){ // if it is just a single line w/o a begin / end
            loopNode.adopt(parseStatement()); // parse the statement that we are doing at the end of the line
        }
        else{ // if it multiple statements in a begin end block
            currentToken = scanner.nextToken();  // consume Begin
            parseStatementList(loopNode, END); // get the statements untill end
            currentToken = scanner.nextToken(); // consume ;
        }

        return loopNode;
    }

    private Node parseForStatement(){

        Node compNode = new Node(FORLOOP); //Root node of FOR loop
        lineNumber = currentToken.lineNumber;
        compNode.lineNumber = lineNumber;
        
        currentToken = scanner.nextToken(); //consume FOR
        
        Node assignNode = parseStatement();  //initial assignment of variable for FOR loop
        lineNumber = currentToken.lineNumber;
        assignNode.lineNumber = lineNumber;
        compNode.adopt(assignNode);
        
        
        Node loopNode = new Node(LOOP);
        lineNumber = currentToken.lineNumber;
        loopNode.lineNumber = lineNumber;

        Node testNode = new Node(TEST);
        Node tChildNode = currentToken.type == TO ? new Node(GT) : new Node(LT); // create new Node GT for TO or LT for DOWNTO
        lineNumber = currentToken.lineNumber;
        tChildNode.lineNumber = lineNumber;
        
        Node variabNode = new Node(VARIABLE);
        variabNode.lineNumber = assignNode.children.get(0).lineNumber;
        variabNode.value = assignNode.children.get(0).entry; //get the same variable as the assignment in for loop
        variabNode.text = assignNode.children.get(0).text;
        tChildNode.adopt(variabNode); //assign the same variable to GT or LT node
        

        currentToken = scanner.nextToken(); //comsume TO
        tChildNode.adopt(parseExpression());

        testNode.adopt(tChildNode);
        loopNode.adopt(testNode);

        currentToken = scanner.nextToken(); //consume DO
        if(currentToken.type != BEGIN){ // if it is just a single line w/o a begin / end
            loopNode.adopt(parseStatement()); // parse the statement that we are doing at the end of the line
        }
        else{ // if it multiple statements in a begin end block
            currentToken = scanner.nextToken();  // consume Begin
            parseStatementList(loopNode, END); // get the statements untill end
            currentToken = scanner.nextToken(); // consume ;
        }

        Node assignNode2 = new Node(ASSIGN);

        Node variabNode2 = new Node(VARIABLE);
        variabNode2.value = assignNode.children.get(0).entry; //get the same variable as the assignment in for loop
        variabNode2.text = assignNode.children.get(0).text;

        assignNode2.adopt(variabNode2);

        Node operationNode = tChildNode.type == GT ? new Node(ADD) : new Node(SUBTRACT);

        Node variabNode3 = new Node(VARIABLE);
        variabNode3.value = assignNode.children.get(0).entry; //get the same variable as the assignment in for loop
        variabNode3.text = assignNode.children.get(0).text;

        Node integerNode = new Node(INTEGER_CONSTANT);
        integerNode.value = (long) 1;
        
        operationNode.adopt(variabNode3);
        operationNode.adopt(integerNode);

        assignNode2.adopt(operationNode);

        loopNode.adopt(assignNode2);

        compNode.adopt(loopNode);
        
        return compNode;
    }
    
    private Node parseIfStatement()
    {
        Node ifNode = new Node(IF); // create IF Node
        currentToken = scanner.nextToken(); // consume IF
        ifNode.adopt(parseExpression()); // adopts expression node following IF
        if(currentToken.type != THEN) // check if THEN is present
            syntaxError("Expecting THEN");
        currentToken = scanner.nextToken(); // consume THEN
        ifNode.adopt(parseStatement()); // adopt statement node following THEN
        if(currentToken.type == ELSE) // check if there is else statement
        {
            currentToken = scanner.nextToken(); // consume ELSE
            ifNode.adopt(parseStatement()); // adopt statement node following ELSE
        }

        return ifNode;
    }

    private Node parseWriteStatement()
    {
        // The current token should now be WRITE.
        
        // Create a WRITE node. It adopts the variable or string node.
        Node writeNode = new Node(Node.NodeType.WRITE);
        currentToken = scanner.nextToken();  // consume WRITE
        
        parseWriteArguments(writeNode);
        if (writeNode.children.size() == 0)
        {
            syntaxError("Invalid WRITE statement");
        }
        
        return writeNode;
    }
    
    private Node parseWritelnStatement()
    {
        // The current token should now be WRITELN.
        
        // Create a WRITELN node. It adopts the variable or string node.
        Node writelnNode = new Node(Node.NodeType.WRITELN);
        currentToken = scanner.nextToken();  // consume WRITELN
        
        if (currentToken.type == LPAREN) parseWriteArguments(writelnNode);
        return writelnNode;
    }
    
    private void parseWriteArguments(Node node)
    {
        // The current token should now be (
        
        boolean hasArgument = false;
        
        if (currentToken.type == LPAREN) 
        {
            currentToken = scanner.nextToken();  // consume (
        }
        else syntaxError("Missing left parenthesis");
        
        if (currentToken.type == IDENTIFIER)
        {
            node.adopt(parseVariable());
            hasArgument = true;
        }
        else if (   (currentToken.type == CHARACTER)
                || (currentToken.type == STRING))
        {
            node.adopt(parseStringConstant());
            hasArgument = true;
        }
        else syntaxError("Invalid WRITE or WRITELN statement");
        
        // Look for a field width and a count of decimal places.
        if (hasArgument)
        {
            if (currentToken.type == COLON) 
            {
                currentToken = scanner.nextToken();  // consume ,
                
                if (currentToken.type == INTEGER)
                {
                    // Field width
                    node.adopt(parseIntegerConstant());
                    
                    if (currentToken.type == COLON) 
                    {
                        currentToken = scanner.nextToken();  // consume ,
                        
                        if (currentToken.type == INTEGER)
                        {
                            // Count of decimal places
                            node.adopt(parseIntegerConstant());
                        }
                        else syntaxError("Invalid count of decimal places");
                    }
                }
                else syntaxError("Invalid field width");
            }
        }
        
        if (currentToken.type == RPAREN) 
        {
            currentToken = scanner.nextToken();  // consume )
        }
        else syntaxError("Missing right parenthesis");
    }

    private Node parseExpression()
    {
        // The current token should now be an identifier or a number.
        
        // The expression's root node.
        Node exprNode = parseSimpleExpression();
        
        // The current token might now be a relational operator.
        if (relationalOperators.contains(currentToken.type))
        {
            Token.TokenType tokenType = currentToken.type;
            Node opNode = tokenType == EQUALS               ? new Node(EQ)
                        : tokenType == LESS_THAN            ? new Node(LT)
                        : tokenType == LESS_THAN_EQUALS     ? new Node(LTE)
                        : tokenType == GREATER_THAN         ? new Node(GT)
                        : tokenType == GREATER_THAN_EQUALS  ? new Node(GTE)
                        : tokenType == NOT_EQUALS           ? new Node(NE)
                        : null;
            
            currentToken = scanner.nextToken();  // consume relational operator
            
            // The relational operator node adopts the first simple expression
            // node as its first child and the second simple expression node
            // as its second child. Then it becomes the expression's root node.
            if (opNode != null)
            {
                opNode.adopt(exprNode);
                opNode.adopt(parseSimpleExpression());
                exprNode = opNode;
            }
        }
        
        return exprNode;
    }
    
    private Node parseSimpleExpression()
    {
        // The current token should now be an identifier or a number.

        // Check for minus sign
        Node minusNode = null;
        if(currentToken.type == MINUS)
        {
            minusNode = new Node(NEGATE);
            currentToken = scanner.nextToken(); // consume minus sign
        }
        // The simple expression's root node.
        Node simpExprNode = parseTerm();

        // if minus is present, simple expression node gets adopted
        if(minusNode != null)
           minusNode.adopt(simpExprNode);
        
        // Keep parsing more terms as long as the current token
        // is a + or - operator.
        while (simpleExpressionOperators.contains(currentToken.type))
        {
            Node opNode = currentToken.type == PLUS ? new Node(ADD)
                    : currentToken.type == MINUS ? new Node(SUBTRACT)
                    : new Node(Node.NodeType.OR);
            
            currentToken = scanner.nextToken();  // consume the operator

            // The add or subtract node adopts the first term node as its
            // first child and the next term node as its second child. 
            // Then it becomes the simple expression's root node.
            opNode.adopt(simpExprNode);
            opNode.adopt(parseTerm());
            simpExprNode = opNode;
        }
        if(minusNode != null) // if minus node exists, return it
            return minusNode;
        return simpExprNode;
    }
    
    private Node parseTerm()
    {
        // The current token should now be an identifier or a number.
        
        // The term's root node.
        Node termNode = parseFactor();
        
        // Keep parsing more factors as long as the current token
        // is a * or / operator.
        while (termOperators.contains(currentToken.type))
        {
            Node opNode = currentToken.type == STAR ? new Node(MULTIPLY)
                        : currentToken.type == SLASH ? new Node(DIVIDE)
                        : currentToken.type == MOD   ? new Node(MODULUS)
                        : new Node(Node.NodeType.AND);

            
            currentToken = scanner.nextToken();  // consume the operator

            // The multiply or dive node adopts the first factor node as its
            // as its first child and the next factor node as its second child. 
            // Then it becomes the term's root node.
            opNode.adopt(termNode);
            opNode.adopt(parseFactor());
            termNode = opNode;
        }
        
        return termNode;
    }
    
    private Node parseFactor()
    {   
        // The current token should now be an identifier or a number or (
        
        if      (currentToken.type == IDENTIFIER) return parseVariable();
        else if (currentToken.type == INTEGER)    return parseIntegerConstant();
        else if (currentToken.type == REAL)       return parseRealConstant();
        else if (currentToken.type == Token.TokenType.NOT) return parseNot();
        else if (currentToken.type == LPAREN)
        {
            currentToken = scanner.nextToken();  // consume (
            Node exprNode = parseExpression();
            
            if (currentToken.type == RPAREN)
            {
                currentToken = scanner.nextToken();  // consume )
            }
            else syntaxError("Expecting )");
            
            return exprNode;
        }
        
        else syntaxError("Unexpected token");
        return null;
    }

    private Node parseNot()
    {
        Node notNode = new Node(NOT); // create NOT node
        currentToken = scanner.nextToken(); // consume not
        notNode.adopt(parseFactor());
        return notNode;
    }
    
    private Node parseVariable()
    {
        // The current token should now be an identifier.

        // Has the variable been "declared"?
        String variableName = currentToken.text;
        SymtabEntry variableId = symtab.lookup(variableName.toLowerCase());
        if (variableId == null) semanticError("Undeclared identifier");

        Node node  = new Node(VARIABLE);
        node.text  = variableName;
        node.entry = variableId;
        
        currentToken = scanner.nextToken();  // consume the identifier        
        return node;
    }

    private Node parseIntegerConstant()
    {
        // The current token should now be a number.
        
        Node integerNode = new Node(INTEGER_CONSTANT);
        integerNode.value = currentToken.value;
        
        currentToken = scanner.nextToken();  // consume the number      
        return integerNode;
    }

    private Node parseRealConstant()
    {
        // The current token should now be a number.
        
        Node realNode = new Node(REAL_CONSTANT);
        realNode.value = currentToken.value;
        
        currentToken = scanner.nextToken();  // consume the number        
        return realNode;
    }
    
    private Node parseStringConstant()
    {
        // The current token should now be CHARACTER or STRING.
        
        Node stringNode = new Node(STRING_CONSTANT);
        stringNode.value = currentToken.value;
        
        currentToken = scanner.nextToken();  // consume the string        
        return stringNode;
    }

    private void syntaxError(String message)
    {
        System.out.println("SYNTAX ERROR at line " + lineNumber 
                           + ": " + message + " at '" + currentToken.text + "'");
        errorCount++;
        
        // Recover by skipping the rest of the statement.
        // Skip to a statement follower token.
        while (! statementFollowers.contains(currentToken.type))
        {
            currentToken = scanner.nextToken();
        }
    }
    
    private void semanticError(String message)
    {
        System.out.println("SEMANTIC ERROR at line " + lineNumber 
                           + ": " + message + " at '" + currentToken.text + "'");
        errorCount++;
    }
}
