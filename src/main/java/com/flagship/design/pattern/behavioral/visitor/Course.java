package com.flagship.design.pattern.behavioral.visitor;

/**
 * @Author Flagship
 * @Date 2020/11/22 18:53
 * @Description
 */
public abstract class Course {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void accept(IVisitor visitor);
}
