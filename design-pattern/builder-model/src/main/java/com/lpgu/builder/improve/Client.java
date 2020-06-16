package com.lpgu.builder.improve;

public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        houseDirector.constructHouse();
        HighHouse highHouse = new HighHouse();
        HouseDirector houseDirector1 = new HouseDirector(highHouse);
        houseDirector1.constructHouse();
    }
}

