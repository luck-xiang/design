package com.kxiang.design.observer;

/**
 * 项目名称:design
 * 创建人:kexiang
 * 创建时间:2016/11/15 12:45
 * 被观察着
 */

public interface BaseObservable {

    /**
     * 添加观察者
     *
     * @param observer
     */
    void addObserver(BaseObserver observer);
    /**
     * 添加观察者
     *
     * @param observer
     */
    void removeObserver(BaseObserver observer);
    /**
     * 发布消息，提示所以观察着
     *
     * @param string
     */
     void publishTheNews(String string) ;

}
