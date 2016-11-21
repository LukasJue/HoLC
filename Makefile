hopperlang: main.o hopperlang.tab.o lex.yy.o
	gcc -o hopperlang main.o hopperlang.tab.o lex.yy.o

main.o : main.c
	gcc -c main.c

hopperlang.tab.o : hopperlang.tab.c hopperlang.tab.h
	gcc -c hopperlang.tab.c

lex.yy.o : lex.yy.c hopperlang.tab.h
	gcc -c lex.yy.c

lex.yy.c : hopperlang.l
	flex hopperlang.l

hopperlang.tab.c : hopperlang.y
	bison -d hopperlang.y

clean:
	rm -f hopperlang hopperlang.tab.c hopperlang.tab.h lex.yy.c *.o
