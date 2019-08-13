package com.wsh.pattern.factory.simplefactory;

/**
 * @author：Administrator
 * @date：2019/8/13
 * @describe：邮件发送类
 */
public class MailSender implements Sender {

    @Override
    public void send() {
        System.out.println("邮件发送 . . . ");
    }
}
