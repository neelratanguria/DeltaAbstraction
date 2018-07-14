package com.example.brucewayne.deltaabstraction;

import android.util.Log;

public class Light extends Device implements Switchable {

    public Light()
    {
        setDeviceName("LIGHTS");
    }

    @Override
    public void breakDevice()
    {
        Log.e(getDeviceName(), "Lights");
    }

    public void turnOn()
    {
        Log.e(getDeviceName(), "Light aa gya");
    }

    public void turnOff()
    {
        Log.e(getDeviceName(), "Ouch!! I hit my foot against couch");
    }
}
