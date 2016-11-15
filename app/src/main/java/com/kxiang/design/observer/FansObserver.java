package com.kxiang.design.observer;

import android.util.Log;

/**
 * 项目名称:design
 * 创建人:kexiang
 * 创建时间:2016/11/15 12:46
 */

public class FansObserver implements BaseObserver {

    private String name;

    public FansObserver(String name) {
        this.name = name;
    }

    @Override
    public void receiveMessage(String message) {
        Log.e("FansObserver", name + "收到消息：" + message);
    }
}
