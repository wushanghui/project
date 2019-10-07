package com.wsh.pattern.decorator;

import java.math.BigDecimal;

/**
 * 饮料
 * @author wsh
 * @date 2019-09-28 20:32
 */
public abstract class Drink {

    /**
     * 描述
     */
    private String des;

    /**
     * 价格
     */
    private BigDecimal price = BigDecimal.valueOf(0L);

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 计算费用
     * @return 费用
     */
    public abstract BigDecimal cost();
}
