package com.flagship.design.pattern.structural.decorator.v2;

/**
 * @Author Flagship
 * @Date 2020/11/13 12:34
 * @Description
 */
public abstract class AbstractDecorator extends ABatterCake {
    private ABatterCake aBatterCake;

    public AbstractDecorator(ABatterCake aBatterCake) {
        this.aBatterCake = aBatterCake;
    }

    protected abstract void doSomething();

    @Override
    protected String getDesc() {
        return this.aBatterCake.getDesc();
    }

    @Override
    protected int cost() {
        return this.aBatterCake.cost();
    }
}
