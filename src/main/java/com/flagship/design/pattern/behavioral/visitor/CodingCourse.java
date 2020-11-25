package com.flagship.design.pattern.behavioral.visitor;

/**
 * @Author Flagship
 * @Date 2020/11/22 18:53
 * @Description
 */
public class CodingCourse extends Course {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
