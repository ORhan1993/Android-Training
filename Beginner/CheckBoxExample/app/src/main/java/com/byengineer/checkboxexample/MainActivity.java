package com.byengineer.checkboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox checkBox,checkBox2,checkBox3;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBox=findViewById(R.id.checkBox);
        checkBox2=findViewById(R.id.checkBox2);
        checkBox3=findViewById(R.id.checkBox3);
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox.isChecked()==true&& checkBox2.isChecked()==true&&checkBox3.isChecked()==true)
                    Toast.makeText(MainActivity.this,"All 3 Check boxes are checked",Toast.LENGTH_SHORT).show();
                else if (checkBox.isChecked()==true&& checkBox2.isChecked()==true)
                    Toast.makeText(MainActivity.this,"Check box 1 and Check box 2 are checked",Toast.LENGTH_SHORT).show();
                else if (checkBox3.isChecked()==true&& checkBox2.isChecked()==true)
                    Toast.makeText(MainActivity.this,"Check box 3 and Check box 2 are checked",Toast.LENGTH_SHORT).show();
                else if (checkBox.isChecked()==true&& checkBox3.isChecked()==true)
                    Toast.makeText(MainActivity.this,"Check box 1 and Check box 3 are checked",Toast.LENGTH_SHORT).show();
                else if (checkBox.isChecked()==true)
                    Toast.makeText(MainActivity.this,"Check box 1 is checked",Toast.LENGTH_SHORT).show();
                else if (checkBox2.isChecked()==true)
                    Toast.makeText(MainActivity.this,"Check box 2 is checked",Toast.LENGTH_SHORT).show();
                else if (checkBox3.isChecked()==true)
                    Toast.makeText(MainActivity.this,"Check box 3 is checked",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this,"No Check box was checked",Toast.LENGTH_SHORT).show();
            }
        });
    }
}