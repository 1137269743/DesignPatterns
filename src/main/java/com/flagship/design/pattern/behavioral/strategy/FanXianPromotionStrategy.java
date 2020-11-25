package com.flagship.design.pattern.behavioral.strategy;

/**
 * @Author Flagship
 * @Date 2020/11/22 14:15
 * @Description
 */
public class FanXianPromotionStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("返现促销，返回的金额存放到慕课网用户的余额中");
    }
}
