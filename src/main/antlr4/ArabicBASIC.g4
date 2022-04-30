grammar ArabicBASIC;

program: block EOF;
block: statement*;
statement:  COMMENT
            | blank
            | variableAssignment
            | arrayAssignment
            | arrayCreation
//            | print
            ;

//TODO LET is actually a variable declaration
variableAssignment: 'LET' IDENTIFIER '=' expression EOL; // Sequence with Terminator pattern
arrayAssignment: IDENTIFIER '(' arrayIndex ')' '=' expression EOL; //TODO visitor implementation will check for type consistency in array elements
arrayCreation: 'DIM' IDENTIFIER '(' arraySize ')' EOL;
blank: WS* EOL;

// list the rules from highest -> lowest precedence
expression: // left=expression OP1 right=expression
//             arrayExpression                           #arrayCreate |
            IDENTIFIER '(' INTEGER ')'                  #arrayAccess
            | '-' expression                            #unary
            | <assoc=right>expression'^' expression     #exponentation
            | expression op=('*' | '/') expression      #mulDiv
            | expression op=('+' | '-') expression      #addSub
            //sub doesn't go well with negating a number
            //TODO get rid of  "Variable" = too many layers of abstraction
            | variable                                  #term
            // | array_indexing
            | '(' expression ')'                         #nested
            ;
arrayIndex: INTEGER;
arraySize: INTEGER; //can expand it from Integer --> Expression(Numerical), maybe catch string "size" in the parser.
/*arraySize:  INTEGER                             #simpleSize
            | low=INTEGER 'TO' high=INTEGER     #offsetPairSize
            ;
*/
//arrayExpression: 'ARRAY' '(' arraySize ')';
//TODO also accept a range: (2 TO 10) which just sets index offsets;
// here, the array has 9 indices, labeled "2" through "10".
// This would be an excellent use case for Value::attributes

//TODO I'm not sure I can restrict types within the Grammar...
//TODO array initialization as in FreeBASIC
//array_of_strings: '{' String (',' String)* '}';
//array_of_integers: '{'Integer (',' Integer)* '}';
//array_of_floats: '{'Real (',' Real)* '}';

variable: IDENTIFIER        #name
        | (INTEGER | REAL)  #numeric
        | STRING            #text
        ;

COMMENT: ('//' | 'REM') ~[\r\n]* EOL;
//Comment: '#' ~[EOL]+ EOL ;//-> skip; for some reason, this rull really didn't work at all!
IDENTIFIER: [A-Z]+ [A-Z0-9_]*; //TODO replace with Arabic UNICODE after Latin script testing
STRING: '"' [ a-zA-Z]* '"';  //TODO basically any printable char other than "
INTEGER: '0' | [1-9] DIGIT*; //TODO replace with Arabic UNICODE //'-'?
//TODO enforce some int size limit in the parser
REAL:  DIGIT '.' DIGIT+; //'-'?
MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';
EOL: '\r'? '\n' | '\u2028'; // end of statement marker
WS: [ \t] -> skip; //TODO replace with unicode whitespace class minus NEWLINE
fragment DIGIT : [0-9] ; // not a token by itself
fragment LETTER: [a-zA-Z];

//INT: [\u06F0-\u06F09]; // Arabic only
//NUMBER : ('0' .. '9') + ('.' ('0' .. '9') +)? ;
//NEWLINE: [\n\r\u2028]; // r = u000A;  b = u000D
//UNICODE_ID : [\p{Alpha}\p{General_Category=Other_Letter}] [\p{Alnum}\p{General_Category=Other_Letter}]* ; // match full Unicode alphabetic ids
//UNICODE_WS : [\p{White_Space}] -> skip; // match all Unicode whitespace
/*statement:  declarative_statement
            | imperative_statement
            | null_statement
            ;
declarative_statement: null_statement;
imperative_statement: assignment | print | arrayCreation;
*/
