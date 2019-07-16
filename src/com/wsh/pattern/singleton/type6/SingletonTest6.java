package com.wsh.pattern.singleton.type6;

/**
 * 6、双重检查 class
 *
 *     ******** 推荐使用 *******
 *
 * @author wsh
 * @date 2019-07-16 22:25
 */
public class SingletonTest6 {
    public static void main(String[] args) {
        System.out.println("懒汉式4（双重检查、线程安全、延迟加载） test.....");
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
     * 双层检查代码，线程安全问题，懒加载
     * 推荐使用这种方式，即保证了线程安全，又顾及了效率
     * @return
     */
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
