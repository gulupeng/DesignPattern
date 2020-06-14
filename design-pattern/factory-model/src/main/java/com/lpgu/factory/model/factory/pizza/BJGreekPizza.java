package com.lpgu.factory.model.factory.pizza;

import com.lpgu.factory.model.simple.pizzastore.pizza.Pizza;

public class BJGreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(" 给北京希腊披萨准备原材料 ");
    }
}
