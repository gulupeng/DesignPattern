package com.lpgu.factory.model.factorymethod.pizza;

import com.lpgu.factory.model.simple.pizzastore.pizza.Pizza;

public class TJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给制作天津奶酪披萨准备原材料");
    }
}
