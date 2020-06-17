package com.lpgu.adapter.model.classadpater;

public class VoltageAdapter extends Voltage220V implements IVoltage5V {


    @Override
    public int output5V() {
         int src =output220v();
         int dstV= src/44;
        return dstV;
    }
}
