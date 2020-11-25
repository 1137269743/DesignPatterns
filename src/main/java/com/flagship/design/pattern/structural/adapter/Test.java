package com.flagship.design.pattern.structural.adapter;

/**
 * @Author Flagship
 * @Date 2020/11/16 20:47
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        dc5.outputDC5V();

    }
}
