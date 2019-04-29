package com.kxiang.design.factory;

/**
 * ClassName: CookingFactory
 * CreateDate: 2019-4-29 14:36
 * Author: kexiang
 */
public class CookingFactory {
    public static final String HSPG = "hspg";
    public static final String HSR = "hsr";

    public static DishesFunction getPhone(String phone) {
        switch (phone) {
            case HSPG:
                return new DishesHongshaoPaigu();
            case HSR:
                return new DishesHongShaorou();
            default:
                return null;

        }
    }

    public static String work(DishesFunction dishes) {
        return "点菜完成：开始做菜\n"+dishes.cutVegetables() + "\n" + dishes.dishUp() + "\n" +
                dishes.friedDishes();
    }
}
