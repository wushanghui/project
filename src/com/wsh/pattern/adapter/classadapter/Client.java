package com.wsh.pattern.adapter.classadapter;

import java.sql.SQLOutput;

/**
 * class
 *
 * @author wsh
 * @date 2019-09-25 22:01
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("==== 类适配器模式 ====");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
