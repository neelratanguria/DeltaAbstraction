package com.example.brucewayne.deltaabstraction;

import android.util.Log;

public class Fan extends Device implements Switchable {

    protected String fanName = "FAN";
    protected boolean isOn;

    public String getFanName()
    {
        return fanName;
    }

    public Fan()
    {
        setDeviceName("FAN");
    }

    public void breakDevice() {
        Log.e(getDeviceName(), "BANG!! CRASH!.....");
    }

    public void turnOn()
    {
        Log.e(getDeviceName(),"Whoooosshh");
    }

    public void turnOff()
    {
        Log.e(getDeviceName(),"Damn dude! It is hot in here");
    }
}
