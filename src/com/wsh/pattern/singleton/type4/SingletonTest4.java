package com.wsh.pattern.singleton.type4;

/**
 * 4、懒汉式（线程安全，同步方法）class
 *
 * @author wsh
 * @date 2019-07-16 22:15
 */
public class SingletonTest4 {
    public static void main(String[] args) {
        System.out.println("懒汉式2（线程安全, 同步方法） test.....");
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
     * 加入同步处理的代码，解决线程安全问题
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