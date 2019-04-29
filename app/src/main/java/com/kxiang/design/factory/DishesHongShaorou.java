package com.kxiang.design.factory;

import android.util.Log;

/**
 * ClassName: DishesHongShaorou
 * CreateDate: 2019-4-29 14:34
 * Author: kexiang
 */
public class DishesHongShaorou implements DishesFunction {

    @Override
    public String cutVegetables() {
        Log.e(TAG, "DishesHongShaorou:红烧肉" + "切菜");
        return "红烧肉" + "切菜";
    }

    @Override
    public String friedDishes() {
        Log.e(TAG, "DishesHongShaorou:红烧肉" + "炒菜");
        return "红烧肉" + "炒菜";
    }

    @Override
    public String dishUp() {

        Log.e(TAG, "DishesHongShaorou:红烧肉" + "装盘");
        return "红烧肉" + "装盘";
    }
}
