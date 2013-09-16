package compiler.ast;
 
import java.util.List;
import org.antlr.v4.runtime.tree.TerminalNode;
import compiler.parser.DecafParser;
import compiler.parser.DecafParserBaseVisitor;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;

 
public class ASTVisitor extends DecafParserBaseVisitor<Node>{

	@Override
	public Node visitProgram(DecafParser.ProgramContext ctx) {
		System.out.println("\n"+ctx.getText());
		System.out.println(ctx.getParent().toStringTree());
		//System.out.println(visit(e));
		return new Root();
	}
}
