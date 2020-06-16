package com.lpgu.factory.model.factorymethod.order;

import com.lpgu.factory.model.factorymethod.pizza.BJCheesePizza;
import com.lpgu.factory.model.simple.pizzastore.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }
        //...
        return null;
    }
}
