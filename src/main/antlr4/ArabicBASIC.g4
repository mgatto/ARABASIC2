grammar ArabicBASIC;

@header {
package com.lisantra.arabicbasic;
}

program: block EOF;
block: statement*;
statement:
	COMMENT // shouldn't have EOL because it's a terminal
	| blank // doesn't need EOL
	| simpleAssignment EOL
	| arrayAssignment EOL
	| singleLineConditional //doesn't need EOL because it ends with a statement = already has EOL
	| conditionalBlock EOL
	| forLoop EOL
	| whileLoop EOL
	| defineSingleLineFunction EOL
	| callFunction EOL
	| print EOL
	| input EOL;
simpleAssignment:
	'صار' name += IDENTIFIER (COMMA name += IDENTIFIER)* '=' expression;
// Sequence with Terminator pattern
arrayAssignment: IDENTIFIER '[' subscript ']' '=' expression;
// accept taa marbuta/haa drift in array factory keyword.
arrayCreation: ('مصفوفة' | 'مصفوفه') '(' arraySize ')';
conditionalBlock:
	// tolerate hamza spelling variants in IF / ELSE IF forms.
	('اذا' | 'إذا') tests += booleanExpression 'ثم' EOL block (
		('وإلا اذا' | 'وإلا إذا') tests += booleanExpression 'ثم' EOL block
	)* ('وإلا' EOL block)? 'ختام اذا';
// tolerate hamza spelling variants in single-line IF.
singleLineConditional: ('اذا' | 'إذا') booleanExpression 'ثم' statement;
//Allow expressions for upper bound at least?
forLoop:
	'لكل' control = IDENTIFIER '=' lower = INTEGER 'حتى' upper = expression (
		'درجة' '=' step = INTEGER
	)? EOL block next = IDENTIFIER 'التالي';
whileLoop:
	'طالما' test = booleanExpression EOL block 'ختام طالما';
// حدِّد might be better! used in qalb
defineSingleLineFunction:
	// V1 alias: accept both دالّة and دالة spellings.
	('دالّة' | 'دالة') funcName = IDENTIFIER '(' arg = variable ')' '=' expression;
//DEF FN cube(a) = a^3
callFunction:
	// V1 alias: imperative verb accepts hamza/no-hamza forms.
	('اجري' | 'إجري') funcName = IDENTIFIER '(' variable ')';
//this looks too much like arrayAccess!
print:
	// V1 alias: imperative verb accepts hamza/no-hamza forms.
	('اطبع' | 'إطبع') expression (
		spacer += (COMMA | ';' | '\u061B') expression
	)*;
input:
	// V1 alias: imperative verb accepts hamza/no-hamza forms.
	('ادخل' | 'أدخل') (
		prompt = STRING (spacer = (COMMA | ';' | '\u061B'))
	)? var += IDENTIFIER (COMMA var += IDENTIFIER)*;
blank: WS* EOL;
expression: // List the rules from highest -> lowest precedence
	// Put built-in function matches here BEFORE identifier to take advantage of first-match
	name = (
		'ABS'
		| 'COS'
		| 'SIN'
		| 'TAN'
		| 'LOG'
		| 'EXP'
		| 'INT'
		| 'SQR'
		| 'RND'
	) '(' expression ')' # mathFunction
	| name = ('LEFT' | 'RIGHT' | 'MID' | 'LEN' | 'CHR' | 'ORD') '(' arg += variable (
		COMMA arg += variable
	)? ')'				# stringFunction
	| 'مكدس' '(' ')'	# stackFactory
	// stack imperative verbs accept hamza/no-hamza forms.
	| ('ادفع' | 'إدفع') '(' stack = variable (
		COMMA value = expression
	) ')'											# stackPushFunction
	| ('اسحب' | 'إسحب') '(' stack = variable ')'	# stackPopFunction
	| ('انظر' | 'أنظر') '(' stack = variable ')'	# stackPeekFunction
	| 'فارغ؟' '(' stack = variable ')'				# stackEmptyFunction
	| IDENTIFIER '[' subscript ']'					# arrayAccess
	| '-' expression								# unary
	| <assoc = right>expression '^' expression		# exponentation
	| expression op = 'MOD' expression				# modulus
	| expression op = ('*' | '/') expression		# mulDiv
	| expression op = ('+' | '-') expression		# addSub
	| arrayCreation									# arrayFactory
	| callFunction									# functionCall
	//TODO get rid of  "Variable" = too many layers of abstraction
	| variable				# term
	| '(' expression ')'	# nested;
