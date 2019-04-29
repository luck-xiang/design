package com.kxiang.design.singleton;

/**
 * ClassName: SingletonHunger
 * CreateDate: 2019-4-26 14:13
 * Author: kexiang
 * 饿汉式
 */
public class SingletonHunger {
    private final static SingletonHunger singletonHunger=new SingletonHunger();


    private SingletonHunger() {
    }
    public static SingletonHunger getInstance(){
        return singletonHunger;
    }
}
