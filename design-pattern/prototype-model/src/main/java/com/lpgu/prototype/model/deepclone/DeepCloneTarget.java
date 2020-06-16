package com.lpgu.prototype.model.deepclone;

import java.io.Serializable;

public class DeepCloneTarget implements Serializable, Cloneable {
    private String cloneName;

    private String cloneClass;

    public DeepCloneTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
