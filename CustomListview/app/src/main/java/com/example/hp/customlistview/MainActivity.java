package com.example.hp.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
List<Here> hereList;
ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hereList=new ArrayList<>();
        hereList.add(new Here(R.drawable.a,"Victorious","Tori"));
        hereList.add(new Here(R.drawable.bb,"Victorious", "Jade"));
        hereList.add(new Here(R.drawable.cc,"Victorious", "Sisters"));
        hereList.add(new Here(R.drawable.aa,"Victorious","Girls"));
        hereList.add(new Here(R.drawable.bbb,"Victorious","Cast"));
    listview=(ListView)findViewById(R.id.listview);
    CustomAdapter adapter=new CustomAdapter(this,R.layout.eve,hereList);
    listview.setAdapter(adapter);
    }
}
