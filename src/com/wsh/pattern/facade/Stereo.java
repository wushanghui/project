package com.wsh.pattern.facade;

/**
 * 立体声
 * @author wsh
 * @date 2019-10-05 11:56
 */
public class Stereo {

    /**
     * 使用单例模式，饿汉式
     */
    private static Stereo instance = new Stereo();

    public static Stereo getInstance() {
        return instance;
    }

    public void up() {
        System.out.println("Stereo up");
    }

    public void down() {
        System.out.println("Stereo down");
    }

    public void on() {
        System.out.println("Stereo on");
    }

    public void off() {
        System.out.println("Stereo off");
    }

}
