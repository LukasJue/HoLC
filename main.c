#include <stdio.h>
#include <stdlib.h>

extern int yyparse (void);
extern int line_number;
 void yyerror (char const *s) {
   fprintf (stderr, "err in line %i: %s\n",line_number, s);
 }

 int yywrap() {
 	if(0) unput(0);
 	return 1;
 }

int main (int ac, char **av)
{
  yyparse();
}
