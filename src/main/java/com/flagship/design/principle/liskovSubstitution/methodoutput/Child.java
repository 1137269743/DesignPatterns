package com.flagship.design.principle.liskovSubstitution.methodoutput;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: Child
 * @Author: Flagship
 * @Description:
 * @Date: 2020/10/30 23:48
 */

public class Child extends Base {
    @Override
    public HashMap method() {
        HashMap hashMap = new HashMap();
        System.out.println("子类method被执行");
        hashMap.put("message","子类method被执行");
        return hashMap;
    }
}