subscript: INTEGER | IDENTIFIER;
// expression's left recursion will break if I put "expression" here...
arraySize: expression;
//can expand it from Integer --> Expression(Numerical), maybe catch string "size" in the parser.
booleanExpression: // does not support "expression" in the terms because of left recursion?
	booleanExpression comp = (
		'>'
		| '<'
		| '<='
		| '>='
		| '='
		| '<>'
	) booleanExpression # comparitiveBoolean
	//جزم
	| 'ليس' booleanExpression # negatingBoolean
	//  و   ضرب
	| booleanExpression 'ايضاً' booleanExpression # logicalAnd
	//او جمع allow OR spelling variants commonly typed by Arabic users.
	| booleanExpression ('ام' | 'او' | 'أو') booleanExpression	# logicalOr
	| expression												# expressionBoolean
	| variable													# atomicBoolean //variable: "Like in C, any non-zero value is interpreted as True"
	| '(' booleanExpression ')'									# nestedBoolean;
variable:
	IDENTIFIER			# name
	| (INTEGER | REAL)	# numeric
	| STRING			# text
	| ('صحيح' | 'خطأ')	# bool;
COMMENT: '//' ~[\r\n]* EOL -> channel(HIDDEN);
STRING: '"' (~'"' | '\\"')* '"';
// Arabic-script letters used across Arabic/Persian/Urdu (letters only; punctuation excluded).
fragment ARABIC_LETTER:
	[\u0621-\u063A\u0641-\u064A\u066E-\u066F\u0671-\u06D3\u06D5\u06EE-\u06EF\u06FA-\u06FC\u06FF];
// Arabic combining marks/diacritics.
fragment ARABIC_MARK:
	[\u064B-\u065F\u0670\u06D6-\u06ED\u08D3-\u08E1\u08E3-\u08FF];
// Join controls (not whitespace): ZWNJ, ZWJ.
fragment JOIN_CONTROL: [\u200C\u200D];
// Western + Arabic-Indic + Eastern Arabic-Indic digits.
fragment ID_DIGIT: [0-9\u0660-\u0669\u06F0-\u06F9];
// Start with an Arabic-script letter, then allow letters/marks/digits/_/tatweel which is \u0640
IDENTIFIER:
	ARABIC_LETTER (
		ARABIC_LETTER
		| ARABIC_MARK
		| JOIN_CONTROL
		| ID_DIGIT
		| '_'
		| '\u0640'
	)*;
COMMA: [,\u060C];
// Arabic and ASCII commas are both accepted for argument/identifier lists.
REAL: DIGIT [.,\u060C\u066B] DIGIT+;
//Western Arabic numbers are increasingly in use throughout the Arabic-speaking world.
INTEGER: [0\u0660] | [1-9\u0661-\u0669] DIGIT*;
EOL:
	// Extended Unicode line separators improve copy/paste robustness.
	'\r\n'
	| '\n'
	| '\r'
	| '\u0085' // NEL
	| '\u2028' // Line Separator
	| '\u2029'; // Paragraph Separator
WS:
	// Unicode-aware whitespace skipping (excluding line terminators handled by EOL).
	[\u0009\u000B\u000C\u0020\u00A0\u1680\u2000-\u200A\u202F\u205F\u3000]+ -> skip;
// Optional: tolerate BOM if present in source files.
BOM: '\uFEFF' -> skip;
// fragments are not token themselves, but non-atomic components of tokens
fragment DIGIT: [0-9\u0660-\u0669];
//wierdly, this will allow intermixing, when I really want Western OR Eastern Arabic numbers