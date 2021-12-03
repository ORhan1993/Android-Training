package com.byengineer.notificationexample;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button simple_notification,picture_notification;
    private  static  final String CHANNEL_ID="Picture Notification";
    int notification_id=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simple_notification=findViewById(R.id.simple_notification);
        picture_notification=findViewById(R.id.picture_notification);

        simple_notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notification();
                Bitmap image= BitmapFactory.decodeResource(getResources(),R.mipmap.icon);
                NotificationCompat.Builder builder=new NotificationCompat.Builder(getApplicationContext(),CHANNEL_ID);
                builder.setContentTitle("Hello From By Engineer");
                builder.setContentText("Hope this helping you in learning Android");
                builder.setSmallIcon(R.mipmap.icon);
                builder.setStyle(new NotificationCompat.BigPictureStyle().bigPicture(image));
                builder.setPriority(NotificationCompat.PRIORITY_DEFAULT);

                NotificationManagerCompat notificationManagerCompat=NotificationManagerCompat.from(getApplicationContext());
                notificationManagerCompat.notify(notification_id,builder.build());

            }

        });
        picture_notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notification();
                Bitmap image= BitmapFactory.decodeResource(getResources(),R.mipmap.icon);
                NotificationCompat.Builder builder=new NotificationCompat.Builder(getApplicationContext(),CHANNEL_ID);
                builder.setContentTitle("Hello From By Engineer");
                builder.setSmallIcon(R.mipmap.icon);
                builder.setStyle(new NotificationCompat.BigPictureStyle().bigPicture(image));
                builder.setPriority(NotificationCompat.PRIORITY_DEFAULT);

                NotificationManagerCompat notificationManagerCompat=NotificationManagerCompat.from(getApplicationContext());
                notificationManagerCompat.notify(notification_id,builder.build());

            }
        });
    }

    private  void notification(){

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                int importance= NotificationManager.IMPORTANCE_DEFAULT;

                NotificationChannel channel=new NotificationChannel(CHANNEL_ID,"Picture Notification",importance);
                channel.setDescription("This notification contain image");

                NotificationManager notificationManager=(NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                notificationManager.createNotificationChannel(channel);
            }

    }
}