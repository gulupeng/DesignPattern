package com.lpgu.single.model.type7;

public class Singleton8 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.INSTANCE;
        Singleton singleton2 = Singleton.INSTANCE;
        System.out.println(singleton1 == singleton2);
        System.out.println("singleton1.hashcode="+singleton1.hashCode());
        System.out.println("singleton2.hashcode="+singleton2.hashCode());
        singleton1.sayOk();
    }
}
//推荐使用，作者也推荐，防止反序列化创建对象
 enum Singleton {
    INSTANCE;
    
    public void sayOk(){
        System.out.println("ok~");
    }
 }