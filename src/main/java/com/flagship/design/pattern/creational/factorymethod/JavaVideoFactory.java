package com.flagship.design.pattern.creational.factorymethod;

/**
 * @ClassName: JavaVideoFactory
 * @Author: Flagship
 * @Description:
 * @Date: 2020/10/31 22:47
 */
public class JavaVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
