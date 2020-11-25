package com.flagship.design.pattern.behavioral.strategy;

/**
 * @Author Flagship
 * @Date 2020/11/22 14:18
 * @Description
 */
public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotionStrategy() {
        promotionStrategy.doPromotion();
    }
}
