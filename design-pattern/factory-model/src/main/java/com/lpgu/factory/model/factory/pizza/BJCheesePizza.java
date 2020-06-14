package com.lpgu.factory.model.factory.pizza;

import com.lpgu.factory.model.simple.pizzastore.pizza.Pizza;

public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给制作北京奶酪披萨准备原材料");
    }
}
