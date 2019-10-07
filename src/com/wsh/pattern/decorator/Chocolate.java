package com.wsh.pattern.decorator;

import java.math.BigDecimal;

/**
 * 巧克力
 * @author wsh
 * @date 2019-09-28 20:29
 */
public class Chocolate extends Decorator{


    public Chocolate(Drink obj) {
        super(obj);
        setDes("巧克力");
        setPrice(BigDecimal.valueOf(3.00D));
    }
}
