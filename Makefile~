make: Scanner.class DecafLexer.java DecafLexer.class CC4Parser.java DecafParser.java basevisitor.java ast/*.class Compiler.class ejecuta

Scanner.java:
	echo scanner
Scanner.class: Scanner.java
	javac scanner/Scanner.java

DecafLexer.g:
	echo DecafLexer.g

DecafLexer.java: DecafLexer.g
	java -jar /usr/local/lib/antlr-4.0-complete.jar scanner/DecafLexer.g

DecafLexer.class: DecafLexer.java
	javac scanner/DecafLexer.java

CC4Parser.java:
	echo CC4Parser.java

CC4Parser.class: CC4Parser.java
	javac parser/CC4Parser.java

DecafParser.g:
	echo DecafParser.g

DecafParser.java: DecafParser.class
	java -jar /usr/local/lib/antlr-4.0-complete.jar parser/DecafParser.g -lib scanner/

DecafParser.class: DecafParser.java
	javac parser/DecafParser.java

basevisitor.class:
	echo 'para visitor'

basevisitor.java: basevisitor.class
	java -jar /usr/local/lib/antlr-4.0-complete.jar -visitor -lib scanner/ parser/DecafParser.g

ast/*.class: ast/*.java
	javac ast/*.java

Compiler.class: Compiler.java
	javac Compiler.java

ejecuta:
	java Compiler -target ast -debug scan:parse:ast prueba.txt

clean:
	rm *.class
	rm ast/*.class
