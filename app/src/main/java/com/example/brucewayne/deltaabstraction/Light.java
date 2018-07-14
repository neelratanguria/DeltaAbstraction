package com.example.brucewayne.deltaabstraction;

import android.util.Log;

public class Light extends Device {

    public Light()
    {
        setDeviceName("LIGHTS");
    }

    @Override
    public void breakDevice()
    {
        Log.e(getDeviceName(), "Lights");
    }
}
