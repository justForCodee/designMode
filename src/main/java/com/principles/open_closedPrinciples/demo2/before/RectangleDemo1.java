package com.principles.open_closedPrinciples.demo2.before;

/**
 * @ClassName: RectangleDemo
 * @date: 2022/3/22 20:29
 * @author: chenrui
 * @Description: TODO
 * @Version: 1.0
 */
public class RectangleDemo1 {
    public static void main(String[] args) {

        //创建长方形对象
        com.principles.open_closedPrinciples.demo2.before.Rectangle r = new com.principles.open_closedPrinciples.demo2.before.Rectangle();
        r.setLength(20L);
        r.setWidth(10L);
        resize(r);
        printLengthAndWidth(r);



    }

    public static void resize(com.principles.open_closedPrinciples.demo2.before.Rectangle rectangle) {
        //判断宽如果比长小 则进行扩宽
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    public static void printLengthAndWidth(Rectangle rectangle) {
        System.out.println(rectangle.getLength() + "");
        System.out.println(rectangle.getWidth() + "");

    }
}
