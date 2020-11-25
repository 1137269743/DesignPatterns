package com.flagship.design.principle.dependenceinversion;

/**
 * @ClassName: JavaCourse
 * @Author: Flagship
 * @Description:
 * @Date: 2020/10/29 22:53
 */
public class JavaCourse implements ICourse{
    @Override
    public void studyCourse() {
        System.out.println("Flagship在学习Java课程");
    }
}
