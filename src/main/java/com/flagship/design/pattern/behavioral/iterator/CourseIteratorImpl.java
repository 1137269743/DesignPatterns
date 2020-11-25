package com.flagship.design.pattern.behavioral.iterator;

import java.util.List;

/**
 * @Author Flagship
 * @Date 2020/11/22 13:46
 * @Description
 */
public class CourseIteratorImpl implements CourseIterator {
    private List courseList;
    int position;
    Course course;

    public CourseIteratorImpl(List courseList) {
        this.courseList = courseList;
    }

    @Override
    public Course nextCourse() {
        System.out.println("返回课程，位置是：" + position);
        course = (Course) courseList.get(position++);
        return course;
    }

    @Override
    public boolean isLastCourse() {
        return position >= courseList.size();
    }
}
