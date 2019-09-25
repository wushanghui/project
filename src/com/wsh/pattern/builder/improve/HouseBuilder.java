package com.wsh.pattern.builder.improve;

/**
 * class
 * 抽象的建造者
 * @author wsh
 * @date 2019-09-24 23:00
 */
public abstract class HouseBuilder {

    protected House house = new House();

    /**
     * 打地基
     */
    public abstract void buildBasic();

    /**
     * 砌墙
     */
    public abstract void buildWalls();

    /**
     * 封顶
     */
    public abstract void roofed();

    /**
     * 建造好房子，返回该产品（房子）
     * @return house
     */
    public House buildHouse() {
        return house;
    }
}
