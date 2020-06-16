package com.lpgu.prototype.model;

public class Client {
    //浅克隆，对象不会克隆，都是同一个对象
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 12, "white");
        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        System.out.println(sheep.toString());
        System.out.println(sheep2.toString());
    }
}
