package com.wsh.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author wsh
 * @date 2019-10-05 16:31
 */
public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * public static Object newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h)
     * ClassLoader loader 指定当前目标对象使用的类加载器
     * Class<?>[] interfaces 目标对象实现的接口类型
     * InvocationHandler h 事情处理，执行目标对象的方法时，会触发事情处理器方法，会把当前执行的目标对象方法作为参数传入
     * @return
     */
    public Object getProxyInstance() {
        Object instance = Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("jdk 代理开始");
                        //使用反射机制调用目标对象方法
                        Object val = method.invoke(target, args);
                        System.out.println("jdk 代理提交");
                        return val;
                    }
                });
        return instance;
    }

}
