package com.flagship.design.pattern.creational.simplefactory;

/**
 * @ClassName: JavaVideo
 * @Author: Flagship
 * @Description:
 * @Date: 2020/10/31 0:15
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
