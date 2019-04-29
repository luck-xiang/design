package com.kxiang.design.proxy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.kxiang.design.BaseActivity;
import com.kxiang.design.R;

public class ProxyActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proxy);
        initView(savedInstanceState);
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        PhoneProxy phoneProxy = new PhoneProxy(new XiaoMiPhone());
        Log.e("XiaoMiPhone", phoneProxy.getCameraProperty() + "\n" + phoneProxy.getCpuTpye());
        phoneProxy = new PhoneProxy(new HuweiPhone());
        Log.e("HuweiPhone", phoneProxy.getCameraProperty() + "\n" + phoneProxy.getCpuTpye());
        IPhoneFunctionDao proxyFactory = (IPhoneFunctionDao) new PhoneProxyFactory(phoneProxy).getProxyInstance();

        // 执行方法   【代理对象】
        proxyFactory.getCameraProperty();
        proxyFactory.getMemorySize();
    }

    @Override
    protected void initBLL(Bundle savedInstanceState) {

    }
}
