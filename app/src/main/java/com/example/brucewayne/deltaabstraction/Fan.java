package com.example.brucewayne.deltaabstraction;

import android.util.Log;

public class Fan {

    protected String fanName = "FAN";
    protected boolean isOn;

    public String getFanName()
    {
        return fanName;
    }

    public void breakFan()
    {
        Log.e(getFanName(),"BANG!! CRASH!.....");
    }
}
