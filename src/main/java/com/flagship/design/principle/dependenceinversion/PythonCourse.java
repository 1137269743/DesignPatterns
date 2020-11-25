package com.flagship.design.principle.dependenceinversion;

/**
 * @ClassName: PythonCourse
 * @Author: Flagship
 * @Description:
 * @Date: 2020/10/29 22:57
 */
public class PythonCourse implements ICourse{
    @Override
    public void studyCourse() {
        System.out.println("Flagship在学习Python课程");
    }
}
