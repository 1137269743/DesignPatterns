package com.flagship.design.pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Flagship
 * @Date 2020/11/22 18:52
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        List<Course> courseList = new ArrayList<Course>();
        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("SpringMVC数据绑定");

        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setName("Java设计模式精讲 -- By Flagship");
        codingCourse.setPrice(299);

        courseList.add(freeCourse);
        courseList.add(codingCourse);

        for (Course course : courseList) {
            course.accept(new Visitor());
        }
    }
}
