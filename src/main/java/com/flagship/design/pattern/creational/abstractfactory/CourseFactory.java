package com.flagship.design.pattern.creational.abstractfactory;

/**
 * @ClassName: CourseFactory
 * @Author: Flagship
 * @Description:
 * @Date: 2020/10/31 23:56
 */
public interface CourseFactory {
    Video getVideo();
    Article getArticle();
}
