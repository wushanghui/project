package com.wsh.pattern.adapter.objectadapter;

/**
 *
 * @author wsh
 * @date 2019-09-25 22:05
 */
public class Phone {

    /**
     * 充电
     * @param iVoltage5V 适配接口
     */
    public void charging(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5V() == 5) {
            System.out.println("电压为5v，可以充电。");
        } else if (iVoltage5V.output5V() > 5) {
            System.out.println("电压大于5v，不能充电！");
        }
    }
}
