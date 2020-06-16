package com.lpgu.factory.model.factorymethod.pizza;

import com.lpgu.factory.model.simple.pizzastore.pizza.Pizza;

public class TJGreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(" 给天津希腊披萨准备原材料 ");
    }
}
