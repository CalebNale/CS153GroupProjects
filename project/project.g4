grammar project;

@header {
    package antlr4;
    import java.util.HashMap;
    import intermediate.symtab.SymtabEntry;
    import intermediate.type.Typespec;
}

program:  (functionDeclaration | functionDefinition)* INT MAIN '(' parameterList? ')' compoundStatement
            functionDefinition*;


functionName   locals [ SymtabEntry entry = null ]  : IDENTIFIER ;

functionDeclaration: (INT | STRING | CHAR) functionName '(' parameterList? ')' SEMICOLON ;
functionDefinition : (INT | STRING | CHAR) functionName '(' parameterList? ')' compoundStatement ;
parameterList : parameter ( ',' parameter )* ;
parameter : (INT | STRING | CHAR) variable ;

functionCallStatement : functionCall SEMICOLON ;
functionCall : functionName '(' argumentList? ')' ;
argumentList : argument ( ',' argument)* ;
argument     : expression ;

returnStatement: RETURN (expression SEMICOLON | functionCall)? ;

statement : compoundStatement
          | declarationStatement
          | assignmentStatement
          | ifStatement
          | switchStatement
          | whileStatement
          | forStatement
          | printStatement
          | functionCallStatement
          | returnStatement
          ;

statementList       : statement* ;
compoundStatement : '{' statementList '}' ;


declarationStatement: (INT | STRING | CHAR) variable SEMICOLON;
assignmentStatement : (INT | STRING | CHAR)? lhs '=' rhs SEMICOLON 
                    | variable ('++' | '--') SEMICOLON
                    ;
lhs locals [ Typespec type = null ] 
    : variable ;
rhs : expression ;


ifStatement    : IF '(' expression ')' trueStatement (ELSE falseStatement )? ;
trueStatement  : compoundStatement ;
falseStatement : compoundStatement ;


switchStatement
    locals [ HashMap<Integer, PascalParser.StatementContext> jumpTable = null ]
    : SWITCH '(' expression ')' '{' switchBranchList '}' ;
switchBranchList : caseBranch+ defaultBranch?;
caseBranch       : CASE caseConstantList ':' compoundStatement ;
caseConstantList : caseConstant ( ',' caseConstant )* ;
defaultBranch    : 'default' ':' compoundStatement;
caseConstant    locals [ Typespec type = null, int value = 0 ]
    : constant ;


whileStatement  : WHILE '(' expression ')' compoundStatement ;


forStatement : FOR '(' forInitialization forControl forIncrementStatement ')' compoundStatement ;
forInitialization : assignmentStatement;
forControl  : expression SEMICOLON;
forIncrementStatement : lhs '=' rhs
                      | variable ('++' | '--')
                      ;

printStatement   : PRINT '(' formatString (',' writeArguments)? ')' SEMICOLON ;
formatString     : stringConstant;
writeArguments   : writeArgument (',' writeArgument)* ;
writeArgument    : expression ;

expression          locals [ Typespec type = null ] 
    : simpleExpression (relOp simpleExpression)? ;
    
simpleExpression    locals [ Typespec type = null ] 
    : sign? term (addOp term)* ;
    
term                locals [ Typespec type = null ]
    : factor (mulOp factor)* ;

factor              locals [ Typespec type = null ] 
    : variable             # variableFactor
    | number               # numberFactor
    | characterConstant    # characterFactor
    | stringConstant       # stringFactor
    | functionCall         # functionCallFactor
    | NOT factor           # notFactor
    | '(' expression ')'   # parenthesizedFactor
    ;

variable            locals [ Typespec type = null, SymtabEntry entry = null ] 
    : IDENTIFIER ;

constant   locals [ Typespec type = null, Object value = null ]  
    : sign? ( IDENTIFIER | unsignedNumber )
    | characterConstant
    | stringConstant
    ;

sign              : '-' | '+' ;
number            : sign? unsignedNumber ;
unsignedNumber    : integerConstant ;
integerConstant   : INTEGER ;
characterConstant : CHARACTER ;
stringConstant    : STR ;
       
relOp : '==' | '!=' | '<' | '<=' | '>' | '>=' ;
addOp : '+' | '-' | OR ;
mulOp : '*' | '/' | MOD | AND ;

MOD       : '%' ;
AND       : '&&' ;
OR        : '||' ;
NOT       : '!' ;
IF        : 'if' ;
ELSE      : 'else' ;
SWITCH    : 'switch';
WHILE     : 'while' ;
FOR       : 'for' ;
CASE      : 'case';
PRINT     : 'print' ;
FUNCTION  : 'function' ;
INT       : 'int' ;
STRING    : 'string' ;
CHAR      : 'char' ;
MAIN      : 'main';
RETURN    : 'return';

IDENTIFIER : [a-zA-Z][a-zA-Z0-9]* ;
INTEGER    : [0-9]+ ;

NEWLINE : '\r'? '\n' -> skip  ;
WS      : [ \t]+ -> skip ; 

QUOTE     : '\'' ;
CHARACTER : QUOTE CHARACTER_CHAR QUOTE ;
STR    : '"' STRING_CHAR* '"' ;
SEMICOLON : ';' ;

fragment CHARACTER_CHAR : ~('\'')   // any non-quote character
                        ;

fragment STRING_CHAR : ~('"')      // any non-quote character
                     ;

COMMENT : '/*' STRING_CHAR '*/' -> skip ;

                     