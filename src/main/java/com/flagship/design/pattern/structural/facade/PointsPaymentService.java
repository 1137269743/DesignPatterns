package com.flagship.design.pattern.structural.facade;

/**
 * @Author Flagship
 * @Date 2020/11/11 22:33
 * @Description
 */
public class PointsPaymentService {
    public boolean pay(PointsGift pointsGift) {
        //扣减积分
        System.out.println("支付" + pointsGift.getName() + " 积分成功");
        return true;
    }
}
