grammar ArabicBASIC;

//how to group?
program: block EOF;
statement:  COMMENT //declarative_statement
            | blank
            | assignment
            | array_creation
            ;
assignment: 'LET' IDENTIFIER '=' expression EOL; // Sequence with Terminator pattern
blank: WS* EOL;

//ANTLR4 does left recursion!
// list the rules from highest -> lowest precedence
expression: // left=expression OP1 right=expression
             array_expression                           #arrayCreate
            | array_access                              #arrayAccess
            | '-' expression                            #unary
            | <assoc=right>expression'^' expression     #exponentation
            | expression op=('*' | '/') expression      #mulDiv
            | expression op=('+' | '-') expression      #addSub
            //sub doesn't go well with negating a number
            //TODO get rid of  "Variable" = too many layers of abstraction
            | variable                                  #term
            // | array_indexing
            // | Array_Create | Array_Read ; supercede all these with Expression
            | '(' expression ')'                         #nested
            ;
array_size: INTEGER #size; //can expand it from Integer --> Expression(Numerical), maybe catch string "size" in the parser.
array_creation: 'DIM' IDENTIFIER '(' array_size ')';
array_expression: 'ARRAY' '(' array_size ')';
array_access: IDENTIFIER '(' INTEGER ')';
//TODO I'm not sure I can restrict types within the Grammar...
//array_of_strings: String (',' String)* ;
//array_of_integers: Integer (',' Integer)* ;
//array_of_floats: Real (',' Real)* ;

block: statement*;

variable: IDENTIFIER    #name
        | number        #numeric
        | STRING        #text
        ;
number: INTEGER
        | REAL
        ;
//scientific notation is not implemented
//Assignment_Keyword: 'LET';
//Assignment_Operator: op=('=');
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
//ARRAY:
//INT: [\u06F0-\u06F09]; // Arabic only
//NUMBER : ('0' .. '9') + ('.' ('0' .. '9') +)? ;
//NEWLINE: [\n\r\u2028]; // r = u000A;  b = u000D
//ID : [a-zA-Z] [a-zA-Z0-9]* ; // match usual identifier spec
//UNICODE_ID : [\p{Alpha}\p{General_Category=Other_Letter}] [\p{Alnum}\p{General_Category=Other_Letter}]* ; // match full Unicode alphabetic ids
//UNICODE_WS : [\p{White_Space}] -> skip; // match all Unicode whitespace
/*statement:  declarative_statement
            | imperative_statement
            | null_statement
            ;
declarative_statement: null_statement;
imperative_statement: assignment;
*/
