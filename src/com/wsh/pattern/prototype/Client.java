package com.wsh.pattern.prototype;

/**
 * @author：Administrator
 * @date：2019/8/13
 * @describe：
 */
public class Client {

    public static void main(String[] args) {
        Sheep sheep = new Sheep("Dolly", 1, "白色");
        for (int i = 0; i < 10; i++) {
            Sheep cloneSheep = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
            System.out.println("克隆羊-"+(i+1)+"-"+cloneSheep);
        }
    }
}
