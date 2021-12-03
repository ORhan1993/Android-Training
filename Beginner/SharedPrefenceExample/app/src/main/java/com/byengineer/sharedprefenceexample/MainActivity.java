package com.byengineer.sharedprefenceexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText1,editText2,editText3;
    Button button1,button2,button3;

    public static final String MyPREFERENCES="MyPrefs";
    public static final String Name="nameKey";
    public static final String Phone="phoneKey";
    public static final String Email="emailKey";

    TextView name,number,email;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.name_text);
        number=findViewById(R.id.number_text);
        email=findViewById(R.id.email_text);

        editText1=(EditText) findViewById(R.id.editText);
        editText2=(EditText) findViewById(R.id.editText2);
        editText3=(EditText) findViewById(R.id.editText3);

        button1=(Button) findViewById(R.id.button_save);
        button2=(Button) findViewById(R.id.button_show);
        button3=(Button) findViewById(R.id.button_clear);
        sharedPreferences =getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        if(sharedPreferences.contains(Name))
            name.setText(sharedPreferences.getString(Name,""));
        if(sharedPreferences.contains(Email))
            email.setText(sharedPreferences.getString(Email,""));
        if(sharedPreferences.contains(Phone))
            number.setText(sharedPreferences.getString(Phone,""));

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n=editText1.getText().toString();
                String e=editText2.getText().toString();
                String num=editText3.getText().toString();
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.putString(Name,n);
                editor.putString(Email,e);
                editor.putString(Phone,num);
                editor.commit();
                Toast.makeText(getApplicationContext(), "Commit to =>  Name : "+n.toString()+" E-mail : "+e.toString()+" Number : "+num.toString(), Toast.LENGTH_LONG).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name=findViewById(R.id.name_text);
                number=findViewById(R.id.number_text);
                email=findViewById(R.id.email_text);
                sharedPreferences =getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

                if(sharedPreferences.contains(Name))
                    name.setText(sharedPreferences.getString(Name,"No Name present"));
                if(sharedPreferences.contains(Email))
                    email.setText(sharedPreferences.getString(Email,"No Email present"));
                if(sharedPreferences.contains(Phone))
                    number.setText(sharedPreferences.getString(Phone,"No Number present"));

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name=findViewById(R.id.name_text);
                number=findViewById(R.id.number_text);
                email=findViewById(R.id.email_text);
                name.setText("");
                email.setText("");
                number.setText("");
            }
        });

    }

}