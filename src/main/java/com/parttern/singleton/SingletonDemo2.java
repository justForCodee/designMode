package com.parttern.singleton;

/**
 * @ClassName: SingletonDemo2
 * @date: 2022/3/24 10:54
 * @author: chenrui
 * @Description: DCL锁懒汉式
 * @Version: 1.0
 */
public class SingletonDemo2 {
    private volatile SingletonDemo2 singletonDemo2 = new SingletonDemo2();

    private SingletonDemo2() {
        throw new RuntimeException();
    }

    public SingletonDemo2 getInstance() {
        if (singletonDemo2 == null) {
            synchronized (SingletonDemo2.class) {
                if (singletonDemo2 == null) {
                    singletonDemo2 = new SingletonDemo2();
                }
            }
        }
        return singletonDemo2;
    }

    //当进行反序列化时会自动调用此方法
    public Object readResolve(){
        return singletonDemo2;
    }
}
