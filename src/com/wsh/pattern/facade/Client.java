package com.wsh.pattern.facade;

/**
 * 外观模式-测试类
 * @author wsh
 * @date 2019-10-05 13:53
 */
public class Client {

    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();
        homeTheaterFacade.end();
    }
}
