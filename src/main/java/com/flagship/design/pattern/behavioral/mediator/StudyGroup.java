package com.flagship.design.pattern.behavioral.mediator;

import java.util.Date;

/**
 * @Author Flagship
 * @Date 2020/11/22 17:24
 * @Description
 */
public class StudyGroup {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] ：" + message);
    }
}
