package com.flagship.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * @ClassName: HungrySingleton
 * @Author: Flagship
 * @Description:
 * @Date: 2020/11/1 14:07
 */
public class HungrySingleton implements Serializable,Cloneable {
    private final static HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }

    //防御反射攻击
    private HungrySingleton(){
        if (hungrySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    //解决序列化破坏单例模式的问题
    private Object readResolve() {
        return hungrySingleton;
    }

    //解决通过反射调用克隆方法进行对单例模式的破坏
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}
