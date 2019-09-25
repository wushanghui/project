package com.wsh.pattern.builder.improve;

/**
 * class
 * 具体建造者-普通房子
 * @author wsh
 * @date 2019-09-24 23:07
 */
public class CommonHouse extends HouseBuilder {

    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基5米");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙10cm");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子封顶");
    }
}
