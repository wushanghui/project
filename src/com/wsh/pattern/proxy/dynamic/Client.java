package com.wsh.pattern.proxy.dynamic;


/**
 * 2、代理模式-动态代理（jdk代理）测试
 * @author wsh
 * @date 2019-10-05 16:55
 */
public class Client {

    public static void main(String[] args) {
        //1、创建目标对象（被代理对象）
        TeacherDao target = new TeacherDao();
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();

        System.out.println("proxyInstance="+proxyInstance.getClass());
        //proxyInstance=class com.sun.proxy.$Proxy0

        //2、通过代理对象，调用目标对象的方法
        proxyInstance.sayHello("Jerry");
    }

}
