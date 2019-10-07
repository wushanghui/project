package com.wsh.pattern.decorator;

/**
 * 订单测试
 * @author wsh
 * @date 2019-09-28 20:32
 */
public class CoffeeBar {

    public static void main(String[] args) {
        //订单：2份巧克力 + 一份牛奶的LongBlack
        //1. 点一份 LongBlack
        Drink order = new LongBlack();
        System.out.println("费用1 = "+order.cost());
        System.out.println("描述 = "+order.getDes());

        //2. order加入一份牛奶
        order = new Milk(order);
        System.out.println("加入一份牛奶 费用 = "+order.cost());
        System.out.println("加入一份牛奶 描述 = "+order.getDes());

        //3. order 加入一份巧克力
        order = new Chocolate(order);
        System.out.println("加入一份牛奶 加入一份巧克力 费用 = "+order.cost());
        System.out.println("加入一份牛奶 加入一份巧克力 描述 = "+order.getDes());

        //4. order 加入一份巧克力
        order = new Chocolate(order);
        System.out.println("加入一份牛奶 加入2份巧克力 费用 = "+order.cost());
        System.out.println("加入一份牛奶 加入2份巧克力 描述 = "+order.getDes());

    }
}
