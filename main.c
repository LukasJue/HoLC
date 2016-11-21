#include <stdio.h>
#include <stdlib.h>

extern int yyparse (void);

int main (int ac, char **av)
{

  yyparse();
}
