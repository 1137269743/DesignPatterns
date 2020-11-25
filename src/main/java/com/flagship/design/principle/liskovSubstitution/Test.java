package com.flagship.design.principle.liskovSubstitution;

/**
 * @ClassName: Test
 * @Author: Flagship
 * @Description:
 * @Date: 2020/10/30 23:27
 */
public class Test {
    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
            System.out.println("width:" + rectangle.getWidth() + " length:" + rectangle.getLength());
        }
        System.out.println("resize方法结束 width:" + rectangle.getWidth() + " length:" + rectangle.getLength());
    }

//    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle();
//        rectangle.setWidth(10);
//        rectangle.setLength(20);
//        resize(rectangle);
//    }
    public static void main(String[] args) {
        Square rectangle = new Square();
//        rectangle.setWidth(10);
//        rectangle.setLength(20);
//        resize(rectangle);
    }
}
