grammar ArabicBASIC;

program: block EOF;
block: statement*;
statement:  COMMENT // doesn't need EOL
            | blank // doesn't need EOL
            | simpleAssignment EOL
            | arrayAssignment EOL
            | arrayCreation EOL
            | conditionalBlock EOL
            ;
simpleAssignment: 'LET' IDENTIFIER '=' expression; // Sequence with Terminator pattern
arrayAssignment: IDENTIFIER '(' subscript ')' '=' expression; //TODO visitor implementation will check for type consistency in array elements
arrayCreation: 'DIM' IDENTIFIER '(' arraySize ')';
conditionalBlock: 'IF' booleanExpression 'THEN' EOL block ('ELSE' EOL block)? 'END IF'; //multiline is mandatory here
blank: WS* EOL;
expression: // list the rules from highest -> lowest precedence
            IDENTIFIER '(' subscript ')'               #arrayAccess
            | '-' expression                            #unary
            | <assoc=right>expression'^' expression     #exponentation
            | expression op=('*' | '/') expression      #mulDiv
            | expression op=('+' | '-') expression      #addSub
            //TODO get rid of  "Variable" = too many layers of abstraction
            | variable                                  #term
            | '(' expression ')'                         #nested
            ;
subscript:  INTEGER
            | IDENTIFIER
            ;
// expression's left recursion will break if I put "expression" here...
arraySize: INTEGER; //can expand it from Integer --> Expression(Numerical), maybe catch string "size" in the parser.
booleanExpression: // does not support "expression" in the terms because of left recursion?
            'NOT' booleanExpression                                                          #negatingBoolean
            | booleanExpression comp=('>' | '<' | '<='| '>='| '='| '<>') booleanExpression   #comparitiveBoolean
            | booleanExpression logic=('AND' | 'OR') booleanExpression                       #logicalBoolean
            | variable                                                                       #atomicBoolean   //variable: "Like in C, any non-zero value is interpreted as True"
            | '(' booleanExpression ')'                                                      #nestedBoolean
            ;
variable: IDENTIFIER        #name
        | (INTEGER | REAL)  #numeric
        | STRING            #text
        ;
COMMENT: ('//' | 'REM') ~[\r\n]* EOL -> channel(HIDDEN);
IDENTIFIER: [A-Z]+ [A-Z0-9_]*; //TODO replace with Arabic UNICODE after Latin script testing
STRING: '"' [ a-zA-Z]* '"';  //TODO basically any printable char other than "
INTEGER: '0' | [1-9] DIGIT*; //TODO replace with Arabic UNICODE //'-'?
REAL:  DIGIT '.' DIGIT+; //'-'?
MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';
BOOL_AND: 'AND'; //define tokens so I can check their type later
BOOL_OR: 'OR';
ELSE: 'ELSE';
ELSE_IF: 'ELSE IF';
EOL: ('\r'? '\n' | '\u2028'); // end of statement marker
WS: [ \t] -> skip; //TODO replace with unicode whitespace class minus NEWLINE
fragment DIGIT : [0-9] ; // fragment is not a token itself, but a non-atomic component of tokens
fragment LETTER: [a-zA-Z];
