package com.flagship.design.pattern.creational.builder;

/**
 * @ClassName: Test
 * @Author: Flagship
 * @Description:
 * @Date: 2020/11/1 0:40
 */
public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);
        Course course = coach.makeCourse("Java设计模式","Java设计模式PPT","Java设计模式视频","Java设计模式手记","Java设计模式问答");
        System.out.println(course.getCourseName());
        System.out.println(course.getCoursePPT());
        System.out.println(course.getCourseVideo());
        System.out.println(course.getCourseArticle());
        System.out.println(course.getCourseQA());
    }
}
