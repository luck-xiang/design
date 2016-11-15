package com.kxiang.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 项目名称:design
 * 创建人:kexiang
 * 创建时间:2016/11/15 12:44
 */

public class StartObservable implements BaseObservable {


    private List<BaseObserver> observerList;

    //单利模式
    private static StartObservable startObservable;

    private StartObservable() {
        observerList = new ArrayList<>();
    }

    public static StartObservable getStartObservable() {

        if (startObservable == null) {
            synchronized (StartObservable.class) {
                if (startObservable == null) {
                    startObservable = new StartObservable();
                }
            }
        }
        return startObservable;

    }


    @Override
    public void addObserver(BaseObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(BaseObserver observer) {
        observerList.remove(observer);
    }
    @Override
    public void publishTheNews(String string) {
        for (BaseObserver observer : observerList) {
            observer.receiveMessage(string);
        }

    }

}
