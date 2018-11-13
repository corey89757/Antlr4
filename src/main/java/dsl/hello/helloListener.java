package dsl.hello;// Generated from /home/jian.wu/workspace-idea-git/Antlr4/src/main/java/hello.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link helloParser}.
 */
public interface helloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link helloParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(helloParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(helloParser.RContext ctx);
}