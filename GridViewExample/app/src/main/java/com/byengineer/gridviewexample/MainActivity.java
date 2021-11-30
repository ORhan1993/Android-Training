package com.byengineer.gridviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    ArrayList<String> language=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=findViewById(R.id.GridViewExample);
        fill_list();

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,language);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity.this, language.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
    private  void fill_list()
    {
        language.add("Ajax");
        language.add("Boomerang");
        language.add("Dart");
        language.add("EPL(Easy Programming Language)");
        language.add("Fantom");
        language.add("Hack");
        language.add("Io");
        language.add("Java");
        language.add("Kotlin");
        language.add("Lynx");
        language.add("Microcode");
        language.add("NASM");
        language.add("Opal");
        language.add("Python");
        language.add("QuakeC");
        language.add("React Native");
        language.add("Swift");
        language.add("Turing");
        language.add("Unicon");
        language.add("Visual C++");
        language.add("Whiley");
        language.add("X++");
        language.add("Yorick");
        language.add("Z++");
    }
}