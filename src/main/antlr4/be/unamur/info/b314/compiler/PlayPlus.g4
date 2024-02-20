grammar PlayPlus;

import PlayPlusWords;

root: (programme | gameMap) EOF?;
gameMap:
    MAP COLON ENTIER ENTIER
    mapElement+
    ;
mapElement: ROBOT | TREASURE | GRASS | PALM | BRIDGE | BUSH | BAREL | WELL | EMPTY | SKULL ;
programme: impDecl (varDecl | fctDecl | constDecl | enumDecl | type)*
    MAIN AS FUNCTION LPAR RPAR COLON VOID
    DO
    (DIG LPAR RPAR | (instruction)+)
    END
    ;
impDecl: IMPORT fileDecl;
fileDecl: FILENAME;
fctDecl: ID AS FUNCTION LPAR (arglist)? RPAR COLON (scalar | VOID)
    DO
    (instBlock)+
    END
    ;
arglist: typeSubDecl (COMMA typeSubDecl)*;
typeSubDecl: ID (COMMA ID)* AS type;
instBlock:(varDecl | enumDecl | constDecl | structure)* (instruction)+;
ifBlock: (instruction)+;
elseBlock: (instruction)+;
instruction:
      IF LPAR exprD RPAR THEN ifBlock END                            # IfInstruction
    | IF LPAR exprD RPAR THEN ifBlock ELSE elseBlock END        # IfElseInstruction
    | WHILE LPAR exprD RPAR DO (instruction)+ END                           # WhileInstruction
    | REPEAT (instruction)+ UNTIL LPAR exprD RPAR END                       # RepeatInstruction
    | FOR ID ASSIGN exprD TO exprD DO (instruction)+ END                    # ForInstruction
    | exprG ASSIGN exprD SEMICOLON                                          # AssignationInstruction
    | actionType SEMICOLON                                                  # ActionCallInstruction
    | ID LPAR (ID (COMMA ID)*)? RPAR SEMICOLON                              # FunctionCallInstruction                       // pour les instructions déclarée préalablement
    ;
actionType:
      LEFT LPAR (exprD)? RPAR
    | RIGHT LPAR (exprD)? RPAR
    | UP LPAR (exprD)? RPAR
    | DOWN LPAR (exprD)? RPAR
    | JUMP LPAR (exprD)? RPAR
    | FIGHT LPAR RPAR
    | DIG LPAR RPAR
    ;
exprG:
      ID                                                                    # ExprGId
    | ID LBRACKET exprD (COMMA exprD)? RBRACKET                             # ExprGArray
    | ID DOT (ID | ID LBRACKET exprD (COMMA exprD)? RBRACKET)               # ExprGRecordCall
    ;
exprD:
      exprG     # ExprDExprG
    | TRUE      # ExprDTrue
    | FALSE     # ExprDFalse
    | ENTIER    # ExprDEntier
    | STRING    # ExprDString
    | ID        # ExprDId
    | character # ExprDCharacter
    | LPAR exprD RPAR       # ExprDPar
    | left=exprD operator=TIME right=exprD      # ExprDMultiplication
    | left=exprD operator=BY right=exprD        # ExprDDivision
    | left=exprD operator=PERCENT right=exprD   # ExprDModulo
    | left=exprD operator=PLUS right=exprD      # ExprDAddition
    | left=exprD operator=MINUS right=exprD     # ExprDSubstraction
    | MINUS exprD           # MinusExprD
    | exprD EQUAL exprD     # ExprDEqual
    | exprD DIFFERENT exprD # ExprDDifferent
    | exprD BIGGER exprD    # ExprDBigger
    | exprD SMALLER exprD   # ExprDSmaller
    | exprD BIGGEQ exprD    # ExprDBiggeq
    | exprD SMALEQ exprD    # ExprDSmaleq
    | exprD AND exprD   # ExprDAnd
    | exprD OR exprD    # ExprDOr
    | NOT exprD             # NotExprD

    | ID LBRACKET exprD (COMMA exprD)* RBRACKET     # ExprDArray
    | ID LPAR (exprD (COMMA exprD)*)? RPAR          # ExprDFunctionCall
    ;

enumDecl: ENUM ID EQUAL LPAR ID (COMMA ID)* RPAR SEMICOLON ;
constDecl: CONST ID AS type EQUAL initVariable SEMICOLON ; //Assignation
varDecl : typeSubDecl (EQUAL initVariable)? SEMICOLON; //Assignation
initVariable: exprD | initArrays;
initArrays: LPAR (initVariable (COMMA initVariable)*)? RPAR; //Assignation
type: scalar | array | structure;
scalar: BOOLEAN | INTEGER | CHAR;
array: scalar LBRACKET ENTIER (COMMA ENTIER)? RBRACKET;
structure: RECORD (varDecl)+ END;
character: CHARACTER;