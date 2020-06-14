package com.lpgu.factory.model.simple.pizzastore;

import com.lpgu.factory.model.simple.pizzastore.pizza.CheesePizza;
import com.lpgu.factory.model.simple.pizzastore.pizza.GreekPizza;
import com.lpgu.factory.model.simple.pizzastore.pizza.Pizza;

//简单工厂类
public class SimpleFactory {

    public Pizza createPizza(String orderType){
        Pizza pizza =null;
            if(orderType.equalsIgnoreCase("greek")){
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            } else if (orderType.equalsIgnoreCase("cheese")){
                pizza = new CheesePizza();
                pizza.setName("奶酪披萨");
            }
           return pizza;
    }
}
