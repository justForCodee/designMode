package com.principles.open_closedPrinciples.demo2.before;

/**
 * @ClassName: Rectangle
 * @date: 2022/3/22 20:16
 * @author: chenrui
 * @Description: 长方形
 * @Version: 1.0
 */
public class Rectangle implements Quadrilateral {
    private double length;
    private double width;


    public void setLength(double length) {
        this.length = length;
    }


    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double getWidth() {
        return width;
    }
}
