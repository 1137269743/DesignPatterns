package com.flagship.design.pattern.behavioral.strategy;

import org.apache.commons.lang.StringUtils;

/**
 * @Author Flagship
 * @Date 2020/11/22 14:15
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        PromotionActivity promotionActivity618 = new PromotionActivity(new LiJianPromotionStrategy());
        PromotionActivity promotionActivity1111 = new PromotionActivity(new FanXianPromotionStrategy());

        promotionActivity618.executePromotionStrategy();
        promotionActivity1111.executePromotionStrategy();
    }

//    public static void main(String[] args) {
//        PromotionActivity promotionActivity = null;
//
//        String promotionKey = "LIJIAN";
//
//        if (StringUtils.equals(promotionKey,"LIJIAN")) {
//            promotionActivity = new PromotionActivity(new LiJianPromotionStrategy());
//        } else if (StringUtils.equals(promotionKey,"FANXIAN")) {
//            promotionActivity = new PromotionActivity(new FanXianPromotionStrategy());
//        } else if (StringUtils.equals(promotionKey,"MANJIAN")){
//            promotionActivity = new PromotionActivity(new ManJianPromotionStrategy());
//        }
//
//        promotionActivity.executePromotionStrategy();
//    }

//    public static void main(String[] args) {
//        String promotionKey = "MANJIANxxx";
//        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
//        promotionActivity.executePromotionStrategy();
//    }
}
