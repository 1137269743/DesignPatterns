package com.flagship.design.principle.liskovSubstitution.methodinput;

import java.util.HashMap;

/**
 * @ClassName: Base
 * @Author: Flagship
 * @Description:
 * @Date: 2020/10/30 23:40
 */
public class Base {
    public void method(HashMap map) {
        System.out.println("父类被调用");
    }
}
