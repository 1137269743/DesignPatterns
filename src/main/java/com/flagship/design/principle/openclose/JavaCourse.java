package com.flagship.design.principle.openclose;

/**
 * @ClassName: JavaCourse
 * @Author: Flagship
 * @Description:
 * @Date: 2020/10/29 22:26
 */
public class JavaCourse implements ICourse {
    Integer id;
    String name;
    Double price;

    public JavaCourse (Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
