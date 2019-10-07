package com.wsh.pattern.commond;

/**
 * @author wsh
 * @date 2019-10-06 15:24
 */
public class Client {

    public static void main(String[] args) {

        //遥控器
        RemoteController remoteController = new RemoteController();

        System.out.println("=======使用遥控器操作电灯========");
        //使用命令模式，通过遥控器，对电灯操作
        //创建电灯对象（接受者）
        LightReceiver lightReceiver = new LightReceiver();
        //创建电灯相关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        //设置命令，0-电灯
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);
        System.out.println("-----打开电灯-----");
        remoteController.onButtonWasPushed(0);
        System.out.println("-----关闭电灯-----");
        remoteController.offButtonWasPushed(0);
        System.out.println("-----撤销操作-----");
        remoteController.undoButtonWasPushed();

        System.out.println("=======使用遥控器操作电视机========");

        TVReceiver tvReceiver = new TVReceiver();
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
        //设置命令，1-电视机
        remoteController.setCommand(1, tvOnCommand, tvOffCommand);
        System.out.println("-----打开电视机-----");
        remoteController.onButtonWasPushed(1);
        System.out.println("-----关闭电视机-----");
        remoteController.offButtonWasPushed(1);
        System.out.println("-----撤销操作-----");
        remoteController.undoButtonWasPushed();
    }
}
