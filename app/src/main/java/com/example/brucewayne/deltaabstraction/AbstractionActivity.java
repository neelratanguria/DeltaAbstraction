package com.example.brucewayne.deltaabstraction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AbstractionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abstraction);

        Fan myFan = new Fan();
        Light myLight = new Light();

        myFan.breakDevice();
        myLight.breakDevice();

        Switch mySwitch = new Switch();

        // Connecting device to turn on and off method
        mySwitch.wireUp(myFan);         // Connecting fan
        mySwitch.wireUp(myLight);       // Connecting light

        // Turn On all the devices
        mySwitch.flipSwitchUp();

        // Turn Off all the devices
        mySwitch.flipSwitchDown();

        // Disconnect fan
        mySwitch.unWire(myFan);

        // Turn On all the devices
        mySwitch.flipSwitchUp();
    }
}
