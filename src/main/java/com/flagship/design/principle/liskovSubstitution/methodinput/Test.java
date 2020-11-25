package com.flagship.design.principle.liskovSubstitution.methodinput;

import java.util.HashMap;

/**
 * @ClassName: Test
 * @Author: Flagship
 * @Description:
 * @Date: 2020/10/30 23:43
 */
public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        HashMap hashMap = new HashMap();
        child.method(hashMap);
    }
}
