package com.wsh.pattern.factory.simplefactory;

/**
 * @author：Administrator
 * @date：2019/8/13
 * @describe：微信发送类
 */
public class WeixinSender implements Sender {
    @Override
    public void send() {
        System.out.println("微信发送 ... ");
    }
}
