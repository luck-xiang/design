package com.kxiang.design;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.kxiang.design.factory.FactoryActivity;
import com.kxiang.design.observer.ObserverActivity;
import com.kxiang.design.proxy.ProxyActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends BaseActivity {

    private InternetBroadcast internetBroadcast;
    private ListView main_listview_id;
    private MainListAdapter<Map<String, Object>> mainListAdapter;
    private List<Map<String, Object>> data;
    private LinearLayout tv_internet_show_id;
    private Handler handler = new Handler(Looper.getMainLooper());


    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        // 全屏无状态栏和标题栏
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initView(savedInstanceState);
        initBLL(savedInstanceState);

    }


    @Override
    protected void initView(Bundle savedInstanceState) {
        registerInternet();
        data = getData();

        main_listview_id = (ListView) findViewById(R.id.main_listview_id);
        tv_internet_show_id = (LinearLayout) findViewById(R.id.tv_internet_show_id);
    }

    @Override
    protected void initBLL(Bundle savedInstanceState) {
        changInternew();
        mainListAdapter = new MainListAdapter(this);
        main_listview_id.setAdapter(mainListAdapter);
        mainListAdapter.setListAll(data);
        main_listview_id.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Map<String, Object> map = data.get(i);
                Intent intent = (Intent) map.get("intent");
                startActivity(intent);
            }
        });
    }


    public List<Map<String, Object>> getData() {
        List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();


        addItem(data, "工厂模式", FactoryActivity.class);
        addItem(data, "代理模式", ProxyActivity.class);
        addItem(data, "观察者模式和单利模式", ObserverActivity.class);


        return data;
    }


    public void addItem(List<Map<String, Object>> data, String name, Class<?> c) {
        addItem(data, name, new Intent(this, c));

    }

    protected void addItem(List<Map<String, Object>> data, String name,
                           Intent intent) {
        Map<String, Object> temp = new HashMap<String, Object>();
        temp.put("title", name);
        temp.put("intent", intent);
        data.add(temp);
    }

    /**
     * 动态注广播监听网络变化
     */

    public void registerInternet() {
        IntentFilter intentFilter = new IntentFilter();
        internetBroadcast = new InternetBroadcast();

        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        Log.e("tag", "Done1");
        registerReceiver(internetBroadcast, intentFilter);

    }

    public class InternetBroadcast extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            Log.e("tag", "InternetBroadcast");
            changInternew();

        }
    }

    /**
     * 网络是否开启图示UI
     */
    public void changInternew() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isAvailable()) {
            handler.post(new Runnable() {
                @Override
                public void run() {
                    tv_internet_show_id.setVisibility(View.GONE);
                }
            });
        } else {
            handler.post(new Runnable() {
                @Override
                public void run() {
                    tv_internet_show_id.setVisibility(View.VISIBLE);
                }
            });
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(internetBroadcast);
    }


}
