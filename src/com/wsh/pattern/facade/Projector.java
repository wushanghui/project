package com.wsh.pattern.facade;

/**
 * 投影仪
 * @author wsh
 * @date 2019-10-05 11:56
 */
public class Projector {

    /**
     * 使用单例模式，饿汉式
     */
    private static Projector instance = new Projector();

    public static Projector getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("Projector on");
    }

    public void off() {
        System.out.println("Projector off");
    }

    /**
     * 聚焦
     */
    public void focus() {
        System.out.println("Projector focus ");
    }


}
