package com.flagship.design.pattern.behavioral.command;

/**
 * @Author Flagship
 * @Date 2020/11/22 17:05
 * @Description
 */
public class OpenCourseVideoCommand implements Command {
    private CourseVideo courseVideo;

    public OpenCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.open();
    }
}
