package com.flagship.design.pattern.creational.factorymethod;

/**
 * @ClassName: PythonVideoFactory
 * @Author: Flagship
 * @Description:
 * @Date: 2020/10/31 22:48
 */
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
