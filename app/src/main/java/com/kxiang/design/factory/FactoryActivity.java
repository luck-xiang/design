package com.kxiang.design.factory;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.kxiang.design.R;

public class FactoryActivity extends Activity {

    private TextView tvDishes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory);
        tvDishes = (TextView) findViewById(R.id.tvDishes);
    }

    public void HongshaoRou(View view) {
        tvDishes.setText(
                CookingFactory.work(
                        CookingFactory.getPhone(CookingFactory.HSR)
                )
        );

    }

    public void HongshaoPaigu(View view) {
        tvDishes.setText(
                CookingFactory.work(
                        CookingFactory.getPhone(CookingFactory.HSPG)
                )
        );
    }

}
