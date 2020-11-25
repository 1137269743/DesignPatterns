package com.flagship.design.pattern.behavioral.interpreter;

/**
 * @Author Flagship
 * @Date 2020/11/22 14:57
 * @Description
 */
public class MultiInterpreter implements Interpreter {
    private Interpreter firstExpression, secondExpression;
    public MultiInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }
    @Override
    public int interpret() {
        return this.firstExpression.interpret() * this.secondExpression.interpret();
    }

    @Override
    public String toString() {
        return "*";
    }
}
