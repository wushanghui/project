package com.wsh.pattern.template;

/**
 * @author wsh
 * @date 2019-10-05 21:16
 */
public class RedBeanSoyaMilk extends SoyaMilk {

    @Override
    void addCondiments() {
        System.out.println("第二步：加入红豆");
    }

    /**
     * 不添加配料
     * @return
     */
    @Override
    boolean addCondimentsFlag() {
        return false;
    }
}
