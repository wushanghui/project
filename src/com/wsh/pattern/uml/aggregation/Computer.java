package com.wsh.pattern.uml.aggregation;

/**
 * class
 *
 * @author wsh
 * @date 2019-07-08 23:16
 */
public class Computer {

    private Mouse mouse;
    private Monitor monitor;

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
