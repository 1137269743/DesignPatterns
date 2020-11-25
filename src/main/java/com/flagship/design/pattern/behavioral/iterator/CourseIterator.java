package com.flagship.design.pattern.behavioral.iterator;

/**
 * @Author Flagship
 * @Date 2020/11/22 13:42
 * @Description
 */
public interface CourseIterator {
    Course nextCourse();
    boolean isLastCourse();
}
