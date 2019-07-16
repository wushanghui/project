package com.wsh.pattern.singleton.type5;

/**
 * 5、懒汉式（线程安全，同步方法）class
 *
 * @author wsh
 * @date 2019-07-16 22:20
 */
public class SingletonTest5 {

    public static void main(String[] args) {
        System.out.println("懒汉式3（线程安全，同步方法） test.....");
        //测试
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        //ture
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode=" + instance1.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

class Singleton {

    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}
