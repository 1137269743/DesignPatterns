package com.flagship.design.pattern.creational.abstractfactory;

/**
 * @ClassName: PythonArticle
 * @Author: Flagship
 * @Description:
 * @Date: 2020/11/1 0:03
 */
public class PythonArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写Python课程手记");
    }
}
