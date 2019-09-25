package com.wsh.pattern.builder.improve;

/**
 * class
 *
 * @author wsh
 * @date 2019-09-24 23:19
 */
public class Client {

    public static void main(String[] args) {

        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        House house1 = houseDirector.constructHouse();

        System.out.println("--------------------");

        HighHouse highHouse = new HighHouse();
        houseDirector.setHouseBuilder(highHouse);
        houseDirector.constructHouse();
    }
}
