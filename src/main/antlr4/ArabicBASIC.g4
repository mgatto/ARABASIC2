grammar ArabicBASIC;

//how to group?  comment?
start: statement+;
statement:  assignment
            | comment //declarative_statement
            | null_statement
            ;
/*statement:  declarative_statement
            | imperative_statement
            | null_statement
            ;
declarative_statement: null_statement;
imperative_statement: assignment;
*/
null_statement: WS* NewLine;

assignment: 'LET' Identifier '=' variable NewLine; //obviously, update later to float and string AND expression

comment: '#' .*?;
variable: Identifier | Integer | String; // | ARRAY;

//yeah, let's enforce some primitive BASIC with line numbers?!

Identifier: [A-Z]+ [A-Z0-9_]*; //TODO replace with Arabic UNICODE after Latin script testing


String: '"' [ a-zA-Z]* '"';  //TODO basically any printable char other than "
Integer: '-'? [1-9]+ [0-9]*; //TODO replace with Arabic UNICODE
Real: Integer '.' Integer;
NewLine: '\r'? '\n' | '\u2028'; // end of statement marker
WS: [ \t] -> skip; //TODO replace with unicode whitespace class minus NEWLINE

//ARRAY:
//INT: [\u06F0-\u06F09]; // Arabic only
//NUMBER : ('0' .. '9') + ('.' ('0' .. '9') +)? ;
//NEWLINE: [\n\r\u2028]; // r = u000A;  b = u000D
//ID : [a-zA-Z] [a-zA-Z0-9]* ; // match usual identifier spec
//UNICODE_ID : [\p{Alpha}\p{General_Category=Other_Letter}] [\p{Alnum}\p{General_Category=Other_Letter}]* ; // match full Unicode alphabetic ids
//UNICODE_WS : [\p{White_Space}] -> skip; // match all Unicode whitespace
