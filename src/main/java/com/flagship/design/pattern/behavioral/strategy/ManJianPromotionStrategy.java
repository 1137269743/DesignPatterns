package com.flagship.design.pattern.behavioral.strategy;

/**
 * @Author Flagship
 * @Date 2020/11/22 14:14
 * @Description
 */
public class ManJianPromotionStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("满减促销，满200-20元");
    }
}
