package com.wsh.pattern.composite;

/**
 * 系
 * @author wsh
 * @date 2019-09-30 23:57
 */
public class Department extends OrganizationComponent {

    //没有集合

    public Department(String name, String des) {
        super(name, des);
    }

    //add, remove 不用写，因为是叶子节点


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
