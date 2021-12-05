package com.byengineer.sharedanimationexample;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout img1_layout;
    ImageView img;
    TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1_layout=findViewById(R.id.img1);
        img=findViewById(R.id.image);

        txt1=findViewById(R.id.text);

        img1_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
                    Intent gotoQuiz=new Intent(getApplicationContext(),MainActivity2.class);

                    Pair[] pairs=new Pair[2];
                    pairs[0]=new Pair<View,String>(img,"img");
                    pairs[1]=new Pair<View,String>(txt1,"name");

                    ActivityOptions options=ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,pairs);
                    startActivity(gotoQuiz,options.toBundle());
                }else{
                    Toast.makeText(getApplicationContext(), "Android above 5.0 needs to run this", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}