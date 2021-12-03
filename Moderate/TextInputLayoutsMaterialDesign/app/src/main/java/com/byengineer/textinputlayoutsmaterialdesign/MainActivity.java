package com.byengineer.textinputlayoutsmaterialdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextInputLayout textInputLayout_for_error=findViewById(R.id.text_input_for_error);
        textInputLayout_for_error.setError("Test Error");
    }
}