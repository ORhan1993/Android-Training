package com.byengineer.mysqlliteexample;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MySQLliteExampleDatabaseHandler myDb;
    EditText editName,editSurname,editMarks,editTextId;
    Button btnAddData,btnViewAll,btnDelete,btnViewUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDb=new MySQLliteExampleDatabaseHandler(this);

        editName=findViewById(R.id.editText_name);
        editSurname=findViewById(R.id.editText_surname);
        editMarks=findViewById(R.id.editText_Marks);
        editTextId=findViewById(R.id.editText_id);
        btnAddData=findViewById(R.id.button_add);
        btnViewAll=findViewById(R.id.button_viewAll);
        btnViewUpdate=findViewById(R.id.button_update);
        btnDelete=findViewById(R.id.button_delete);
        AddData();
        viewAll();
        UpdateData();
        DeleteData();
    }

    public void DeleteData(){
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer deletedRows=myDb.deleteData(editTextId.getText().toString());
                if(deletedRows>0)
                    Toast.makeText(getApplicationContext(), "Data Deleted", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(), "Data not Deleted", Toast.LENGTH_LONG).show();
            }
        });
    }

    public void UpdateData(){
        btnViewUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isUpdate=myDb.updateData(editTextId.getText().toString(),editName.getText().toString(),editSurname.getText().toString(),editMarks.getText().toString());
                if(isUpdate==true)
                    Toast.makeText(getApplicationContext(), "Data Update", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(), "Data not Updated", Toast.LENGTH_LONG).show();
            }
        });
    }

    public void AddData(){
        btnAddData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isInserted= myDb.insertData(editName.getText().toString(),editSurname.getText().toString(),editMarks.getText().toString());
                if(isInserted==true)
                    Toast.makeText(getApplicationContext(), "Data Inserted", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(), "Data not Inserted", Toast.LENGTH_LONG).show();
            }
        });
    }

    public void viewAll(){
        btnViewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res=myDb.getAllData();
                if(res.getCount()==0){
                    //show message
                    showMessage("Error","Nothing found");
                    return;
                }

                StringBuffer buffer=new StringBuffer();
                while (res.moveToNext()){
                    buffer.append("Id :"+res.getString(0)+"\n");
                    buffer.append("Name :"+res.getString(1)+"\n");
                    buffer.append("Surname :"+res.getString(2)+"\n");
                    buffer.append("Marks :"+res.getString(3)+"\n\n");
                }

                //show all data
                showMessage("Data",buffer.toString());
            }
        });
    }
    public void showMessage(String title,String Message){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }
}