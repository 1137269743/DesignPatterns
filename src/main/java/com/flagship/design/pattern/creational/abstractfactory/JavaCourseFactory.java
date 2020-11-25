package com.flagship.design.pattern.creational.abstractfactory;

/**
 * @ClassName: JavaCourseFactory
 * @Author: Flagship
 * @Description:
 * @Date: 2020/10/31 23:59
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
