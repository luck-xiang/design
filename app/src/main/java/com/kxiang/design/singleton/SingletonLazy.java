package com.kxiang.design.singleton;

/**
 * ClassName: SingletonLazy
 * CreateDate: 2019-4-26 14:21
 * Author: kexiang
 */
public class SingletonLazy {
    private static SingletonLazy singletonLazy;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if (singletonLazy == null) {
            synchronized (SingletonLazy.class) {
                if (singletonLazy == null) {
                    singletonLazy = new SingletonLazy();
                }
            }
        }
        return singletonLazy;
    }
}
