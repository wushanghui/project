package com.wsh.pattern.decorator;

import java.math.BigDecimal;

/**
 * 黑咖啡
 * @author wsh
 * @date 2019-09-28 20:39
 */
public class LongBlack extends Coffee {

    public LongBlack() {
        setDes("longblack");
        setPrice(BigDecimal.valueOf(4.00D));
    }
}
