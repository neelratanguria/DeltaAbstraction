package com.example.brucewayne.deltaabstraction;

import android.util.Log;

public class Fan extends Device{

    protected String fanName = "FAN";
    protected boolean isOn;

    public String getFanName()
    {
        return fanName;
    }

    public Fan()
    {
        setDeviceName("NEWFAN");
    }

    public void breakFan()
    {
        Log.e(getFanName(),"BANG!! CRASH!.....");
    }

    @Override
    public void breakDevice() {
        Log.e(getDeviceName(), "BAAAAGG!!");
    }
}
