package com.byengineer.simphoneinfoexample;


import androidx.appcompat.app.AppCompatActivity;



import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TelephonyManager telephonyManager;


    TextView sim_info,phone_info;
    Button sim_info_btn,phone_info_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        telephonyManager=(TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);


        sim_info=findViewById(R.id.sim_type_text);
        phone_info=findViewById(R.id.phone_type_text);
        sim_info_btn=findViewById(R.id.sim_type);
        phone_info_btn=findViewById(R.id.phone_type);

        sim_info_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sim_info.setText("Sim Information "+"\n"
                +"\nOperator Code : "+telephonyManager.getSimOperator().toString()
                //+"\nOperator Name : "+telephonyManager.getSimOperatorName().toString()
                //+"\nSignal Strength : "+telephonyManager.getSignalStrength()
                +"\nNetwork Operator Name : "+telephonyManager.getNetworkOperatorName()
                );

            }
        });

        phone_info_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phone_info.setText("Phone Information "+"\n"
                        +"\n Model number : "+ Build.MODEL
                        +"\n Board : "+Build.BOARD
                        +"\n Brand : "+Build.BRAND
                        +"\n Android Version : "+Build.VERSION.RELEASE
                        +"\n API LEVEL : "+Build.VERSION.SDK_INT
                );
            }
        });
    }
}