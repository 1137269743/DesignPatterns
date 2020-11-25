package com.flagship.design.pattern.behavioral.command;

/**
 * @Author Flagship
 * @Date 2020/11/22 17:04
 * @Description
 */
public class CourseVideo {
    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println(this.name + "课程的视频开放");
    }

    public void close() {
        System.out.println(this.name + "课程的视频关闭");
    }
}
