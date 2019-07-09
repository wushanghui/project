package com.wsh.pattern.principle.inversion;

/**
 * class
 *
 * @author wsh
 * @date 2019-07-07 18:09
 */
public class DependencyInversion {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email {
    public String getInfo() {
        return "电子邮件信息：email";
    }
}

/**
 * 方式一：
 * 1、比较简单
 * 2、如果获取的对象是微信，短信或者其他类型的信息等等，则要增加类，同时Persion也要增加相应的接收方法
 * 3、解决思路：引入一个抽象接口IReceiver 表示接收者，Person类和IReceiver发生依赖
 * 使用依赖倒转原则
 */
class Person {

    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}




