package com.kxiang.design.factory;

import android.util.Log;

/**
 * ClassName: DishesHongshaoPaigu
 * CreateDate: 2019-4-29 14:34
 * Author: kexiang
 */
public class DishesHongshaoPaigu implements DishesFunction {

    @Override
    public String cutVegetables() {
        Log.e(TAG,"DishesHongshaoPaigu:红烧排骨"+"切菜");
        return "红烧排骨" + "切菜";
    }

    @Override
    public String friedDishes() {
        Log.e(TAG,"DishesHongshaoPaigu:红烧排骨"+"做菜");
        return "红烧排骨" + "装盘";
    }

    @Override
    public String dishUp() {

        Log.e(TAG,"DishesHongshaoPaigu:红烧排骨"+"装盘");
        return "红烧排骨" + "装盘";
    }
}
