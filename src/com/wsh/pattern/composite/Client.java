package com.wsh.pattern.composite;

/**
 * 组合模式-测试
 * @author wsh
 * @date 2019-09-30 23:25
 */
public class Client {

    public static void main(String[] args) {
        //创建学校
        OrganizationComponent university = new University("清华大学", "中国顶级大学");

        //创建学院
        OrganizationComponent computerCollege = new College("计算机学院", "计算机学院");
        OrganizationComponent mechanicalCollege = new College("机械工程学院", "机械工程学院");

        //创建学院下面的系（专业）
        computerCollege.add(new Department("软件工程", "软件工程"));
        computerCollege.add(new Department("计算机科学与技术", "计算机科学与技术"));
        computerCollege.add(new Department("网络工程", "网络工程"));

        mechanicalCollege.add(new Department("机械设计与自动化", "机械设计与自动化"));
        mechanicalCollege.add(new Department("模具设计与制造", "模具设计与制造"));

        //将学院添加到学校
        university.add(computerCollege);
        university.add(mechanicalCollege);

        university.print();

    }
}
