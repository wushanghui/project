package com.wsh.pattern.bridge;

/**
 * 折叠式手机
 * @author wsh
 * @date 2019-09-28 15:12
 */
public class FoldedPhone extends Phone {

    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("折叠式手机");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("折叠式手机");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("折叠式手机");
    }
}
