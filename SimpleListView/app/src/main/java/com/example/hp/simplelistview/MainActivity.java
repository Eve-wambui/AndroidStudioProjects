package com.example.hp.simplelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
ListView listings;
String[] students={"Rose","Bruce","Andrew","Enock","Eve","Brandy","Naum","Brian","Victor","Ted"};
/*ann array adapter is used when you want to convert the item to
* a listview to be views that are loaded on the listview container*/
ArrayAdapter<String> myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listings=findViewById(R.id.listView);
        myAdapter=new ArrayAdapter<String>(this,R.layout.list_layout,students);
        listings.setAdapter(myAdapter);
    }
}
