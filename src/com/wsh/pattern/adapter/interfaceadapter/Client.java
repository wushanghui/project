package com.wsh.pattern.adapter.interfaceadapter;

/**
 * 接口适配器模式-测试
 * @author wsh
 * @date 2019-09-26 21:49
 */
public class Client {

    public static void main(String[] args) {
        AbstractAdapter abstractAdapter = new AbstractAdapter() {
            @Override
            public void m1() {
                System.out.println("m1 method()");
            }
        };
        abstractAdapter.m1();
    }
}
