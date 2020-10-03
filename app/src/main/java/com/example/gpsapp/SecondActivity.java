package com.example.gpsapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends Activity {
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
//Find your views
       button2 = (Button) findViewById(R.id.button2);

        //Assign a listener to your button
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1){
                //Start your second activity
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
}}
