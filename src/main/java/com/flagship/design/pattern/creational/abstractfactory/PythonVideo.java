package com.flagship.design.pattern.creational.abstractfactory;

/**
 * @ClassName: PythonVideo
 * @Author: Flagship
 * @Description:
 * @Date: 2020/11/1 0:02
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}
