package com.flagship.design.pattern.behavioral.visitor;

/**
 * @Author Flagship
 * @Date 2020/11/22 18:53
 * @Description
 */
public class Visitor implements IVisitor {

    @Override
    public void visit(FreeCourse freeCourse) {
        System.out.println("免费课程" + freeCourse.getName());
    }

    @Override
    public void visit(CodingCourse codingCourse) {
        System.out.println("实战课程" + codingCourse.getName() + " 价格：" + codingCourse.getPrice());
    }
}
