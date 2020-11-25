package com.flagship.design.pattern.structural.adapter.objectadapter;

/**
 * @Author Flagship
 * @Date 2020/11/16 20:36
 * @Description
 */
public class Adapter implements Target {
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
