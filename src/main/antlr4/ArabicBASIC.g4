grammar ArabicBASIC;

program: block EOF;
block: statement*;
statement:  COMMENT // shouldn't have EOL because it's a terminal
            | blank // doesn't need EOL
            | simpleAssignment EOL
            | arrayAssignment EOL
            | arrayCreation EOL
            | singleLineConditional //doesn't need EOL because it ends with a statement = already has EOL
            | conditionalBlock EOL
            | forLoop EOL
            | whileLoop EOL
            //| defineSubroutine EOL  sub IDENTIFIER EOL block END SUB
            //| callSubroutine EOL  call IDENTIFIER  needs a new variable type: Function
             | defineSingleLineFunction EOL
             | callFunction EOL
            | print EOL
            | input EOL
            // break EOL  how would Java code know if this is within a specific context?
            ;
simpleAssignment: 'LET' name+=IDENTIFIER (',' name+=IDENTIFIER)* '=' expression; // Sequence with Terminator pattern
arrayAssignment: IDENTIFIER '(' subscript ')' '=' expression; //TODO visitor implementation will check for type consistency in array elements
arrayCreation: 'DIM' IDENTIFIER '(' arraySize ')';
conditionalBlock: 'IF' tests+=booleanExpression 'THEN' EOL block ('ELSE IF' tests+=booleanExpression 'THEN' EOL block)* ('ELSE' EOL block)? 'END IF'; //multiline is mandatory here
singleLineConditional: 'IF' booleanExpression 'THEN' statement;
forLoop: 'FOR' control=IDENTIFIER '=' lower=INTEGER 'TO' upper=INTEGER ('STEP' '=' step=INTEGER)? EOL block 'NEXT';
whileLoop: 'WHILE' test=booleanExpression EOL block  ('END WHILE' | 'WEND');
defineSingleLineFunction: 'DEF' 'FN' funcName=IDENTIFIER'(' arg=variable ')' '=' expression; //DEF FN cube(a) = a^3
callFunction: 'CALL' funcName=IDENTIFIER'(' variable ')' ; //this looks too much like arrayAccess!
print: 'PRINT' expression (spacer+=(',' | ';') expression)*;
input: 'INPUT' (prompt=STRING (spacer=(',' | ';')))? var+=IDENTIFIER (',' var+=IDENTIFIER)*;
blank: WS* EOL;
expression: // List the rules from highest -> lowest precedence
            // Put built-in function matches here BEFORE identifier to take advantage of first-match
            name=('ABS' | 'COS' | 'SIN' | 'TAN' | 'LOG' | 'EXP' | 'INT' | 'SQR' | 'RND') '(' expression ')'  #mathFunction
            | name=('LEFT' | 'RIGHT' | 'MID' | 'LEN' | 'CHR' | 'ORD') '(' arg+=variable (',' arg+=variable)? ')' #stringFunction
            | IDENTIFIER '(' subscript ')'              #arrayAccess
            | '-' expression                            #unary
            | <assoc=right>expression'^' expression     #exponentation
            | expression op='MOD' expression            #modulus
            | expression op=('*' | '/') expression      #mulDiv
            | expression op=('+' | '-') expression      #addSub
            | callFunction                              #functionCall
            //TODO get rid of  "Variable" = too many layers of abstraction
            | variable                                  #term
            | '(' expression ')'                        #nested
            ;
subscript:  INTEGER
            | IDENTIFIER
            ;
// expression's left recursion will break if I put "expression" here...
arraySize: INTEGER; //can expand it from Integer --> Expression(Numerical), maybe catch string "size" in the parser.
booleanExpression: // does not support "expression" in the terms because of left recursion?
             booleanExpression comp=('>' | '<' | '<='| '>='| '='| '<>') booleanExpression   #comparitiveBoolean
            | 'NOT' booleanExpression                                                       #negatingBoolean
            | booleanExpression 'AND' booleanExpression                                     #logicalAnd
            | booleanExpression 'OR' booleanExpression                                      #logicalOr
            | variable                                                                      #atomicBoolean   //variable: "Like in C, any non-zero value is interpreted as True"
            | '(' booleanExpression ')'                                                     #nestedBoolean
            ;
variable: IDENTIFIER        #name
        | (INTEGER | REAL)  #numeric
        | STRING            #text
        ;
COMMENT: ('//' | 'REM') ~[\r\n]* EOL -> channel(HIDDEN);
STRING: '"' (~'"'|'\\"')* '"';
IDENTIFIER: [A-Z]+ [A-Z0-9_]*; //TODO replace with Arabic UNICODE after Latin script testing
REAL:  DIGIT [.,] DIGIT+;
INTEGER: '0' | [1-9] DIGIT*; //TODO replace with Arabic UNICODE //'-'?
//MUL: '*';
//DIV: '/';
//ADD: '+';
//SUB: '-';
//BOOL_AND: 'AND'; //define tokens so I can check their type later
//BOOL_OR: 'OR';
//ELSE: 'ELSE';
//ELSE_IF: 'ELSE IF';
EOL: ('\r'? '\n' | '\u2028'); // end of statement marker
WS: [ \t] -> skip; //TODO replace with unicode whitespace class minus NEWLINE
fragment DIGIT : [0-9] ; // fragment is not a token itself, but a non-atomic component of tokens
fragment LETTER: [a-zA-Z];
