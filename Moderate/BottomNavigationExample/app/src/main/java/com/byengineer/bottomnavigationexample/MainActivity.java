package com.byengineer.bottomnavigationexample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    FrameLayout frameLayout;
    BottomNavigationView navigationView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigationView=findViewById(R.id.bottom_navigation_example);
        frameLayout=findViewById(R.id.frame_for_bottom_navigation);
        textView=findViewById(R.id.bottom_navigation_example_text);

        textView.setText("I am Home");
        textView.setTextColor(Color.BLACK);

        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        textView.setText("I am Home");
                        break;
                    case R.id.car:
                        textView.setText("I am Driving right now");
                        break;
                    case R.id.cup:
                        textView.setText("Have a cup of coffee");
                        break;
                }
                return true;
            }
        });
    }
}