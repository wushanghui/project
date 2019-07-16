package com.wsh.pattern.singleton.type3;

/**
 * 3、懒汉式（线程不安全）class
 *
 * @author wsh
 * @date 2019-07-16 22:10
 */
public class SingletonTest3 {
    public static void main(String[] args) {
        System.out.println("懒汉式（线程不安全） test.....");
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

    /**
     * 提供一个公有的静态方法，使用时，才去创建实例
     * 懒汉式
     * @return
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}