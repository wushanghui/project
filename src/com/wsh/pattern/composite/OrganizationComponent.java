package com.wsh.pattern.composite;

/**
 * @author wsh
 * @date 2019-09-30 23:27
 */
public abstract class OrganizationComponent {

    /**
     * 名字
     */
    private String name;
    /**
     * 说明
     */
    private String des;

    protected void add(OrganizationComponent organizationComponent) {
        //默认实现
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent) {
        //默认实现
        throw new UnsupportedOperationException();
    }

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    /**
     * print mothod
     */
    protected abstract void print();
}
