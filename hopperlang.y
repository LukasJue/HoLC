%{

#include <stdio.h>
extern int tokenvalue;
extern char* tokentext;

%}
%start document
%token NEWLINE NUMBER ASSIGNMENT OPEN_BRACKET CLOSE_BRACKET OPEN_BLOCK CLOSE_BLOCK SIGNAL 
%token SIG_INPUT SIG_OUTPUT SIG_LOCAL AUTOMAT STATE CONDITION NEGATION TRANSITION COMMENT NOTHING
%token AND OR XOR NAME

%%

document	: signal_declaration empty_lines automat_block 
		;

empty_lines : NEWLINE
	    | NEWLINE empty_lines


signal_declaration : SIG_INPUT signal_value
				   | SIG_OUTPUT signal_value signal_declaration
				   | SIG_LOCAL signal_value signal_declaration
				   | SIG_INPUT OPEN_BRACKET signal_value_list CLOSE_BRACKET signal_declaration
				   | SIG_OUTPUT OPEN_BRACKET signal_value_list CLOSE_BRACKET signal_declaration
				   | SIG_LOCAL OPEN_BRACKET signal_value_list CLOSE_BRACKET signal_declaration
				   ;
signal_value_list	: signal_value empty_lines signal_value_list
			| signal_value empty_lines
			;
signal_value : name type NEWLINE;

automat_block : AUTOMAT name OPEN_BLOCK empty_lines state_block_list CLOSE_BLOCK empty_lines;
state_block_list : state_block empty_lines state_block_list
				| empty_lines
				| empty_lines state_block_list
				;
state_block : STATE name OPEN_BLOCK empty_lines state_body CLOSE_BLOCK;
state_body : condition_block
		   | assignment
		   | empty_lines
		   ;
condition_block : CONDITION condition TRANSITION name empty_lines
				 | CONDITION condition OPEN_BLOCK empty_lines condition_block CLOSE_BLOCK
				 ;
condition : boolean_expression conjunction condition
	| boolean_expression
	;
conjunction :  AND
	    | OR
	    | XOR
	    ;
boolean_expression : NEGATION   boolean_expression
		   | OPEN_BRACKET assignment CLOSE_BRACKET
		   ;
assignment : name  ASSIGNMENT NUMBER
		   | name ASSIGNMENT name
		| assignment empty_lines
		   ;

name : NAME { printf("%s", $1); $$ = $1;};
type : NAME { printf("%s", $1); $$ = $1;};

