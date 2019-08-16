package com.wsh.pattern.prototype.shallowclone;

/**
 * @author：Administrator
 * @date：2019/8/13
 * @describe：羊实体类-使用原型模式
 */
public class Sheep implements Cloneable {

    private String name;
    private int age;
    private String color;
    private String address = "内蒙古";
    //对象，克隆是会如何处理，默认是浅拷贝
    public Sheep friend;

    public Sheep(String name, int age, String color) {
        super();
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Sheep() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    /**
     * 克隆该实例，使用默认的clone 方法来实现
     * @return
     */
    @Override
    protected Object clone(){
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheep;
    }
}
