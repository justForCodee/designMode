package com.parttern.singleton;

/**
 * @ClassName: demo1
 * @date: 2022/3/24 10:45
 * @author: chenrui
 * @Description: 单例模式饿汉式
 * @Version: 1.0
 */
public class SingletonDemo {
    private SingletonDemo(){
        throw new RuntimeException();
    }
    private static SingletonDemo singletonDemo =  new SingletonDemo();

    public static SingletonDemo getInstance(){
        return singletonDemo;
    }

}
