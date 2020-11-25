package com.flagship.design.pattern.creational.singleton;

/**
 * @ClassName: StaticInnerClassSingleton
 * @Author: Flagship
 * @Description:
 * @Date: 2020/11/1 13:56
 */
public class StaticInnerClassSingleton {

    //防御反射攻击
    private StaticInnerClassSingleton(){
        if (InnerClass.staticInnerClassSingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }

    //解决序列化破坏单例模式的问题
    private Object readResolve() {
        return InnerClass.staticInnerClassSingleton;
    }
}
