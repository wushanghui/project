package com.wsh.pattern.decorator;

import java.math.BigDecimal;

/**
 * 豆浆
 * @author wsh
 * @date 2019-09-28 20:41
 */
public class Soy extends Decorator{

    public Soy(Drink obj) {
        super(obj);
        setDes("豆浆");
        setPrice(BigDecimal.valueOf(1.50D));
    }
}
