package com.wsh.pattern.decorator;

import java.math.BigDecimal;

/**
 * 牛奶
 * @author wsh
 * @date 2019-09-28 20:40
 */
public class Milk extends Decorator {

    public Milk(Drink obj) {
        super(obj);
        setDes("牛奶");
        setPrice(BigDecimal.valueOf(2.00D));
    }
}
