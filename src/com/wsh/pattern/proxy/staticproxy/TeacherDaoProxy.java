package com.wsh.pattern.proxy.staticproxy;

/**
 * 代理对象
 * @author wsh
 * @date 2019-10-05 16:09
 */
public class TeacherDaoProxy implements ITeacherDao{

    /**
     * 目标对象，通过接口来聚合
     */
    private ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }


    @Override
    public void teach() {
        System.out.println("代理开始，完成某些操作...");
        target.teach();
        System.out.println("提交");
    }
}
