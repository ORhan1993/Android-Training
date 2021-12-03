package com.byengineer.togglebuttonexample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayout;
    ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout=findViewById(R.id.back_ground);
        toggleButton=findViewById(R.id.toggleButton);
        linearLayout.setBackgroundColor(Color.parseColor("#000000"));

        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(toggleButton.isChecked()){
                    Toast.makeText(MainActivity.this, "Toggle is On", Toast.LENGTH_SHORT).show();
                    linearLayout.setBackgroundColor(Color.parseColor("#FFFFFF"));
                }
                else{
                    Toast.makeText(MainActivity.this, "Toggle is Off", Toast.LENGTH_SHORT).show();
                    linearLayout.setBackgroundColor(Color.parseColor("#000000"));
                }
            }
        });
    }
}