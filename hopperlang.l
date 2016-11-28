%{
#include <stdio.h>
#include "hopperlang.tab.h"

char* tokentext = NOTHING;
int tokenvalue = NOTHING;

%}

%%

[ \t]			; /*whitespace and tab dont matter*/
\n              { return (NEWLINE); }
[0-9]+          { tokenvalue = strtol(yytext, NULL, 10);
				  return (NUMBER); 
				}
[a-zA-Z][a-zA-Z0-9]*	{	tokentext = strdup(yytext);
				return (NAME); }
"="             { return (ASSIGNMENT); }

"("             { return (OPEN_BRACKET); }
")"             { return (CLOSE_BRACKET); }

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

"#"		{ return (COMMENT); }

.				{  tokenvalue = yytext[0];
				  return (NOTHING);
				}
%%
