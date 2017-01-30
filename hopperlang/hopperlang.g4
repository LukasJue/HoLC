grammar hopperlang;
WS : [ \r\t]+ -> skip ;
NEWLINE: [\n];
NUMBER: [0-9]+;
OPEN_BLOCK: 'do';
CLOSE_BLOCK: 'end';

SIGNAL: 'signal';
SIG_INPUT: 'input';
SIG_OUTPUT: 'output';
SIG_LOCAL: 'local';
AUTOMAT: 'automat';

STATE: 'state';
CONDITION: 'when';
NEGATION: 'not';
TRANSITION: 'goto';
AND: 'and';
OR: 'or';
XOR: 'xor';

NAME : [a-zA-Z][a-zA-Z0-9]* ;
ASSIGNMENT: '=';
OPEN_BRACKET: '(';
CLOSE_BRACKET: ')';
COMMENT: '#'.* -> skip;
MULTILINE_COMMENT:  '/*' .*? '*/' -> skip;

document	: signal_declaration automat_block
		;

empty_lines : NEWLINE
	    | empty_lines NEWLINE
	    |
	    ;


signal_declaration : SIGNAL SIG_INPUT signal_value empty_lines signal_declaration
				   | SIGNAL SIG_OUTPUT signal_value empty_lines signal_declaration
				   | SIGNAL SIG_LOCAL signal_value empty_lines signal_declaration
				   | SIGNAL SIG_INPUT OPEN_BRACKET empty_lines signal_value_list CLOSE_BRACKET empty_lines signal_declaration
				   | SIGNAL SIG_OUTPUT OPEN_BRACKET empty_lines signal_value_list CLOSE_BRACKET empty_lines signal_declaration
				   | SIGNAL SIG_LOCAL OPEN_BRACKET empty_lines signal_value_list CLOSE_BRACKET empty_lines signal_declaration
				   |
				   ;
signal_value_list	: signal_value_list signal_value empty_lines
			| signal_value empty_lines
			;

signal_value : name type;

automat_block : AUTOMAT name OPEN_BLOCK empty_lines state_block_list CLOSE_BLOCK empty_lines;

state_block_list : state_block empty_lines state_block_list
				| empty_lines
				;

state_block : STATE name OPEN_BLOCK empty_lines state_body CLOSE_BLOCK;

state_body: state_body_element state_body empty_lines
            | empty_lines;

state_body_element : condition_block
	 	           | assignment
	 	           | empty_lines
	 	           ;

condition_block : CONDITION condition TRANSITION name empty_lines condition_block
                 | CONDITION condition TRANSITION name empty_lines
				 | CONDITION condition OPEN_BLOCK empty_lines condition_block CLOSE_BLOCK empty_lines condition_block
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
		   ;

name : NAME { printf("%s", $1); $$ = $1;};
type : NAME { printf("%s", $1); $$ = $1;};



