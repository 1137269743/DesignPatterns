package com.flagship.design.pattern.behavioral.observer.guavatest;

import com.google.common.eventbus.Subscribe;

/**
 * @Author Flagship
 * @Date 2020/11/22 16:12
 * @Description
 */
public class GuavaEvent {
    @Subscribe
    public void subscribe(String str) {
        System.out.println("执行subscribe方法，传入的参数是：" + str);
    }
}
