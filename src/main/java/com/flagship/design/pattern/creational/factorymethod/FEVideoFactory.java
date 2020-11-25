package com.flagship.design.pattern.creational.factorymethod;

/**
 * @ClassName: FEVideoFactory
 * @Author: Flagship
 * @Description:
 * @Date: 2020/10/31 23:35
 */
public class FEVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
