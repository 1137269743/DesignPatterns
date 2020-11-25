package com.flagship.design.pattern.creational.abstractfactory;

/**
 * @ClassName: PythonCourseFactory
 * @Author: Flagship
 * @Description:
 * @Date: 2020/11/1 0:04
 */
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
