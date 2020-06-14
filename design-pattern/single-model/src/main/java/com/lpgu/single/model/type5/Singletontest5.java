package com.lpgu.single.model.type5;

public class Singletontest5 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println("singleton1.hashcode="+singleton1.hashCode());
        System.out.println("singleton2.hashcode="+singleton2.hashCode());
    }
}
//懒汉式（线程安全，双重检查，推荐使用）

/**
 * 优点:
 *    1、起到了lazy loading 的效果，加入了同步代码块，解决了线程安全
 * 同时解决了效率问题
 * 结论：
 *    推荐使用
 */
class Singleton {
    private static volatile Singleton instance;
    private Singleton(){

    }
    public static synchronized Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class) {
                if (instance ==null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}