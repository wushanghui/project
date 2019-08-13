package com.wsh.pattern.factory.simplefactory;

/**
 * @author：Administrator
 * @date：2019/8/13
 * @describe：短信发送
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("短信发送 ... ");
    }
}
