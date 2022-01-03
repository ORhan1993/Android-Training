package com.byengineer.checknetworkstatus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv_status;
    String connection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_status=findViewById(R.id.tv_status);
        ConnectivityManager connectivityManager=(ConnectivityManager)getApplication().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo=connectivityManager.getActiveNetworkInfo();
        if (networkInfo!=null&&networkInfo.isConnected())
            connection="Internet is Connected";
        else
            connection="No Internet Connection";

        tv_status.setText(connection);

    }
}