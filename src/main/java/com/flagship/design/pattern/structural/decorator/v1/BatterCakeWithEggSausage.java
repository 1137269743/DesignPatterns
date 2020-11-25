package com.flagship.design.pattern.structural.decorator.v1;

/**
 * @Author Flagship
 * @Date 2020/11/13 12:21
 * @Description
 */
public class BatterCakeWithEggSausage extends BatterCakeWithEgg {
    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
