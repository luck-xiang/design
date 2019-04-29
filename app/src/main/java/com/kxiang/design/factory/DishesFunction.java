package com.kxiang.design.factory;

/**
 * ClassName: IPhoneFunctionDao
 * CreateDate: 2019-4-29 11:12
 * Author: kexiang
 */
public interface DishesFunction {
    String TAG="DishesFunction";
    /**
     * 第一步，切菜，以及配料
     */
    String cutVegetables();

    /**
     * 第二步做菜
     */
    String friedDishes();

    /**
     * 第三步装盘，上菜
     */
    String dishUp();

}
