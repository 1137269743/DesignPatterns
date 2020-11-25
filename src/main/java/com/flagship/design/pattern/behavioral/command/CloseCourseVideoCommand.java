package com.flagship.design.pattern.behavioral.command;

/**
 * @Author Flagship
 * @Date 2020/11/22 17:06
 * @Description
 */
public class CloseCourseVideoCommand implements Command {
    private CourseVideo courseVideo;

    public CloseCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.close();
    }
}
