package com.flagship.design.principle.openclose;

/**
 * @ClassName: JavaDiscountCourse
 * @Author: Flagship
 * @Description:
 * @Date: 2020/10/29 22:39
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getDiscountPrice() {
        return super.getPrice()*0.8;
    }

}
