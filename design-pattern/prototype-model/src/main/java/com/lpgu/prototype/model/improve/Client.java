package com.lpgu.prototype.model.improve;

public class Client {

    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 12, "white");
        sheep.setFriend(new Sheep("aa", 11, "aa"));
        Sheep sheep2 = (Sheep) sheep.clone();
        System.out.println(sheep.toString());
        System.out.println(sheep2.toString());
        System.out.println(sheep == sheep2);
    }
}
