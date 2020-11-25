package com.flagship.design.pattern.creational.abstractfactory;

/**
 * @ClassName: JavaVideo
 * @Author: Flagship
 * @Description:
 * @Date: 2020/11/1 0:00
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
