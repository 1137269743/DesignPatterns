package com.flagship.design.pattern.behavioral.interpreter;

/**
 * @Author Flagship
 * @Date 2020/11/22 14:56
 * @Description
 */
public class AddInterpreter implements Interpreter {
    private Interpreter firstExpression, secondExpression;
    public AddInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }
    @Override
    public int interpret() {
        return this.firstExpression.interpret() + this.secondExpression.interpret();
    }

    @Override
    public String toString() {
        return "+";
    }
}
