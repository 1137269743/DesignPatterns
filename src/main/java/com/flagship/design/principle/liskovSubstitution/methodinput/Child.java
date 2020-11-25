package com.flagship.design.principle.liskovSubstitution.methodinput;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: Child
 * @Author: Flagship
 * @Description:
 * @Date: 2020/10/30 23:41
 */
public class Child extends Base{
    @Override
    public void method(HashMap map) {
        System.out.println("子类HashMap入参方法被执行");
    }

    public void method(Map map) {
        System.out.println("子类Map入参方法被执行");
    }
}
