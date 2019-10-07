package com.wsh.pattern.decorator;

import java.math.BigDecimal;

/**
 * @author wsh
 * @date 2019-09-28 20:30
 */
public class Decorator extends Drink{

    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public BigDecimal cost() {
        return super.getPrice().add(obj.cost());
    }

    @Override
    public String getDes() {
        return super.getDes()+" "+getPrice()+" && "+obj.getDes();
    }
}
