package com.wsh.pattern.facade;

/**
 * dvd
 * @author wsh
 * @date 2019-10-05 11:56
 */
public class DVDPlayer {

    /**
     * 使用单例模式，饿汉式
     */
    private static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("dvd on");
    }

    public void off() {
        System.out.println("dvd off");
    }

    public void play() {
        System.out.println("dvd id playing ... ");
    }

    public void pause() {
        System.out.println("dvd pause ...");
    }
}
