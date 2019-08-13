package com.wsh.pattern.factory.simplefactory;

/**
 * @author：Administrator
 * @date：2019/8/13
 * @describe：工厂测试类
 */
public class FactoryTest {

    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender weixin = factory.produce("weixin");
        if (weixin != null) {
            weixin.send();
        }
    }
}
