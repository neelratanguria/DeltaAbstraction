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
    }
}
