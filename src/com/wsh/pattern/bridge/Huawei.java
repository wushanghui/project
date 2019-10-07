package com.wsh.pattern.bridge;

/**
 * 华为手机
 * @author wsh
 * @date 2019-09-28 15:21
 */
public class Huawei implements Brand {

    @Override
    public void open() {
        System.out.println("Huawei 手机开机");
    }

    @Override
    public void close() {
        System.out.println("Huawei 手机关机");
    }

    @Override
    public void call() {
        System.out.println("Huawei 手机打电话");
    }
}
