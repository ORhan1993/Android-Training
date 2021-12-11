package com.byengineer.recycleviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<RecycleViewExampleModel> arrayList=new ArrayList<>();
    RecycleViewExampleAdapter adapter;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.example_of_recycle_view);

        add_data();

        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter=new RecycleViewExampleAdapter(this,arrayList);
        recyclerView.setAdapter(adapter);
    }

    private void add_data(){
        arrayList.add(new RecycleViewExampleModel(R.drawable.icon, "Air Plane", "An airplane or aeroplane is a powered, fixed-wing aircraft that is propelled forward by thrust from a jet engine, propeller or rocket engine. Airplanes come in a variety of sizes, shapes, and wing configurations"));
        arrayList.add(new RecycleViewExampleModel(R.drawable.icon, "Car", "A car is a wheeled motor vehicle used for transportation. Most definitions of cars say that they run primarily on roads, seat one to eight people, have four tires, and mainly transport people rather than goods. Cars came into global use during the 20th century, and developed economies depend on them."));
        arrayList.add(new RecycleViewExampleModel(R.drawable.icon, "Thumbs Up", "A thumb signal, usually described as a thumbs-up or thumbs-down, is a common hand gesture achieved by a closed fist held with the thumb extended upward or downward in approval or disapproval, respectively."));
        arrayList.add(new RecycleViewExampleModel(R.drawable.icon, "Smile", "A smile is formed primarily by flexing the muscles at the sides of the mouth. Some smiles include a contraction of the muscles at the corner of the eyes, an action known as a Duchenne smile. Among humans, smiling is an expression denoting pleasure, sociability, happiness, joy or amusement."));
        arrayList.add(new RecycleViewExampleModel(R.drawable.icon, "Flash Light", "A flashlight is a portable hand-held electric light. The source of the light is usually an incandescent light bulb or light-emitting diode."));
        arrayList.add(new RecycleViewExampleModel(R.drawable.icon, "Finger Print", "A fingerprint is an impression left by the friction ridges of a human finger. The recovery of partial fingerprints from a crime scene is an important method of forensic science."));
        arrayList.add(new RecycleViewExampleModel(R.drawable.icon, "Cycling", "Cycling, also called biking or bicycling, is the use of bicycles for transport, recreation, exercise or sport. People engaged in cycling are referred to as \"cyclists\", \"bikers\", or less commonly, as \"bicyclists\"."));
        arrayList.add(new RecycleViewExampleModel(R.drawable.icon, "Cake", "Cake is a form of sweet food made from flour, sugar, and other ingredients, that is usually baked. In their oldest forms, cakes were modifications of bread, but cakes now cover a wide range of preparations"));
        arrayList.add(new RecycleViewExampleModel(R.drawable.icon, "Android", "Android is a mobile operating system based on a modified version of the Linux kernel and other open source software, designed primarily for touchscreen mobile devices such as smartphones and tablets."));
        arrayList.add(new RecycleViewExampleModel(R.drawable.icon, "Coffee", "Coffee is a brewed drink prepared from roasted coffee beans, the seeds of berries from certain Coffea species. The genus Coffea is native to tropical Africa and Madagascar, the Comoros, Mauritius, and Réunion in the Indian Ocean."));
        arrayList.add(new RecycleViewExampleModel(R.drawable.icon, "Shopping Cart", "A shopping cart or trolley, also known by a variety of other names, is a wheeled cart supplied by a shop or store, especially supermarkets, for use by customers inside the premises for transport"));
        arrayList.add(new RecycleViewExampleModel(R.drawable.icon, "Train", "A train is a form of rail transport consisting of a series of connected vehicles that generally run along a railroad track to transport passengers or cargo"));
        arrayList.add(new RecycleViewExampleModel(R.drawable.icon, "Gif", "The Graphics Interchange Format is a bitmap image format that was developed by a team at the online services provider CompuServe led by American computer scientist Steve Wilhite on Jun 15, 1987."));
    }
}