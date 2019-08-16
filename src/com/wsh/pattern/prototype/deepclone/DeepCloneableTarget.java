package com.wsh.pattern.prototype.deepclone;

import java.io.Serializable;

/**
 * @author：Administrator
 * @date：2019/8/16
 * @describe：深拷贝
 */
public class DeepCloneableTarget implements Serializable, Cloneable {

    private static final long serialVersionUID = 4568063980530519948L;

    private String cloneName;
    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    /**
     * 该类的属性都是String, 因此使用默认的clone即可
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
