package com.wsh.pattern.bridge;

/**
 * @author wsh
 * @date 2019-09-28 15:10
 */
public abstract class Phone {

    /**
     * 品牌
     */
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open() {
        brand.open();
    }

    protected void close() {
        brand.close();
    }

    protected void call() {
        brand.call();
    }
}
