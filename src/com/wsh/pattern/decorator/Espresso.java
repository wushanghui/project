package com.wsh.pattern.decorator;

import java.math.BigDecimal;

/**
 * 意大利-浓咖啡
 * @author wsh
 * @date 2019-09-28 20:38
 */
public class Espresso extends Coffee {

    public Espresso() {
        setDes("意大利咖啡");
        setPrice(BigDecimal.valueOf(6.00D));
    }
}
