%{

#include <stdio.h>
extern int tokenvalue;
extern char* tokentext;

%}
%start lines

%token NEWLINE NUMBER ASSIGNMENT OPEN_BRACKET CLOSE_BRACKET OPEN_BLOCK CLOSE_BLOCK SIGNAL
%SIG_INPUT SIG_OUTPUT SIG_LOCAL AUTOMAT STATE CONDITION NEGATION TRANSITION COMMENT NOTHING

%%

lines	: lines expr NEWLINE {}
		| lines COMMENT NEWLINE {}
		| lines NEWLINE
		| SIGNAL signal_declaration
		;
expr	:


signal_declaration : SIG_INPUT signal_value
				   | SIG_OUTPUT signal_value
				   | SIG_LOCAL signal_value
				   | SIG_INPUT OPEN_BRACKET signal_value_list CLOSE_BRACKET
				   | SIG_OUTPUT OPEN_BRACKET signal_value_list CLOSE_BRACKET
				   | SIG_LOCAL OPEN_BRACKET signal_value_list CLOSE_BRACKET
				   ;
signal_value_list	: signal_value NEWLINE signal_value_list
					| signal_value NEWLINE
					;
signal_value : name type ;

automat_block : AUTOMAT NAME OPEN_BLOCK state_block_list CLOSE_BLOCK;
state_block_list : state_block NEWLINE automat_body
				| state_block NEWLINE
				| NEWLINE
				;
state_block : STATE NAME OPEN_BLOCK state_body CLOSE_BLOCK;
state_body : condition_block
		   | assignment
		   | NEWLINE
		   ;
condition_block : CONDITION condition TRANSITION name {}
				 | CONDITION condition OPEN_BLOCK condition_block CLOSE_BLOCK
				 ;
assignment : NAME ASSIGNMENT NUMBER
		   | NAME ASSIGNMENT NAME
		   ;

name : NAME { $$ = $1 };
type : NAME { $$ = $1 };

