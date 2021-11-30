package com.byengineer.searchviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    SearchView searchView;
    ArrayList<String> language=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchView=findViewById(R.id.SearchView);
        listView=findViewById(R.id.search_list_view);

        fill_list();

        final ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,android.R.id.text1,language);
        listView.setAdapter(adapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                if(language.contains(query))
                    adapter.getFilter().filter(query);
                else
                    Toast.makeText(getApplicationContext(), "No Match found", Toast.LENGTH_SHORT).show();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), language.get(position), Toast.LENGTH_SHORT).show();
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