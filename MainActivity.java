package com.itlobby.assignment572018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Phone p=new Iphone("samsung",8);
        Log.e("Main Activity", "onCreate: " +p.printToLog());
    }
}
