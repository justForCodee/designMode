package com.parttern.singleton;

/**
 * @ClassName: SingletonDemo3
 * @date: 2022/3/24 10:57
 * @author: chenrui
 * @Description: 静态内部类实现懒汉式单例
 * @Version: 1.0
 */
public class SingletonDemo3 {
    private SingletonDemo3(){

    }

    //定义一个静态内部类
    private static class SingletonHolder{
        //在内部类中声明并初始化外部类对象
        private static final SingletonDemo3 INSTANCE = new SingletonDemo3();
    }

    //提供公共访问方式
    public static SingletonDemo3 getInstance(){
        return SingletonHolder.INSTANCE;
    }



}
