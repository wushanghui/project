package com.wsh.pattern.factory.simplefactory;

/**
 * @author：Administrator
 * @date：2019/8/13
 * @describe：发送工厂类
 */
public class SendFactory {

    /**
     * 构建产品
     * @param type 产品类型
     * @return 产品对象
     */
    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else if ("weixin".equals(type)) {
            return new WeixinSender();
        } else {
            System.out.println("请输入其他类型");
            return null;
        }
    }
}
