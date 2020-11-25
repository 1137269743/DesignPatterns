package com.flagship.design.pattern.structural.facade;

/**
 * @Author Flagship
 * @Date 2020/11/11 22:43
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("T恤");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(pointsGift);
    }
}
