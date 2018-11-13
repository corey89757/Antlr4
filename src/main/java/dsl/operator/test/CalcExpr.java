package dsl.operator.test;

import dsl.operator.ExprBaseListener;
import dsl.operator.ExprParser;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalcExpr extends ExprBaseListener {
    // 用来对应每个节点,保存它的计算值,于是父级节点可以获取子节点的值
    ParseTreeProperty<BigDecimal> numbers = new ParseTreeProperty<>();

    /*// 退出时,把结果保存到本节点对应的Map里
    @Override
    public void exitParentheses(ExprParser.ParenthesesContext ctx) {
        numbers.put(ctx, numbers.get(ctx.expr()));
        super.exitParentheses(ctx);
    }*/

    @Override
    public void exitAdd_Sub(ExprParser.Add_SubContext ctx) {

        BigDecimal left = numbers.get(ctx.expr(0));
        BigDecimal right = numbers.get(ctx.expr(1));
        if (ctx.ADD() != null) {
            numbers.put(ctx, left.add(right));
        } else {
            numbers.put(ctx, left.subtract(right));
        }
        super.exitAdd_Sub(ctx);
    }

    @Override
    public void exitMul_Div_Mod(ExprParser.Mul_Div_ModContext ctx) {
        BigDecimal left = numbers.get(ctx.expr(0));
        BigDecimal right = numbers.get(ctx.expr(1));
        if (ctx.MUL() != null) {
            numbers.put(ctx, left.multiply(right));
        } else if (ctx.DIV() != null) {
// Only keep up to 21 digits after the decimal point 
            numbers.put(ctx, left.divide(right, 21, RoundingMode.HALF_UP).stripTrailingZeros());
        } else if (ctx.MOD() != null) {
            numbers.put(ctx, left.remainder(right));
        }

        super.exitMul_Div_Mod(ctx);
    }

    // 在遇到数字时,把它变成BigDecimal
    @Override
    public void exitNumber(ExprParser.NumberContext ctx) {
        numbers.put(ctx, new BigDecimal(ctx.getText()));

        super.exitNumber(ctx);
    }
}