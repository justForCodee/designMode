package com.principles.open_closedPrinciples.demo2.before;

/**
 * @ClassName: Square
 * @date: 2022/3/22 20:16
 * @author: chenrui
 * @Description: 正方形类
 * @Version: 1.0
 */
public class Square implements Quadrilateral {

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getLength() {
        return side;
    }

    @Override
    public double getWidth() {
        return side;
    }
}
