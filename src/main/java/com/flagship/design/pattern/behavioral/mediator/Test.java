package com.flagship.design.pattern.behavioral.mediator;

/**
 * @Author Flagship
 * @Date 2020/11/22 17:23
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        User flagship = new User("Flagship");
        User tom = new User("Tom");

        flagship.sendMessage(" Hey! Tom! Let's learn Design Pattern");
        tom.sendMessage("OK! Flagship");
    }
}
