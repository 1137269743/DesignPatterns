package com.flagship.design.pattern.behavioral.state;

/**
 * @Author Flagship
 * @Date 2020/11/22 19:22
 * @Description
 */
public class PlayState extends CourseVideoState {
    @Override
    public void play() {
        System.out.println("正常播放课程视频的状态");
    }

    @Override
    public void speed() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.SPEED_STATE);
    }

    @Override
    public void pause() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PAUSE_STATE);
    }

    @Override
    public void stop() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.STOP_STATE);
    }
}
