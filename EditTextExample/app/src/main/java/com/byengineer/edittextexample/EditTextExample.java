package com.byengineer.edittextexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Toast;

public class EditTextExample extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.EditTextExample);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Toast.makeText(EditTextExample.this,"Before text changes text is : "+editText.getText().toString(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Toast.makeText(EditTextExample.this,"On text changes text is : "+editText.getText().toString(),Toast.LENGTH_SHORT).show();
            }


            @Override
            public void afterTextChanged(Editable s) {
                Toast.makeText(EditTextExample.this,"After text changes text is : "+editText.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}