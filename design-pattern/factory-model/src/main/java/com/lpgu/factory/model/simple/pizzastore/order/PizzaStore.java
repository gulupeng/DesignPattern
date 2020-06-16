package com.lpgu.factory.model.simple.pizzastore.order;

import com.lpgu.factory.model.simple.pizzastore.SimpleFactory;

public class PizzaStore {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        OrderPizza orderPizza = new OrderPizza(simpleFactory);

    }
}
