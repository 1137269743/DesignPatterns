package com.flagship.design.principle.liskovSubstitution;

/**
 * @ClassName: Rectangle
 * @Author: Flagship
 * @Description:
 * @Date: 2020/10/30 23:24
 */
public class Rectangle implements Quadrangle{
    private long length;
    private long width;

    public void setLength(long length) {
        this.length = length;
    }

    public void setWidth(long width) {
        this.width = width;
    }

    @Override
    public long getWidth() {
        return width;
    }

    @Override
    public long getLength() {
        return length;
    }
}
