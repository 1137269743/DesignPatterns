package com.flagship.design.pattern.structural.decorator.v2;

/**
 * @Author Flagship
 * @Date 2020/11/13 12:31
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        ABatterCake aBatterCake;
        aBatterCake = new BatterCake();
        aBatterCake = new EggDecorator(aBatterCake);
        aBatterCake = new EggDecorator(aBatterCake);
        aBatterCake = new SausageDecorator(aBatterCake);

        System.out.println(aBatterCake.getDesc() + " 销售价格：" + aBatterCake.cost());
    }
}
