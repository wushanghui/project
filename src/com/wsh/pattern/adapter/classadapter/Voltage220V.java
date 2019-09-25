package com.wsh.pattern.adapter.classadapter;

/**
 * 被适配器类
 * @author wsh
 * @date 2019-09-25 22:08
 */
public class Voltage220V {

    /**
     * 输出220V电压
     * @return
     */
    public int output220V() {
        int src = 220;
        System.out.println("电压="+src+"伏");
        return src;
    }
}
