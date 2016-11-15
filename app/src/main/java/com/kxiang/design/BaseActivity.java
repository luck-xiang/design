package com.kxiang.design;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Administrator on 2016/5/27.
 */
public abstract class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //打印当前创建的界面的activity
        Log.e("BaseActivity", "onCreate:" + getClass().getSimpleName() + "");

        //http://stackoverflow.com/questions/4341600/how-to-prevent-multiple-instances-of-an-activity-when-it-is-launched-with-differ/
        //理论上应该放在launcher activity,放在基类中所有集成此库的app都可以避免此问题
        if (!isTaskRoot()) {
            Intent intent = getIntent();
            String action = intent.getAction();
            Log.e("action", "onCreate:" + getClass().getSimpleName() + "");
            if (intent.hasCategory(Intent.CATEGORY_LAUNCHER) && action.equals(Intent.ACTION_MAIN)) {

                finish();
                return;
            }
        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("BaseActivity", "onDestroy:" + getClass().getSimpleName());
    }

    /**
     * 第一步：获得或者创建全局变量,对UI控件的一些初始化,通过id找到UI控件,注册点击事件
     *
     * @param savedInstanceState:onCreate中的参数savedInstanceState
     */
    protected abstract void initView(Bundle savedInstanceState);

    /**
     * 第二步：业务逻辑区域,业务逻辑（BLL）：封装业务处理功能
     *
     * @param savedInstanceState:onCreate中的参数savedInstanceState
     */

    protected abstract void initBLL(Bundle savedInstanceState);

}
