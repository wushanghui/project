package com.wsh.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 学院
 * @author wsh
 * @date 2019-09-30 23:26
 */
public class College extends OrganizationComponent{

    /**
     * list 中存放department
     */
    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    public College(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        //实际业务汇中，Colleage 的 add 和 University 的 add 不一定要完全一样
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

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
        System.out.println("-----------"+getName()+"-----------");
        //遍历 organizationComponents
        organizationComponents.stream().forEach(item -> item.print());
    }
}
