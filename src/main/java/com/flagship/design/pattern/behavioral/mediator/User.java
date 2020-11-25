package com.flagship.design.pattern.behavioral.mediator;

/**
 * @Author Flagship
 * @Date 2020/11/22 17:23
 * @Description
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        StudyGroup.showMessage(this, message);
    }
}
