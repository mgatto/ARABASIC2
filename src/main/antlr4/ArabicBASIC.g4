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
            | defineSingleLineFunction EOL
            | callFunction EOL
            | print EOL
            | input EOL
            ;
simpleAssignment: 'صار' name+=IDENTIFIER ((',' | '\u060C') name+=IDENTIFIER)* '=' expression; // Sequence with Terminator pattern
arrayAssignment: IDENTIFIER '(' subscript ')' '=' expression;
arrayCreation: 'مصفوفة' IDENTIFIER '(' arraySize ')';
conditionalBlock: 'اذا' tests+=booleanExpression 'ثم' EOL block ('وإلا اذا' tests+=booleanExpression 'ثم' EOL block)* ('وإلا' EOL block)? 'نهاية اذا';
singleLineConditional: 'اذا' booleanExpression 'ثم' statement;
//Allow expressions for upper bound at least?
forLoop: 'لكل' control=IDENTIFIER '=' lower=INTEGER 'حتى' upper=expression ('درجة' '=' step=INTEGER)? EOL block 'التالي';
whileLoop: 'في إثنأ' test=booleanExpression EOL block  'نهاية في إثنأ';
// حدِّد might be better! used in qalb
defineSingleLineFunction: 'عرّف' 'وظيفة' funcName=IDENTIFIER'(' arg=variable ')' '=' expression; //DEF FN cube(a) = a^3
callFunction: 'اجري' funcName=IDENTIFIER'(' variable ')'; //this looks too much like arrayAccess!
print: 'اطبع' expression (spacer+=(',' | '\u060C') expression)*;
input: 'ادخل' (prompt=STRING (spacer=(',' | ';' | '\u061B' | '\u060C')))? var+=IDENTIFIER ((',' | '\u060C') var+=IDENTIFIER)*;
blank: WS* EOL;
expression: // List the rules from highest -> lowest precedence
            // Put built-in function matches here BEFORE identifier to take advantage of first-match
            name=('ABS' | 'COS' | 'SIN' | 'TAN' | 'LOG' | 'EXP' | 'INT' | 'SQR' | 'RND') '(' expression ')'  #mathFunction
            | name=('LEFT' | 'RIGHT' | 'MID' | 'LEN' | 'CHR' | 'ORD') '(' arg+=variable ((',' | '\u060C') arg+=variable)? ')' #stringFunction
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
arraySize: expression; //can expand it from Integer --> Expression(Numerical), maybe catch string "size" in the parser.
booleanExpression: // does not support "expression" in the terms because of left recursion?
             booleanExpression comp=('>' | '<' | '<='| '>='| '='| '<>') booleanExpression   #comparitiveBoolean
            //جزم
            | 'ليس' booleanExpression                                                       #negatingBoolean
            //  و   ضرب
            | booleanExpression 'ايضاً' booleanExpression                                     #logicalAnd
            //او   جمع
            | booleanExpression 'ام' booleanExpression                                      #logicalOr
            | variable                                                                      #atomicBoolean   //variable: "Like in C, any non-zero value is interpreted as True"
            | '(' booleanExpression ')'                                                     #nestedBoolean
            ;
variable: IDENTIFIER        #name
        | (INTEGER | REAL)  #numeric
        | STRING            #text
        ;
COMMENT: '//' ~[\r\n]* EOL -> channel(HIDDEN);
STRING: '"' (~'"'|'\\"')* '"';
//see U0600.pdf from the unicode consortium:
IDENTIFIER: [\u0622-\u0655]+ [\p{InArabic}_\p{InArabic_Presentation_Forms_B}]*;
REAL:  DIGIT [.,\u060C\u066B] DIGIT+;
//Western Arabic numbers are increasingly in use throughout the Arabic-speaking world.
INTEGER: [0\u0660] | [1-9\u0661-\u0669] DIGIT*;
EOL: ('\r'? '\n' | '\u2028'); // end of statement marker
WS: [ \t] -> skip; //TODO replace with unicode whitespace class minus NEWLINE
// fragments are not token themselves, but non-atomic components of tokens
fragment DIGIT : [0-9\u0660-\u0669];
//wierdly, this will allow intermixing, when I really want Western OR Eastern Arabic numbers
