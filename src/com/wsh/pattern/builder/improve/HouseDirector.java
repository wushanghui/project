package com.wsh.pattern.builder.improve;

/**
 * class
 *  指挥者
 * @author wsh
 * @date 2019-09-24 23:13
 */
public class HouseDirector {

    HouseBuilder houseBuilder = null;

    /**
     * 通过构造器传入 houseBuilder
     * @param houseBuilder 抽象的建造者
     */
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    /**
     * 通过setter 方法
     * @param houseBuilder 抽象的建造者
     */
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    /**
     * 如何构建房子的具体流程，交由指挥者处理
     * @return house
     */
    public House constructHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
