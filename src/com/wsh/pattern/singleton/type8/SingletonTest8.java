package com.wsh.pattern.singleton.type8;

/**
 * 8、枚举class
 *
 *    ******** 推荐使用 *******
 *
 * @author wsh
 * @date 2019-07-16 23:08
 */
public class SingletonTest8 {
    public static void main(String[] args) {
        System.out.println("枚举 test.....");
        //测试
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        //ture
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode=" + instance1.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
        instance1.sayOK();
    }
}

enum  Singleton {
    INSTANCE;

    public void sayOK() {
        System.out.println("ok~");
    }
}
