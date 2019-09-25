package com.wsh.pattern.builder.improve;

/**
 * class
 *
 * @author wsh
 * @date 2019-09-24 23:11
 */
public class HighHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("高楼打地基100米");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼砌墙20cm");
    }

    @Override
    public void roofed() {
        System.out.println("高楼透明玻璃屋顶");
    }
}
