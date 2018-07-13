package com.example.brucewayne.deltaabstraction;

public abstract class Device {
    protected String deviceName;
    protected boolean isOn;

    public abstract void breakDevice();

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceName(){
        return deviceName;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}
