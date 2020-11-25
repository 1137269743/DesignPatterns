package com.flagship.design.pattern.structural.facade;

/**
 * @Author Flagship
 * @Date 2020/11/11 22:36
 * @Description
 */
public class ShippingService {
    public String shipGift(PointsGift pointsGift) {
        //物流系统的对接逻辑
        System.out.println(pointsGift.getName() + "进入物流系统");
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }
}
