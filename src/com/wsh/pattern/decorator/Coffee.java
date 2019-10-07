package com.wsh.pattern.decorator;

import java.math.BigDecimal;

/**
 * 咖啡
 * @author wsh
 * @date 2019-09-28 20:31
 */
public class Coffee extends Drink{

    @Override
    public BigDecimal cost() {
        return super.getPrice();
    }
}
