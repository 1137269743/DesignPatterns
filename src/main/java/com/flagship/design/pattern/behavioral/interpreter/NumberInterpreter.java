package com.flagship.design.pattern.behavioral.interpreter;

/**
 * @Author Flagship
 * @Date 2020/11/22 14:57
 * @Description
 */
public class NumberInterpreter implements Interpreter {
    private int number;

    public NumberInterpreter(int number) {
        this.number = number;
    }

    public NumberInterpreter(String number) {
        this.number = Integer.parseInt(number);
    }

    @Override
    public int interpret() {
        return this.number;
    }
}
