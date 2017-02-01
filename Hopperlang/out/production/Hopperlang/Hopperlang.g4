grammar Hopperlang;
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
COMMENT: '#'.*? -> skip;
MULTILINE_COMMENT:  '/*' .*? '*/' -> skip;

document	: signal_declaration automat_block EOF;

empty_lines : (NEWLINE+)
            | (NEWLINE+) empty_lines
            |
	    ;


signal_declaration : SIGNAL signal_modifier signal_value empty_lines signal_declaration
				   | SIGNAL signal_modifier OPEN_BRACKET empty_lines signal_value_list CLOSE_BRACKET empty_lines signal_declaration
				   |
				   ;

signal_modifier: SIG_INPUT
                | SIG_OUTPUT
                | SIG_LOCAL
                ;

signal_value_list	: signal_value_list signal_value empty_lines
			| signal_value empty_lines
			;

signal_value : name type;

automat_block : AUTOMAT name OPEN_BLOCK empty_lines state_block_list CLOSE_BLOCK empty_lines;

state_block_list : (state_block empty_lines)*?
				;

state_block : STATE name OPEN_BLOCK empty_lines state_body CLOSE_BLOCK;

state_body: (state_body_element empty_lines)*?
            ;

state_body_element : assignment
	 	           | transition
	 	           ;

transition: condition_block transition
            | condition_line transition
            | condition_block
            | condition_line
            ;

condition_block :  CONDITION condition OPEN_BLOCK empty_lines transition+ CLOSE_BLOCK empty_lines condition_block?
				 ;

condition_line: CONDITION condition TRANSITION name empty_lines
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

name : NAME;
type : NAME;



