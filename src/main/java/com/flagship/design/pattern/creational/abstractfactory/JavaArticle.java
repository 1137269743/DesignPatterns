package com.flagship.design.pattern.creational.abstractfactory;

/**
 * @ClassName: JavaArtcle
 * @Author: Flagship
 * @Description:
 * @Date: 2020/11/1 0:01
 */
public class JavaArticle extends Article{
    @Override
    public void produce() {
        System.out.println("编写Java课程手记");
    }
}
