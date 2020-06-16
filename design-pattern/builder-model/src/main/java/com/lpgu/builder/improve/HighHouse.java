package com.lpgu.builder.improve;

public class HighHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("高房子打地基");
    }

    @Override
    public void buildWall() {
        System.out.println("高房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("高房子封顶");
    }

}
