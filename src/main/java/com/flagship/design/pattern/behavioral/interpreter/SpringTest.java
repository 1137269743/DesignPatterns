package com.flagship.design.pattern.behavioral.interpreter;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * @Author Flagship
 * @Date 2020/11/22 14:58
 * @Description
 */
public class SpringTest {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("100 * + 400 * 1 + 66");
        int result = (int) expression.getValue();
        System.out.println(result);
    }
}
