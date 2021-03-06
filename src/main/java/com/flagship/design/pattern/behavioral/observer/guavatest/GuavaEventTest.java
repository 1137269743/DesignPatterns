package com.flagship.design.pattern.behavioral.observer.guavatest;

import com.google.common.eventbus.EventBus;

/**
 * @Author Flagship
 * @Date 2020/11/22 16:13
 * @Description
 */
public class GuavaEventTest {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        eventBus.register(guavaEvent);
        eventBus.post("post的内容");
    }
}
