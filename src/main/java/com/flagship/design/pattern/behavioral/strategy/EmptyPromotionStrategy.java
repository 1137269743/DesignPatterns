package com.flagship.design.pattern.behavioral.strategy;

/**
 * @Author Flagship
 * @Date 2020/11/22 14:36
 * @Description
 */
public class EmptyPromotionStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("无促销");
    }
}
