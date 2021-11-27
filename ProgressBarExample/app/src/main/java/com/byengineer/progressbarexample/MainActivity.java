package com.byengineer.progressbarexample;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button1,button2;
    private ProgressDialog progressDialog1,progressDialog2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressDialog1=new ProgressDialog(MainActivity.this);
                progressDialog1.setMessage("Downloading Progress bar demo horizontal");
                progressDialog1.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                progressDialog1.setIndeterminate(true);
                progressDialog1.setProgress(0);
                progressDialog1.show();

                final  int totalProgressTime=100;
                final  Thread t=new Thread(){
                    @Override
                    public void run()
                    {
                        int jumpTime=0;
                        while (jumpTime<totalProgressTime){
                            try {
                                sleep(200);
                                jumpTime+=5;
                                progressDialog1.setProgress(jumpTime);
                            }catch (InterruptedException e)
                            {
                                e.printStackTrace();
                            }
                        }
                    }
                };
                t.start();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressDialog1=new ProgressDialog(MainActivity.this);
                progressDialog1.setMessage("Downloading Progress Spinner");
                progressDialog1.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                progressDialog1.setIndeterminate(true);
                progressDialog1.setProgress(0);
                progressDialog1.show();

                final  int totalProgressTime=100;
                final  Thread t=new Thread(){
                    @Override
                    public void run()
                    {
                        int jumpTime=0;
                        while (jumpTime<totalProgressTime){
                            try {
                                sleep(200);
                                jumpTime+=5;
                                progressDialog1.setProgress(jumpTime);
                            }catch (InterruptedException e)
                            {
                                e.printStackTrace();
                            }
                        }
                    }
                };
                t.start();
            }
        });
    }
}