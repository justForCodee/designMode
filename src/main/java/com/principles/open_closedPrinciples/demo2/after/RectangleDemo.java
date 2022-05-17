package com.principles.open_closedPrinciples.demo2.after;

/**
 * @ClassName: RectangleDemo
 * @date: 2022/3/22 20:17
 * @author: chenrui
 * @Description: TODO
 * @Version: 1.0
 */
public class RectangleDemo {
    public static void main(String[] args) {
        //创建长方形对象
        Rectangle r = new Rectangle();
        r.setLength(20L);
        r.setWidth(10L);
        resize(r);
        printLengthAndWidth(r);
        System.out.printf("=========================");
        Square s = new Square();
        s.setWidth(10L);
        resize(s);
        printLengthAndWidth(s);
        /**
         * 发现重写了父类的方法导致代码出现死循环
         * 所以 违背了 里氏代换原则
         *  基类能使用的地方子类也能够使用(这里子类不能使用)
         */
    }

    public static void resize(Rectangle rectangle) {
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
