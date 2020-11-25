package com.flagship.design.principle.singleresponsibility;

/**
 * @ClassName: ICourseImpl
 * @Author: Flagship
 * @Description:
 * @Date: 2020/10/29 23:20
 */
public class ICourseImpl implements ICourseManager,ICourseContent{
    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
