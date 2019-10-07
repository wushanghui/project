package com.wsh.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 大学
 * @author wsh
 * @date 2019-09-30 23:32
 */
public class University extends OrganizationComponent {

    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    public University(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
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

    /**
     * 输出university 包含的学院
     */
    @Override
    protected void print() {
        System.out.println("-----------"+getName()+"-----------");
        //遍历 organizationComponents
        organizationComponents.stream().forEach(item -> item.print());
    }
}
