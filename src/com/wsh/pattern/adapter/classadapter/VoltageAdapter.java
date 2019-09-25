package com.wsh.pattern.adapter.classadapter;

/**
 * @author wsh
 * @date 2019-09-25 22:58
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    @Override
    public int output5V() {
        int srcV = super.output220V();
        //转成5v
        int dstV = srcV / 44;
        return dstV;
    }
}
