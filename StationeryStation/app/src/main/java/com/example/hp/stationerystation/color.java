package com.example.hp.stationerystation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class color extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
    }

    public void hlight(View view) {
        Intent yy=new Intent(getApplicationContext(),hlightsales.class);
        startActivity(yy);
    }

    public void cp(View view) {
        Intent yyy=new Intent(getApplicationContext(),cpsales.class);
        startActivity(yyy);
    }

    public void mark(View view) {
        Intent ayy=new Intent(getApplicationContext(),marksales.class);
        startActivity(ayy);
    }

    public void cray(View view) {
        Intent yyc=new Intent(getApplicationContext(),craysales.class);
        startActivity(yyc);
    }
}
