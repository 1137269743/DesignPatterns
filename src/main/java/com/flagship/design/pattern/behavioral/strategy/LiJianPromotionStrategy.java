package com.flagship.design.pattern.behavioral.strategy;

/**
 * @Author Flagship
 * @Date 2020/11/22 14:15
 * @Description
 */
public class LiJianPromotionStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("立减促销，课程的价格直接减去配置的价格");
    }
}
