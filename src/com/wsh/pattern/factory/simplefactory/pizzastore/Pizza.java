package com.wsh.pattern.factory.simplefactory.pizzastore;

/**
 * class
 *
 * @author wsh
 * @date 2019-07-19 16:51
 */
public abstract class Pizza {

    protected String name;

    public abstract void prepare();

    /**
     * 烘烤
     */
    public void bake() {
        System.out.println(name + " baking;");
    }

    /**
     * 切
     */
    public void cut() {
        System.out.println(name + " cutting;");
    }

    /**
     * 装盒
     */
    public void box() {
        System.out.println(name + " boxing;");
    }

    public void setName(String name) {
        this.name = name;
    }
}
