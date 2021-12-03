package com.byengineer.fragmentsexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    Button button;
    FrameLayout frameLayout;
    int fragment=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.btn_fragment);
        frameLayout=findViewById(R.id.frame_for_fragment);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=manager.beginTransaction();
                if (fragment==1){
                    FragmentExampleFragment1 fragment_one=new FragmentExampleFragment1();
                    fragmentTransaction.replace(R.id.frame_for_fragment,fragment_one);
                    fragmentTransaction.commit();
                    button.setText("Add Fragment 2");
                    fragment=2;
                }
                else if (fragment==2){
                    FragmentExampleFragment2 fragment_two=new FragmentExampleFragment2();
                    fragmentTransaction.replace(R.id.frame_for_fragment,fragment_two);
                    fragmentTransaction.commit();
                    button.setText("Add Fragment 3");
                    fragment=3;
                }
                else if (fragment==3){
                    FragmentExampleFragment3 fragment_three=new FragmentExampleFragment3();
                    fragmentTransaction.replace(R.id.frame_for_fragment,fragment_three);
                    fragmentTransaction.commit();
                    button.setText("Add Fragment 1");
                    fragment=1;
                }

            }
        });
    }
}