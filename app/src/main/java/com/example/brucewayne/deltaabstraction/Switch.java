package com.example.brucewayne.deltaabstraction;

import java.util.ArrayList;
import java.util.List;

public class Switch {

    private List<Switchable> switchableItems = new ArrayList<Switchable>();

    public void wireUp(Switchable thing)
    {
        switchableItems.add(thing);
    }

    public void unWire (Switchable thing)
    {
        switchableItems.remove(thing);
    }

    public void flipSwitchUp()
    {
        for (Switchable things: switchableItems)
        {
            things.turnOn();
        }
    }

    public void flipSwitchDown()
    {
        for (Switchable things: switchableItems)
        {
            things.turnOff();
        }
    }
}
