package com.wsh.pattern.facade;

/**
 * 灯光
 * @author wsh
 * @date 2019-10-05 11:56
 */
public class TheaterLight {

    /**
     * 使用单例模式，饿汉式
     */
    private static TheaterLight instance = new TheaterLight();

    public static TheaterLight getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("TheaterLight on");
    }
    
    public void off() {
        System.out.println("TheaterLight off");
    }

    /**
     * 暗
     */
    public void dim() {
        System.out.println("TheaterLight dim");
    }

    /**
     * 亮
     */
    public void bright() {
        System.out.println("TheaterLight bright");
    }

}
