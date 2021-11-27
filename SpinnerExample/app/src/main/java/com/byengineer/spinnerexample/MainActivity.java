package com.byengineer.spinnerexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner=findViewById(R.id.SpinnerExample);
        spinner.setOnItemSelectedListener(this);

        List<String> categories=new ArrayList<String>();
        categories.add("Apple");
        categories.add("Bitcoin");
        categories.add("Computers");
        categories.add("Education");
        categories.add("PUBG");
        categories.add("Traveling");

        ArrayAdapter<String> dataAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,categories);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(dataAdapter);

    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view,int position,long id){
        String item=parent.getItemAtPosition(position).toString();

        Toast.makeText(MainActivity.this, "You selected"+item, Toast.LENGTH_SHORT).show();
    }
    public void onNothingSelected(AdapterView<?> arg0){

    }
}