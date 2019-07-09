package com.wsh.pattern.principle.singleresponsibility;

/**
 * class
 *
 * @author wsh
 * @date 2019-07-06 16:11
 */
public class SingleResponsibility2 {

    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("轮船");
    }
}

//方案二：
//1、遵守单一职责原则
//2、但改动很大，即将类分解，同时还要修改客户端
//3、改进：直接修改Vehicle 类， 改动代码较少，请看方式三

/**
 * 公路上运行的交通工具
 */
class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " 在公路上运行");
    }
}

/**
 * 在天空中运行的交通工具
 */
class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " 在天空上运行");
    }
}

/**
 * 在水中运行的交通工具
 */
class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " 在水中上运行");
    }
}