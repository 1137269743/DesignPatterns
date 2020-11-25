package com.flagship.design.principle.dependenceinversion;

/**
 * @ClassName: Flagship
 * @Author: Flagship
 * @Description:
 * @Date: 2020/10/29 22:49
 */
public class Flagship {
    private ICourse iCourse;

    public Flagship() {
    }

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyImoocCourse(){
        iCourse.studyCourse();
    }
}
