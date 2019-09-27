package com.example.hp.stationerystation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    List<Here> hereList;
    ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        hereList=new ArrayList<>();
        hereList.add(new Here(R.drawable.exebooks,"Exercise Books"));
        hereList.add(new Here(R.drawable.notebooks,"Notebooks"));
        hereList.add(new Here(R.drawable.pp2,"Pens&Pencils"));
        hereList.add(new Here(R.drawable.colour,"Coloured Pencils"));
        listview=(ListView)findViewById(R.id.listView);
        CustomAdapter adapter=new CustomAdapter(this,R.layout.items,hereList);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){
                    Intent intent = new Intent(getApplicationContext(),Exercise.class);
                    startActivity(intent);
                }else if (i==1){
                    Intent note= new Intent(getApplicationContext(),Notebook.class);
                    startActivity(note);
                }else if (i==2){
                    Intent pp= new Intent(getApplicationContext(),PenPencil.class);
                    startActivity(pp);
                }else if (i==3) {
                    Intent color = new Intent(getApplicationContext(), color.class);
                    startActivity(color);
                }
            }
        });
    }
}
