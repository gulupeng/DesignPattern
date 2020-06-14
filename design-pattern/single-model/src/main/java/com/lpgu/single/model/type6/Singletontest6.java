package com.lpgu.single.model.type6;

public class Singletontest6 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println("singleton1.hashcode="+singleton1.hashCode());
        System.out.println("singleton2.hashcode="+singleton2.hashCode());
    }
}
//懒汉式（线程安全，静态内部类,推荐使用）

/**
 * 优点:
 *    1、起到了lazy loading 的效果，加入了同步代码块，解决了线程安全
 * 同时解决了效率问题
 */
class Singleton {

    private Singleton(){

    }
    public static  Singleton getInstance(){

        return singletonInstance.INSTANCE;
    }
    private static class singletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }
}