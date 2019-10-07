package com.wsh.pattern.flyweight;

/**
 * 不同的用户就是外部状态
 * @author wsh
 * @date 2019-10-05 15:37
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
