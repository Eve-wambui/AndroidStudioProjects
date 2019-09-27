package com.example.hp.database;

import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
DatabaseHelper dbase;
EditText textname,textmarks,textadmin,textid;
Button btnadd,btnview,btndel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //find items
        textname=findViewById(R.id.editText);
        textmarks=findViewById(R.id.editText2);
        textadmin=findViewById(R.id.editText3);
        textid=findViewById(R.id.editText4);
        btnadd=findViewById(R.id.button);
        btndel=findViewById(R.id.button2);
        btnview=findViewById(R.id.button3);
        AddData();
        viewAll();
        DeleteData();
        }
        public void AddData(){
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isInserted=dbase.insertData(
                       textname.getText().toString(),
                        textmarks.getText().toString(),
                        textadmin.getText().toString()
                );
                if (isInserted==true)
                    Toast.makeText(MainActivity.this, "DATA INSERTED SUCCESSFULLY", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "FAILED TO INSERT", Toast.LENGTH_SHORT).show();
            }
        });
        }
        public void DeleteData(){
        btndel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer deleteRow=dbase.deleteData(textid.getText().toString());
                if (deleteRow>0)
                    Toast.makeText(MainActivity.this, "Deleted Successfully", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Not deleted", Toast.LENGTH_SHORT).show();
            }
        });

        }
        private void viewAll(){
        btnview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor res=dbase.getAllData();
                if (res.getCount()==0){
                    showMessage("Error","NO DATA");
                    return;
                }
                StringBuffer buffer=new StringBuffer();
                while (res.moveToNext()){
                    //a buffer refers to container for data
                    buffer.append("ID "+res.getString(0)+"\n");
                    buffer.append("NAME "+res.getString(1)+"\n");
                    buffer.append("MARKS "+res.getString(2)+"\n");
                    buffer.append("ADM "+res.getString(3)+"\n");
                }
                showMessage("Information",buffer.toString());
            }
        });
        }
        private void showMessage(String title,String message){
            AlertDialog.Builder builder=
                    new AlertDialog.Builder(this);
            builder.setCancelable(true);
            builder.setTitle(title);
            builder.setMessage(message);
            builder.show();
        }
}
