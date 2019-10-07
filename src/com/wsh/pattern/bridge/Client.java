package com.wsh.pattern.bridge;

/**
 * @author wsh
 * @date 2019-09-28 15:24
 */
public class Client {

    public static void main(String[] args) {
        //获取折叠式手机
        FoldedPhone phone1 = new FoldedPhone(new Apple());
        phone1.open();
        phone1.call();
        phone1.close();

        System.out.println("----------------------------");

        FoldedPhone phone2 = new FoldedPhone(new Huawei());
        phone2.open();
        phone2.call();
        phone2.close();

        System.out.println("----------------------------");

        UpRightPhone phone3 = new UpRightPhone(new Apple());
        phone3.open();
        phone3.call();
        phone3.close();

        System.out.println("----------------------------");

        UpRightPhone phone4 = new UpRightPhone(new Huawei());
        phone4.open();
        phone4.call();
        phone4.close();
    }
}
