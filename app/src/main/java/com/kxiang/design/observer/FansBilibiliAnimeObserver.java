package com.kxiang.design.observer;

import android.util.Log;

/**
 * 项目名称:design
 * 创建人:kexiang
 * 创建时间:2016/11/15 12:46
 */

public class FansBilibiliAnimeObserver implements BaseObserver {

    //观察者的名称，id，唯一标识符等等
    private String name;

    public FansBilibiliAnimeObserver(String name) {
        this.name = name;
    }

    //被观察者发送到观察者的方法，用于番剧更新时通知追番的人
    @Override
    public void receiveMessage(String animeName) {
        Log.e("FansBilibiliAnime", name + "收到更新的动漫为：" + animeName);
    }
}
