package com.byengineer.optionmenuexample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.optionmenuexample,menu);
        return true;
    }
    @Override
    public  boolean onOptionsItemSelected(@NonNull MenuItem item){
        switch (item.getItemId()){
            case  R.id.option1:
                Toast.makeText(getApplicationContext(), "You Select Share", Toast.LENGTH_SHORT).show();
                break;
            case  R.id.option2:
                Toast.makeText(getApplicationContext(), "You Select Like", Toast.LENGTH_SHORT).show();
                break;
            case  R.id.option3:
                Toast.makeText(getApplicationContext(), "You Select Mr.Android", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}