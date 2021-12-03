package com.byengineer.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<String> language=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.ListViewExample);
        fill_list();

        final ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,android.R.id.text1,language);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value=adapter.getItem(position);
                Toast.makeText(getApplicationContext(), value, Toast.LENGTH_SHORT).show();
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