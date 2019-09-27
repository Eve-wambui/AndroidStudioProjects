package com.example.hp.stationerystation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Exercise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

    }

    public void salesquared(View view) {
        Intent square=new Intent(getApplicationContext(),squaredsales.class);
        startActivity(square);
    }

    public void salesruled(View view) {
        Intent ruled=new Intent(getApplicationContext(),ruledsales.class);
        startActivity(ruled);
    }

    public void salesgraph(View view) {
        Intent ruled=new Intent(getApplicationContext(),graphsales.class);
        startActivity(ruled);
    }

    public void salesmusic(View view) {
        Intent ruled=new Intent(getApplicationContext(),musicsales.class);
        startActivity(ruled);
    }
}
