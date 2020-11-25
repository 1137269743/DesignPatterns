package com.flagship.design.pattern.creational.singleton;

/**
 * @ClassName: ThreadLocalInstance
 * @Author: Flagship
 * @Description: “单例”模式，对于某一线程来说，这个线程拿到的实例是唯一的
 * @Date: 2020/11/1 15:47
 */
public class ThreadLocalInstance {
    private static final ThreadLocal<ThreadLocalInstance> threadLocalInstanceThreadLocal = new ThreadLocal<ThreadLocalInstance>(){
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };

    private ThreadLocalInstance(){

    }

    public static ThreadLocalInstance getInstance(){
        return threadLocalInstanceThreadLocal.get();
    }
}
