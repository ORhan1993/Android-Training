package com.byengineer.jsonparsingexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView output=findViewById(R.id.json_text);

        String strJson = "{ \"Students\" :[{\"id\":\"1\",\"name\":\"SAM\",\"fee\":\"50000\"},{\"id\":\"2\",\"name\":\"Shaheer\",\"fee\":\"60000\"},{\"id\":\"3\",\"name\":\"Zeeshan\",\"fee\":\"93000\"},{\"id\":\"4\",\"name\":\"Muzamil\",\"fee\":\"30000\"},{\"id\":\"5\",\"name\":\"Farhan\",\"fee\":\"43000\"}] }";

        String data="";
        try {
            JSONObject jsonRootObject=new JSONObject(strJson);
            JSONArray jsonArray=jsonRootObject.optJSONArray("Students");

            for (int i=0;i<jsonArray.length();i++){
                JSONObject jsonObject=jsonArray.getJSONObject(i);

                int id=Integer.parseInt(jsonObject.optString("id").toString());
                String name=jsonObject.optString("name").toString();
                float fee=Float.parseFloat(jsonObject.optString("fee").toString());

                data+="At JSON ARRAY INDEX "+i+" : \n id="+id+" \n Name= "+name+" \n FEE= "+fee+"\n\n";

            }
            output.setText(data);
        }catch (JSONException e){
            e.printStackTrace();
        }
    }
}