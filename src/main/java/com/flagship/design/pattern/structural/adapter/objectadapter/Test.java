package com.flagship.design.pattern.structural.adapter.objectadapter;

/**
 * @Author Flagship
 * @Date 2020/11/16 20:36
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target targetAdapter = new Adapter();
        targetAdapter.request();
    }
}
