package com.flagship.design.pattern.creational.singleton;

/**
 * @ClassName: LazySingleton
 * @Author: Flagship
 * @Description:
 * @Date: 2020/11/1 12:59
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;
    //private static boolean flag = true;

    private LazySingleton(){
//        if (flag) {
//            flag = false;
//        } else {
//            throw new RuntimeException("单例构造器禁止反射调用");
//        }
        if (lazySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }
    public synchronized static LazySingleton getInstance() {
        if(lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
