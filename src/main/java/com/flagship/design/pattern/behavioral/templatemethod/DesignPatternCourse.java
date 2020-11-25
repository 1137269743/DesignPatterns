package com.flagship.design.pattern.behavioral.templatemethod;

/**
 * @Author Flagship
 * @Date 2020/11/22 13:14
 * @Description
 */
public class DesignPatternCourse extends ACourse {

    @Override
    void packageCourse() {
        System.out.println("提供课程Java源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
