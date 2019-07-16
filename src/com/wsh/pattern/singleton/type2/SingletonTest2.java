package com.wsh.pattern.singleton.type2;

/**
 * 2、饿汉式(静态变量) 测试 class
 *
 * @author wsh
 * @date 2019-07-12 23:31
 */
public class SingletonTest2 {

    public static void main(String[] args) {
        //测试
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        //ture
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode=" + instance1.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

/**
 * 和 test1 一样
 * 1) 这种方式和上面的方式其实类似，只不过将类实例化的过程放在了静态代码块中，也是在类装载的时候，
 * 就执 行静态代码块中的代码，初始化类的实例。优缺点和test1是一样的。
 * 2) 结论:这种单例模式可用，但是可能造成内存浪费
 */
class Singleton {

    /**
     * 1、私有化构造器，防止外部 new 对象
     */
    private Singleton() {

    }

    /**
     * 2、对象内部声明对象实例
     */
    private static Singleton instance;

    /**
     * 3、在静态代码块中，创建单例对象
     */
    static {
        instance = new Singleton();
    }

    /**
     * 4、提供一个公有的静态方法，获取实例对象
     */
    public static Singleton getInstance() {
        return instance;
    }
}
