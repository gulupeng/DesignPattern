package com.lpgu.factory.model.simple.pizzastore.order;

import com.lpgu.factory.model.simple.pizzastore.SimpleFactory;
import com.lpgu.factory.model.simple.pizzastore.pizza.CheesePizza;
import com.lpgu.factory.model.simple.pizzastore.pizza.GreekPizza;
import com.lpgu.factory.model.simple.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OrderPizza {
//
//    public OrderPizza(){
//        Pizza pizza =null;
//        String orderType;//披萨类型
//        do{
//            orderType = getType();
//            if(orderType.equalsIgnoreCase("greek")){
//                pizza = new GreekPizza();
//                pizza.setName("希腊披萨");
//            } else if (orderType.equalsIgnoreCase("cheese")){
//                pizza = new CheesePizza();
//                pizza.setName("奶酪披萨");
//            }else {
//                break;
//            }
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        }while (true);
//    }
   SimpleFactory simpleFactory;
   Pizza pizza=null;

   public OrderPizza(SimpleFactory simpleFactory){
       setSimpleFactory(simpleFactory);
   }
   public void setSimpleFactory(SimpleFactory simpleFactory){
       String orderType = "";
       this.simpleFactory =simpleFactory;
       do {
           orderType = getType();
           pizza = this.simpleFactory.createPizza(orderType);
           if (pizza!=null){
               pizza.prepare();
               pizza.bake();
               pizza.cut();
               pizza.box();
           }else{
               System.out.println("订购失败");
               break;
           }
       }while (true);
   }

    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        } catch (Exception e){
            e.printStackTrace();
            return "";
        }
    }
}
