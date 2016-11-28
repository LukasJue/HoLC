%{
#include <stdio.h>
#include "hopperlang.tab.h"

int tokenvalue = NOTHING;

%}

%%

[ \t]			; /*whitespace and tab dont matter*/
\n              { return (NEWLINE); }
[0-9]+          { tokenvalue = strtol(yytext, NULL, 10);
				  return (NUMBER); 
				}
"="             { return (ASSIGNMENT); }

"("             { return (OPEN_BRACKET); }
")"             { return (CLOSE_BRACKET); }

"do"            { return (OPEN_BLOCK); }
"end"           { return (CLOSE_BLOCK); }

"input"  	{ return (INPUT_BLOCK); }
"output" 	{ return (OUTPUT_BLOCK); }
"automat"       { return (AUTOMAT); }

"state"         { return (STATE); }
"when"          { return (CONDITION); }
"not"           { return (NEGATION); }
"goto"          { return (TRANSITION); }

.				{  tokenvalue = yytext[0];
				  return (NOTHING);
				}
%%
