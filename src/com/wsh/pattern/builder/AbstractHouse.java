package com.wsh.pattern.builder;

/**
 * @author：Administrator
 * @date：2019/9/19
 * @describe：房子抽象类
 */
public abstract class AbstractHouse {

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
     * 建造房子
     */
    public void build() {
        buildBasic();
        buildWalls();
        roofed();
    }
}
