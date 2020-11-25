package com.flagship.design.pattern.behavioral.state;

/**
 * @Author Flagship
 * @Date 2020/11/22 19:20
 * @Description
 */
public abstract class CourseVideoState {
    protected CourseVideoContext courseVideoContext;

    public void setCourseVideoContext(CourseVideoContext courseVideoContext) {
        this.courseVideoContext = courseVideoContext;
    }

    public abstract void play();
    public abstract void speed();
    public abstract void pause();
    public abstract void stop();

}
