package com.example.hp.stationerystation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Notebook extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notebook);
    }

    public void cute(View view) {
        Intent cute=new Intent(getApplicationContext(),cutesales.class);
        startActivity(cute);
    }

    public void planner(View view) {
        Intent cute=new Intent(getApplicationContext(),plannersales.class);
        startActivity(cute);
    }

    public void journal(View view) {
        Intent cute=new Intent(getApplicationContext(),journalsales.class);
        startActivity(cute);
    }

    public void spiral(View view) {
        Intent cute=new Intent(getApplicationContext(),spiralsales.class);
        startActivity(cute);
    }
}
