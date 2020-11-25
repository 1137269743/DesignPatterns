package com.flagship.design.pattern.structural.adapter.objectadapter;

/**
 * @Author Flagship
 * @Date 2020/11/16 20:30
 * @Description
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }
}
