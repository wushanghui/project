package com.wsh.pattern.proxy.staticproxy;

/**
 * @author wsh
 * @date 2019-10-05 16:08
 */
public class TeacherDao implements ITeacherDao{


    @Override
    public void teach() {
        System.out.println("老师授课中 。。。。");
    }
}
