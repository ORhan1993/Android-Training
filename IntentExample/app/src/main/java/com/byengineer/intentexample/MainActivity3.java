package com.byengineer.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        textView=findViewById(R.id.intent2_text);
        if(getIntent().getExtras()!=null){
            if(getIntent().getExtras().containsKey("data")) {
                String data = getIntent().getStringExtra("data");
                textView.setText(data);
            }
        }
    }
}