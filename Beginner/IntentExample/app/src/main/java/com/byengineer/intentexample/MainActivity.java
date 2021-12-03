package com.byengineer.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button simple_intent_btn,pass_data_intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.intent_edit_text);
        simple_intent_btn=findViewById(R.id.simple_with_btn);
        pass_data_intent=findViewById(R.id.intent_with_data_btn);

        simple_intent_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity3.class));
            }
        });

        pass_data_intent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText().toString().trim().equals("")){
                    editText.requestFocus();
                    editText.setError("Edit text is empty");
                }else
                {
                    Intent intent=new Intent(getApplicationContext(),MainActivity3.class);
                    intent.putExtra("data",editText.getText().toString());
                    startActivity(intent);
                }
            }
        });
    }
}