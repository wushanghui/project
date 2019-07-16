package com.wsh.pattern.singleton.type7;

/**
 * 7、静态内部类 class
 * 1）类装载机制保证初始化实例时只有一个线程
 * 2）在Singleton 类被装载时不会立即实例化，需要实例化时，调用gitInstance 方法，才会装载 SingletonInstance 类，完成实例化
 * 3）类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们保证了线程的安全性，在类进行
 *    初始化时，别的线程是无法进入的。
 *
 *    ******** 推荐使用 *******
 *
 * @author wsh
 * @date 2019-07-16 22:55
 */
public class SingletonTest7 {

    public static void main(String[] args) {
        System.out.println("静态内部类 test.....");
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

    private static volatile Singleton instance;

    private Singleton() {}

    /**
     * 静态内部类，有一个静态属性Singleton
     */
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    /**
     * 提供一个静态的公有方法，直接返回静态内部类的静态属性
     * @return
     */
    public static synchronized Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}