package com.wsh.pattern.template;

/**
 * 豆浆
 * @author wsh
 * @date 2019-10-05 21:08
 */
public abstract class SoyaMilk {

    /**
     * 模板方法，final修饰，不让子类去覆盖
     */
    final void make() {
        select();
        if (addCondimentsFlag()) {
            addCondiments();
        }
        soak();
        beat();
    }

    void select() {
        System.out.println("第一步：选择新鲜黄豆；");
    }

    /**
     * 添加不同的配料，由子类具体去实现
     */
    abstract void addCondiments();

    /**
     * 浸泡
     */
    void soak() {
        System.out.println("第三步：加入配料的黄豆开始浸泡，时长3小时；");
    }

    void beat() {
        System.out.println("第四步：泡好的黄豆放入豆浆机中打碎。");
    }

    /**
     * 钩子方法
     * 是否要添加配料，默认添加
     * 子类可重写是否要添加
     * @return
     */
    boolean addCondimentsFlag() {
        return true;
    }

}
