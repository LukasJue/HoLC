RM   := rm -rf

CC   := gcc
LEX  := flex
YY   := bison

CFLAGS :=
LFLAGS :=
YFLAGS :=

NAME := hopperlang

.PHONY: clean dist-clean $(NAME)

all: clean $(NAME)

$(NAME): main.o $(NAME).tab.o lex.yy.o
	$(CC) $(CFLAGS) -o $@ $^

main.o: main.c
	$(CC) $(CFLAGS) -c -o $@ $<

.tab.o: $(NAME).tab.c $(NAME).tab.h
	$(CC) $(CFLAGS) -c $<

.yy.o : lex.yy.c $(NAME).tab.h
	$(CC) $(CFLAGS) -c $<

lex.yy.c : $(NAME).l
	$(LEX) $(LFLAGS) $<

$(NAME).tab.c : $(NAME).y
	$(YY) $(YFLAGS) -d $<

clean:
	$(RM) *.tab.{c,h} lex.yy.c *.o hopperlang

dist-clean: clean
	$(RM) $(NAME)
