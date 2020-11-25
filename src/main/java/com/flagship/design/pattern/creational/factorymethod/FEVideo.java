package com.flagship.design.pattern.creational.factorymethod;

/**
 * @ClassName: FEVideo
 * @Author: Flagship
 * @Description:
 * @Date: 2020/10/31 23:34
 */
public class FEVideo extends Video{
    @Override
    public void produce() {
        System.out.println("录制FE课程视频");
    }
}
