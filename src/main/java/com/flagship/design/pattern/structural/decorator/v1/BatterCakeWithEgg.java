package com.flagship.design.pattern.structural.decorator.v1;

/**
 * @Author Flagship
 * @Date 2020/11/13 12:20
 * @Description
 */
public class BatterCakeWithEgg extends BatterCake {
    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}
