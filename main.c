#include <stdio.h>
#include <stdlib.h>

extern int yyparse (void);

 void yyerror (char const *s) {
   fprintf (stderr, "%s\n", s);
 }

 int yywrap() {
 	if(0) unput(0);
 	return 1;
 }

int main (int ac, char **av)
{
  yyparse();
}
