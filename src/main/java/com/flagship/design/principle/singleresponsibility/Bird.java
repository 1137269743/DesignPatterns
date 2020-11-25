package com.flagship.design.principle.singleresponsibility;

/**
 * @ClassName: Bird
 * @Author: Flagship
 * @Description:
 * @Date: 2020/10/29 23:10
 */
public class Bird {
    public void mainMoveMode(String birdName){
        if ("鸵鸟".equals(birdName))
            System.out.println(birdName + "用脚走");
        else
            System.out.println(birdName + "用翅膀飞");
    }
}
