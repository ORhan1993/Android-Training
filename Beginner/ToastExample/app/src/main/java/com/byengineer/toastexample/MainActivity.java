package com.byengineer.toastexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button simple_toast,custom_toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simple_toast=findViewById(R.id.simple_toast_btn);
        custom_toast=findViewById(R.id.custom_toast_btn);

        simple_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Simple Toast Example", Toast.LENGTH_SHORT).show();
            }
        });

        custom_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LayoutInflater layoutInflater=getLayoutInflater();

                View layout=layoutInflater.inflate(R.layout.custom_toast,(ViewGroup) findViewById(R.id.custom_toast_layout));

                Toast toastExample=new Toast(com.byengineer.toastexample.MainActivity.this);
                toastExample.setDuration(Toast.LENGTH_SHORT);
                toastExample.setGravity(Gravity.CENTER,0,200);
                toastExample.setView(layout);
                toastExample.show();
            }
        });
    }
}