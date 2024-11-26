package com.src.behavioural.interpreter.demo;

/**
 * Non-terminal AndExpression.
 * This will be further broken down recursively
 * into a terminal expression
 */
public class AndExpression implements Expression{
    private final Expression expr1;
    private final Expression expr2;
    public AndExpression(Expression expr1, Expression expr2){
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    /**
     * in this method implementation, we are doing
     * a recursive call through the && to evaluate
     * based on the provided context
     * @param context
     * @return
     */
    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}
