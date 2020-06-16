package com.lpgu.prototype.model.deepclone;


public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType p = new DeepProtoType();
        p.name = "宋江";
        p.deepCloneTarget = new DeepCloneTarget("大牛", "小牛");
        //方式一，深拷贝
        DeepProtoType p1 = (DeepProtoType) p.clone();
        System.out.println("p.name=" + p.name + " p.deepCloneTarget=" + p.deepCloneTarget.hashCode());
        System.out.println("p1.name=" + p.name + " p1.deepCloneTarget=" + p1.deepCloneTarget.hashCode());
        //方式2，深拷贝
        DeepProtoType p2 = (DeepProtoType) p.deepClone();
        System.out.println("p2.name=" + p.name + " p2.deepCloneTarget=" + p2.deepCloneTarget.hashCode());
    }
}
