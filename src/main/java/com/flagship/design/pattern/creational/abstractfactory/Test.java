package com.flagship.design.pattern.creational.abstractfactory;

/**
 * @ClassName: Test
 * @Author: Flagship
 * @Description:
 * @Date: 2020/11/1 0:07
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Article article = courseFactory.getArticle();
        Video video = courseFactory.getVideo();
        article.produce();
        video.produce();
    }
}
