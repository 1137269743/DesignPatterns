package com.flagship.design.pattern.behavioral.interpreter;

/**
 * @Author Flagship
 * @Date 2020/11/22 14:58
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        String flagshipInputStr = "6 100 11 + *";
        FlagshipExpressionParser expressionParser = new FlagshipExpressionParser();
        int result = expressionParser.parse(flagshipInputStr);
        System.out.println("解释器计算结果：" + result);
    }
}
