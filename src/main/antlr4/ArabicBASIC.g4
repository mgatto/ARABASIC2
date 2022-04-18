grammar ArabicBASIC;

//how to group?
program: statement+ EOF;
statement:  assignment
            | Comment //declarative_statement
            | blank
            ;
assignment: 'LET' Identifier '=' variable EOL;
Comment: '#'  ~[EOL]* -> skip;
blank: WS* EOL;
variable: Identifier    #name
        | Integer       #int
        | Real          #float
        | String        #text
        ; // | Array_Create | Array_Read ; supercede all these with Expression
//number: Integer | Real;
//Assignment_Keyword: 'LET';
//Assignment_Operator: op=('=');
Identifier: [A-Z]+ [A-Z0-9_]*; //TODO replace with Arabic UNICODE after Latin script testing
String: '"' [ a-zA-Z]* '"';  //TODO basically any printable char other than "
Integer: '-'? [1-9]+ DIGIT*; //TODO replace with Arabic UNICODE
Real: Integer '.' Integer;
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
