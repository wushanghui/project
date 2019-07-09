package com.wsh.pattern.principle.inversion.improve;

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
        person.receive(new Weixin());
    }
}

interface IReceiver {
    public String getInfo();
}

class Email implements IReceiver{

    @Override
    public String getInfo() {
        return "电子邮件信息：email";
    }
}

class Weixin implements IReceiver{

    @Override
    public String getInfo() {
        return "微信 信息：hello";
    }
}

/**
 * 方式二：
 * 使用依赖倒转原则
 */
class Person {

    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}




