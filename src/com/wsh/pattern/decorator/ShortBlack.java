package com.wsh.pattern.decorator;

import java.math.BigDecimal;

/**
 * 蒸馏咖啡
 * @author wsh
 * @date 2019-09-28 20:40
 */
public class ShortBlack extends Coffee {

    public ShortBlack() {
        setDes("shortblock");
        setPrice(BigDecimal.valueOf(4.00D));
    }
}
