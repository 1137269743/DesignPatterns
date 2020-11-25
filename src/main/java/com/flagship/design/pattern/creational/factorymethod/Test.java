package com.flagship.design.pattern.creational.factorymethod;

/**
 * @ClassName: Test
 * @Author: Flagship
 * @Description:
 * @Date: 2020/10/31 0:16
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new FEVideoFactory();
        Video video = videoFactory.getVideo();
        if (video == null) {
            return;
        }
        video.produce();
    }
}
