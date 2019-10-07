package com.wsh.pattern.bridge;

/**
 * 苹果手机
 * @author wsh
 * @date 2019-09-28 15:21
 */
public class Apple implements Brand {

    @Override
    public void open() {
        System.out.println("苹果 手机开机");
    }

    @Override
    public void close() {
        System.out.println("苹果 手机关机");
    }

    @Override
    public void call() {
        System.out.println("苹果 手机打电话");
    }
}
