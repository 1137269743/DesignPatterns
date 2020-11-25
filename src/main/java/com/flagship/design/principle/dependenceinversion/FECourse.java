package com.flagship.design.principle.dependenceinversion;

/**
 * @ClassName: FECourse
 * @Author: Flagship
 * @Description:
 * @Date: 2020/10/29 22:54
 */
public class FECourse implements ICourse{
    @Override
    public void studyCourse() {
        System.out.println("Flagship在学习FE课程");
    }
}
