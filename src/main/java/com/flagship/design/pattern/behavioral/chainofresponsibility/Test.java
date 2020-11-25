package com.flagship.design.pattern.behavioral.chainofresponsibility;

/**
 * @Author Flagship
 * @Date 2020/11/22 17:37
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        Approver articleApprover = new ArticleApprover();
        Approver videoApprover = new VideoApprover();

        Course course = new Course();
        course.setName("Java设计模式精讲 -- By Flagship");
        course.setArticle("Java设计模式精讲手记");
        course.setVideo("Java设计模式精讲视频");

        articleApprover.setNextApprover(videoApprover);
        articleApprover.deploy(course);
    }
}
