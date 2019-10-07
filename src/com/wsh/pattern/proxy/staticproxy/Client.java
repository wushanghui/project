package com.wsh.pattern.proxy.staticproxy;

/**
 * 1、代理模式-静态代理
 * @author wsh
 * @date 2019-10-05 16:13
 */
public class Client {

    public static void main(String[] args) {
        //1、创建目标对象（被代理对象）
        TeacherDao teacherDao = new TeacherDao();

        //2、创建代理对象，将被代理对象传递给代理对象
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);

        //3、通过代理对象，调用被代理对象的方法（执行的是代理对象的方法，代理对象再去调用目标对象的方法）
        teacherDaoProxy.teach();
    }
}
