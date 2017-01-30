%{
#include <stdio.h>
#include "hopperlang.tab.h"

char* tokentext = NOTHING;
int tokenvalue = NOTHING;
int line_number = 1;
%}

%%

[ \t]			; /*whitespace and tab dont matter*/
\n              { line_number++; return (NEWLINE); }
[0-9]+          { tokenvalue = strtol(yytext, NULL, 10);
				  return (NUMBER); 
				}
(#.*)|(\/\*([^*]|[\r\n]|(\*+([^*/]|[\r\n])))*\*+\/) {}
"do"            { return (OPEN_BLOCK); }
"end"           { return (CLOSE_BLOCK); }

"signal"	{ return (SIGNAL); }
"input"  	{ return (SIG_INPUT); }
"output" 	{ return (SIG_OUTPUT); }
"local"		{ return (SIG_LOCAL); }
"automat"       { return (AUTOMAT); }

"state"         { return (STATE); }
"when"          { return (CONDITION); }
"not"           { return (NEGATION); }
"goto"          { return (TRANSITION); }
"and"		{ return (AND); }
"or"		{ return (OR); }
"xor"		{ return (XOR); }

[a-zA-Z][a-zA-Z0-9]*	{	tokentext = strdup(yytext);
				return (NAME); }
"="             { return (ASSIGNMENT); }

"("             { return (OPEN_BRACKET); }
")"             { return (CLOSE_BRACKET); }

.				{  tokenvalue = yytext[0];
				  return (NOTHING);
				}
%%
