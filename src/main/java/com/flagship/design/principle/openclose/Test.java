package com.flagship.design.principle.openclose;

/**
 * @ClassName: Test
 * @Author: Flagship
 * @Description:
 * @Date: 2020/10/29 22:33
 */
public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(96,"Java从零到企业级开发",348d);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) iCourse;
        System.out.println("课程ID: " + javaCourse.getId());
        System.out.println("课程名称: " + javaCourse.getName());
        System.out.println("课程原价: " + javaCourse.getPrice());
        System.out.println("当前价格: " + javaCourse.getDiscountPrice());
    }
}
