package com.lpgu.adapter.model.classadpater;

public class client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
