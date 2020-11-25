package com.flagship.design.pattern.structural.decorator.v2;

/**
 * @Author Flagship
 * @Date 2020/11/13 12:33
 * @Description
 */
public class BatterCake extends ABatterCake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
