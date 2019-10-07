package com.wsh.pattern.decorator;

import java.math.BigDecimal;

/**
 * 无因咖啡
 * @author wsh
 * @date 2019-09-28 20:32
 */
public class DeCaf extends Coffee {

    public DeCaf() {
        setDes("无因咖啡");
        setPrice(BigDecimal.valueOf(1.00D));
    }
}
