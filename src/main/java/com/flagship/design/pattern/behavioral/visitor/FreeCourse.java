package com.flagship.design.pattern.behavioral.visitor;

/**
 * @Author Flagship
 * @Date 2020/11/22 18:53
 * @Description
 */
public class FreeCourse extends Course {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
