make: Compiler.class Scanner.class DecafLexer.java DecafLexer.class CC4Parser.java DecafParser.java ejecuta

Compiler.class: Compiler.java
	javac Compiler.java

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

ejecuta:
	java Compiler -target parse -debug scan:parse prueba.txt

clean:
	rm *.class
