package dsl.operator.test;

import dsl.operator.ExprLexer;
import dsl.operator.ExprParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class CalcExprTest {

    public static void main(String[] args) {
        CharStream input = CharStreams.fromString("1+2*3+12*2");
        ExprLexer lexer = new ExprLexer(input);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokenStream);

        ParseTree parseTree = parser.expr();
        CalcExpr visitor = new CalcExpr();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(visitor, parseTree);
        System.out.println(visitor.numbers.get(parseTree));
    }
}