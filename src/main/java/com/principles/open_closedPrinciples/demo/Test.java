package com.principles.open_closedPrinciples.demo;

/**
 * @ClassName: Test
 * @date: 2022/3/21 23:07
 * @author: chenrui
 * @Description: TODO
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {

        ChildrenClass childrenClass = new ChildrenClass();
        Children2Class childrenClass2 = new Children2Class();

        Garden garden = new Garden();
//        garden.setAbstractClass(childrenClass);
        garden.setAbstractClass(childrenClass2);
        garden.play();
    }
}
