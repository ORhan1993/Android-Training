package com.byengineer.emailexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText destinationAddress,subject_edit_text,message;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        subject_edit_text=findViewById(R.id.subject);
        message=findViewById(R.id.messageBody);
        button=findViewById(R.id.ButtonExample);
        destinationAddress=findViewById(R.id.destinationAddress);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String subject=subject_edit_text.getText().toString();
                String message_string=message.getText().toString();
                String to=destinationAddress.getText().toString();

                Intent emailActivity=new Intent(Intent.ACTION_SEND);

                //set up the recipient address
                emailActivity.putExtra(Intent.EXTRA_EMAIL,new String[]{to});

                //set up the email subject
                emailActivity.putExtra(Intent.EXTRA_SUBJECT,subject);

                //set up the message body
                emailActivity.putExtra(Intent.EXTRA_TEXT,message_string);

                emailActivity.setType("message/rfc822");

                startActivity(Intent.createChooser(emailActivity,"Select your Email Application"));

            }
        });
    }
}