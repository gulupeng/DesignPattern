package com.lpgu.builder;

public abstract class AbstractBuilding {
    public abstract void buildBasic();

    public abstract void buildWall();

    public abstract void roofed();

    public void build(){
        buildBasic();
        buildWall();
        roofed();
    }
}
