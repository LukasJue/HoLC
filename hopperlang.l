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

"("             { return (OPENING_BRACKET); }
")"             { return (CLOSING_BRACKET); }

"do"            { return (OPENING_BLOCK); }
"end"           { return (CLOSING_BLOCK); }

"signal input"  { return (INPUT_BLOCK); }
"signal output" { return (OUTPUT_BLOCK); }
"automat"       { return (AUTOMAT_DECLARATION); }

"state"         { return (STATE_DECLARATION); }
"when"          { return (CONDITION); }
"not"           { return (NEGATION); }
"goto"          { return (TRANSITION); }

.				{  tokenvalue = yytext[0];
				  return (NOTHING);
				}
%%
