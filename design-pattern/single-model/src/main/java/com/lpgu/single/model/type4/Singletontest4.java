package com.lpgu.single.model.type4;

public class Singletontest4 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println("singleton1.hashcode="+singleton1.hashCode());
        System.out.println("singleton2.hashcode="+singleton2.hashCode());
    }
}
//懒汉式（线程安全，同步方法）

/**
 * 优点:
 *    1、起到了lazy loading 的效果，加入了同步代码块，解决了线程安全
 * 缺点：
 *    效率太低，每一个线程在想获得实例的时候，都要进行同步
 * 结论：
 *    实际开发中不推荐使用
 */
class Singleton {
    private static Singleton instance;
    private Singleton(){

    }
    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}