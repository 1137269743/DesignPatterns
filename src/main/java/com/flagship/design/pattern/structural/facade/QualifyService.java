package com.flagship.design.pattern.structural.facade;

/**
 * @Author Flagship
 * @Date 2020/11/11 22:31
 * @Description
 */
public class QualifyService {
    public boolean isAvailable (PointsGift pointsGift) {
        System.out.println("校验" + pointsGift.getName() + "积分资格通过，库存通过");
        return true;
    }
}
