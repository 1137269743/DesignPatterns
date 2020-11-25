package com.flagship.design.pattern.behavioral.observer;

import java.util.Observable;

/**
 * @Author Flagship
 * @Date 2020/11/22 15:50
 * @Description
 */
public class Course extends Observable {
    private String courseName;

    public Course(String name) {
        this.courseName = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void produceQuestion(Course course, Question question) {
        System.out.println(question.getUserName() + "在" + course.getCourseName() + "提交了一个问题");
        setChanged();
        notifyObservers(question);
    }
}
