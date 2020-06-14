package com.lpgu.single.model.type1;

public class SingletonTest1 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}

//饿汉式（静态变量)

/**
 * 优点：
 *    这种方法比较简单，在类装载的时候就完成实例化，避免了线程同步问题
 * 缺点：
 *    在类加载的时候就实例化，没有达到Lazy loading 效果，如果从始至终从未使用这个实例，则会造成内存浪费
 * 结论:
 *    这种单例模式可用，可能造成内存浪费
 */
class Singleton {
    //1、构造器私有化，外部不能new
    private Singleton(){

    }
    //2、类内部构建对象
    private final static Singleton instance = new Singleton();
    //3、提供一个公共的静态方法返回实例对象
    public static Singleton getInstance(){
        return instance;
    }

}