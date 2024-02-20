lexer grammar PlayPlusWords;

// Comments -> ignored
COMMENTAIRES: ('/*' (.*?) '*/' | '//' .*? '\r'? '\n' | '//' .*? '\r'? EOF) -> skip;

// Newlines
NEWLINE: '\r'?'\n' -> skip;

// Whitespaces
WS: [ \t\r\n] -> skip;

// Words
AS:'as';
AMPERSTAND:'&';
AND:'and';
BAREL:'T';
BOOLEAN:'boolean';
BRIDGE:'A';
BUSH:'B';
CHAR:'char';
CONST:'const';
DIG:'dig';
DO:'do';
DOWN:'down';
ELSE:'else';
EMPTY:'_';
END:'end';
ENUM:'enum';
FALSE:'false';
FIGHT:'fight';
FOR:'for';
FUNCTION:'function';
GRASS:'G';
IF:'if';
IMPORT:'#'[ \t\r\n]*'import';
INTEGER:'integer';
JUMP:'jump';
LEFT:'left';
MAIN:'main';
MAP:'map';
FILENAME:'"'LETTRE(CHIFFRE|LETTRE)*'.map"';
NOT:'not';
OR:'or';
PALM:'P';
RECORD:'record';
REPEAT:'repeat';
RIGHT:'right';
ROBOT: '@';
SKULL:'Q';
THEN:'then';
TREASURE:'X';
TO:'to';
TRUE:'true';
UP:'up';
UNTIL:'until';
VOID:'void';
WELL:'S';
WHILE:'while';

//signs
ASSIGN:(':=');
SMALEQ:'<=';
BIGGEQ:'>=';
DIFFERENT:'<>';
BIGGER:'>';
SMALLER:'<';
BY:'/';
TIME:'*';
PERCENT:'%';
MINUS:'-';
PLUS:'+';
EQUAL:'=';
LBRACKET:'[';
RBRACKET:']';
LPAR:'(';
RPAR:')';
BACKSLASH:'\\';
DQUOTE:'"';
QUOTE:'\'';
COLON:':';
COMMA:',';
DOT:'.';
SEMICOLON:';';

// Identifiers
fragment LETTRE: 'A'..'Z' | 'a'..'z' ;
fragment CHIFFRE: '0'..'9' ;
ENTIER: (CHIFFRE)+;
ID: LETTRE (LETTRE|CHIFFRE)* ;
CHARACTER: QUOTE (CHIFFRE | LETTRE | COLON | DOT | AMPERSTAND | BACKSLASH | BY | SEMICOLON)? QUOTE;
STRING: '"'(~[\\,\r\n])+'"';