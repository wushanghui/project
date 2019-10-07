package com.wsh.pattern.template;

/**
 * @author wsh
 * @date 2019-10-05 21:16
 */
public class PeanutSoyaMilk extends SoyaMilk {

    @Override
    void addCondiments() {
        System.out.println("第二步：加入花生；");
    }
}
