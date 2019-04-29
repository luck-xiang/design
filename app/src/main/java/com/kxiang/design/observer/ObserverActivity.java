package com.kxiang.design.observer;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.kxiang.design.R;

public class ObserverActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer);
    }

    /**
     * 创建粉丝（观察者）并且将粉丝添加到明星（被观察者）中
     */
    private void add() {

        //创建观察者（创建追番的人）
        FansBilibiliAnimeObserver observer = new FansBilibiliAnimeObserver("追番者1");
        FansBilibiliAnimeObserver observer1 = new FansBilibiliAnimeObserver("追番者2");
        FansBilibiliAnimeObserver observer2 = new FansBilibiliAnimeObserver("追番者3");

        //订阅（点击追番）
        BilibiliAnimeObservable.getStartObservable().addObserver(observer);
        BilibiliAnimeObservable.getStartObservable().addObserver(observer1);
        BilibiliAnimeObservable.getStartObservable().addObserver(observer2);
        //你等等的番剧创作中，你在忙成的等待中………………
        //………………
        //更新啦，赶快去看吧……
        BilibiliAnimeObservable.getStartObservable().publishTheNews("五等分的新娘");

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn_1:
                add();
                break;
            case R.id.btn_2:
//                BilibiliAnimeObservable.getStartObservable().publishTheNews("今天多云");
                break;

        }

    }
}
