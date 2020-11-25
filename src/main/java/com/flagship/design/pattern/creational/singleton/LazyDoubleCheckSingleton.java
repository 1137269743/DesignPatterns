package com.flagship.design.pattern.creational.singleton;

/**
 * @ClassName: LazyDoubleCheckSingleton
 * @Author: Flagship
 * @Description:
 * @Date: 2020/11/1 13:41
 */
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;
    private LazyDoubleCheckSingleton(){
        if (lazyDoubleCheckSingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }
    public static LazyDoubleCheckSingleton getInstance() {
        if(lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
