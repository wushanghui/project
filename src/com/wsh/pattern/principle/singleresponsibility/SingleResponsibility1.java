package com.wsh.pattern.principle.singleresponsibility;

/**
 * 单一职责原则 1 class
 *
 * @author wsh
 * @date 2019-07-06 16:04
 */
public class SingleResponsibility1 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}

/**
 * 交通工具类
 * 方式一：
 * 1、run 方法中，违反了单一职责原则
 * 2、解决方案：根据交通工具运行方法不同，分解成不同的类，请看方式二
 */
class Vehicle {

    public void run(String vehicle) {
        System.out.println(vehicle + " 在公路上运行");
    }
}
