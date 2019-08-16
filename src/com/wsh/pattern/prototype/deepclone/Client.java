package com.wsh.pattern.prototype.deepclone;

import com.wsh.pattern.prototype.shallowclone.Sheep;

/**
 * @author：Administrator
 * @date：2019/8/13
 * @describe：测试类
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType p = new DeepProtoType();
        p.name = "小明";
        p.deepCloneableTarget = new DeepCloneableTarget("小红", "小红");
        //方式1 深拷贝
        DeepProtoType p2 = (DeepProtoType) p.clone();
        System.out.println("p.name="+p.name+", "+"p.deepCloneableTarget="+p.deepCloneableTarget.hashCode());
        System.out.println("p2.name="+p2.name+", "+"p2.deepCloneableTarget="+p2.deepCloneableTarget.hashCode());
        System.out.println("------------------------------------------");
        //方式2 深拷贝
        DeepProtoType p3 = (DeepProtoType) p.deepClone();
        System.out.println("p.name="+p.name+", "+"p.deepCloneableTarget="+p.deepCloneableTarget.hashCode());
        System.out.println("p3.name="+p3.name+", "+"p3.deepCloneableTarget="+p3.deepCloneableTarget.hashCode());
    }
}
