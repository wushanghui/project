package com.wsh.pattern.singleton.type1;

/**
 * 1、饿汉式(静态常量) 测试 class
 *
 * @author wsh
 * @date 2019-07-12 23:18
 */
public class SingletonTest01 {

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
 * 1) 优点:这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。
 * 2) 缺点:在类装载的时候就完成实例化，没有达到LazyLoading的效果。如果从始至终从未使用过这个实例，则
 * 会造成内存的浪费
 * 3) 这种方式基于classloder机制避免了多线程的同步问题，不过，instance在类装载时就实例化，
 * 在单例模式中大 多数都是调用 getInstance 方法，但是导致类装载的原因有很多种，
 * 因此不能确定有其他的方式(或者其他的静 态方法)导致类装载，这时候初始化 instance 就没有达到 lazy loading 的效果
 * 4) 结论:这种单例模式可用，可能造成内存浪费
 */
class Singleton {

    /**
     * 1、私有化构造器，防止外部 new 对象
     */
    private Singleton() {

    }

    /**
     * 2、对象内部创建对象实例
     */
    private final static Singleton INSTANCE = new Singleton();

    /**
     * 3、提供一个公有的静态方法，获取实例对象
     */
    public static Singleton getInstance() {
        return INSTANCE;
    }
}
