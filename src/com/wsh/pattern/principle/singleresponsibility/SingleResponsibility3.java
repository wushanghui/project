package com.wsh.pattern.principle.singleresponsibility;

/**
 * class
 *
 * @author wsh
 * @date 2019-07-06 16:19
 */
public class SingleResponsibility3 {

    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.runRoad("摩托车");
        vehicle2.runAir("飞机");
        vehicle2.runWater("轮船");
    }
}

/**
 * 交通工具类
 * 方式三：
 * 1、这种修改方法没有对原来的类做大的改动，只是增加方法
 * 2、这里在类的级别上没有遵守单一职责原则，但在方法级别上遵守了
 */
class Vehicle2 {

    public void runRoad(String vehicle) {
        System.out.println(vehicle + " 在公路上运行");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + " 在天空上运行");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + " 在水中上运行");
    }
}