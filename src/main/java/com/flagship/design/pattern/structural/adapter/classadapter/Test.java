package com.flagship.design.pattern.structural.adapter.classadapter;

/**
 * @Author Flagship
 * @Date 2020/11/16 20:33
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
