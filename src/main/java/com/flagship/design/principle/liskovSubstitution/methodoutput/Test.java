package com.flagship.design.principle.liskovSubstitution.methodoutput;

/**
 * @ClassName: Test
 * @Author: Flagship
 * @Description:
 * @Date: 2020/10/30 23:49
 */
public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.method());
    }
}
