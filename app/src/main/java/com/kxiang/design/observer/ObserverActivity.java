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

        FansObserver observer = new FansObserver("粉丝1");
        FansObserver observer1 = new FansObserver("粉丝2");
        FansObserver observer2 = new FansObserver("粉丝3");
        BaseObserver observer3 = new BaseObserver() {
            @Override
            public void receiveMessage(String message) {

                Log.e("BaseObserver", "粉丝4");
            }
        };

        StartObservable.getStartObservable().addObserver(observer);
        StartObservable.getStartObservable().addObserver(observer1);
        StartObservable.getStartObservable().addObserver(observer2);
        StartObservable.getStartObservable().addObserver(observer3);

    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn_1:
                add();
                break;
            case R.id.btn_2:
                StartObservable.getStartObservable().publishTheNews("今天多云");
                break;


        }

    }
}
