package com.flagship.design.pattern.behavioral.iterator;

/**
 * @Author Flagship
 * @Date 2020/11/22 13:41
 * @Description
 */
public interface CourseAggregate {
    void addCourse(Course course);
    void removeCourse(Course course);

    CourseIterator getCourseIterator();
}
