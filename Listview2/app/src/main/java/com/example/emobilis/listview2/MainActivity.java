package com.example.emobilis.listview2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
ListView listView;
List<Custom> listhere;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listhere=new ArrayList<>();
        listhere.add(new Custom(R.drawable.gb,"Allela","Avengers Asgordians"));
        listhere.add(new Custom(R.drawable.gear,"Brian","Infinity War"));
        listhere.add(new Custom(R.drawable.germany,"Bet","Ant Man and Wasp"));
        listhere.add(new Custom(R.drawable.ghana,"Mukaria","K-CI"));
        listhere.add(new Custom(R.drawable.girl,"Kelvin","BB"));
        listhere.add(new Custom(R.drawable.ghana,"MayAfye","BB"));

        listView=findViewById(R.id.listview);
        CustomAdapter adapter=new CustomAdapter(this,R.layout.brian,listhere);
        listView.setAdapter(adapter);
    }
}
