package com.lpgu.adapter.model.objectadapter;

public class VoltageAdapter implements IVoltage5V {
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V){
        this.voltage220V=voltage220V;
    }
    @Override
    public int output5V() {
        int dstV=0;
        if(null!=voltage220V){
            int src = voltage220V.output220v();
            dstV = src / 44;
        }
        return dstV;
    }
}
