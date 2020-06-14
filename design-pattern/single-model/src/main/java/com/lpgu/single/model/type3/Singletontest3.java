package com.lpgu.single.model.type3;

public class Singletontest3 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println("singleton1.hashcode="+singleton1.hashCode());
        System.out.println("singleton2.hashcode="+singleton2.hashCode());
    }
}
//懒汉式（线程不安全）

/**
 * 优点:
 *    1、起到了lazy loading 的效果，但是只能单线程使用
 * 缺点：
 *    如果在多线程的情况下，一个线程进入了 if里面，但是还没来得及及时执行，另外一个线程也进入了，就会产生多个实例
 * 结论：
 *    一般不用
 */
class Singleton {
    private static Singleton instance;
    private Singleton(){

    }
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}