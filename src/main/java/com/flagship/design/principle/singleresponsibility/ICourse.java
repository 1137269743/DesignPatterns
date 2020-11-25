package com.flagship.design.principle.singleresponsibility;

/**
 * @ClassName: ICourse
 * @Author: Flagship
 * @Description:
 * @Date: 2020/10/29 23:17
 */
public interface ICourse {
    String getCourseName();
    byte[] getCourseVideo();

    void studyCourse();
    void refundCourse();
}
