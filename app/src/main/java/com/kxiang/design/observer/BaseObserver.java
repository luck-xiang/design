package com.kxiang.design.observer;

/**
 * 项目名称:design
 * 创建人:kexiang
 * 创建时间:2016/11/15 12:46
 * 观察者
 */

public interface BaseObserver {

    /**
     * 接受观察者发送的消息
     * @param message
     */
    void receiveMessage(String message);
}