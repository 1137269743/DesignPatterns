package com.flagship.design.pattern.creational.simplefactory;

/**
 * @ClassName: PythonVideo
 * @Author: Flagship
 * @Description:
 * @Date: 2020/10/31 0:16
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}
