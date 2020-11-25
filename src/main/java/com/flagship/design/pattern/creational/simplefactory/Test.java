package com.flagship.design.pattern.creational.simplefactory;

/**
 * @ClassName: Test
 * @Author: Flagship
 * @Description:
 * @Date: 2020/10/31 0:16
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if (video == null) {
            return;
        }
        video.produce();
    }
}
