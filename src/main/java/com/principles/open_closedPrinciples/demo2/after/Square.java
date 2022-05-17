package com.principles.open_closedPrinciples.demo2.after;

/**
 * @ClassName: Square
 * @date: 2022/3/22 20:16
 * @author: chenrui
 * @Description: 正方形类
 * @Version: 1.0
 */
public class Square extends Rectangle {

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }
}
