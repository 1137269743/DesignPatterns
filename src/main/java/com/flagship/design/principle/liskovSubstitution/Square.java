package com.flagship.design.principle.liskovSubstitution;

/**
 * @ClassName: Square
 * @Author: Flagship
 * @Description:
 * @Date: 2020/10/30 23:25
 */
public class Square implements Quadrangle{
    private long sideLength;

    @Override
    public long getWidth() {
        return sideLength;
    }

    @Override
    public long getLength() {
        return sideLength;
    }
}
