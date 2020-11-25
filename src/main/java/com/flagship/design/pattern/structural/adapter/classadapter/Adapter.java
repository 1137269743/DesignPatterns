package com.flagship.design.pattern.structural.adapter.classadapter;

/**
 * @Author Flagship
 * @Date 2020/11/16 20:31
 * @Description
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.adapteeRequest();
    }
}
