package com.example.brucewayne.deltaabstraction;

public class Switch {

    public void turnOnSwitchable (Switchable thing)
    {
        thing.turnOn();
    }

    public void turnOffSwitchable (Switchable thing)
    {
        thing.turnOff();
    }
}
