package com.byengineer.autocompleteedittextexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

import java.util.ArrayList;

public class AutoCompleteEditTextExample extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoCompleteTextView=findViewById(R.id.autoCompleteTextView);
        textView=findViewById(R.id.auto_complete_text);

        textView.setText("Use the following text as input: \n"+"Android, Air BNB,Blog,Bitcoin,Book,Computer,Cipher,Dell,Data,Drivers,Email,Ecommerce,Ebanking,FlappyBird,Facebook");
        ArrayList<String> list=new ArrayList<>();
        list.add("Android");
        list.add("Air BNB");
        list.add("Blog");
        list.add("Bitcoin");
        list.add("Book");
        list.add("Computer");
        list.add("Cipher");
        list.add("Dell");
        list.add("Data");
        list.add("Drivers");
        list.add("Email");
        list.add("Ecommerce");
        list.add("Ebanking");
        list.add("FlappyBird");
        list.add("Facebook");

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,list);
        autoCompleteTextView.setAdapter(adapter);

    }
}