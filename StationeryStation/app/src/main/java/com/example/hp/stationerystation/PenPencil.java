package com.example.hp.stationerystation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PenPencil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pen_pencil);
    }

    public void ballpoint(View view) {
        Intent intent=new Intent(getApplicationContext(),ballpointsales.class);
        startActivity(intent);
    }

    public void gel(View view) {
        Intent gelp=new Intent(getApplicationContext(),gelsales.class);
        startActivity(gelp);
    }

    public void fountain(View view) {
        Intent tain=new Intent(getApplicationContext(),fountainsales.class);
        startActivity(tain);
    }

    public void hb(View view) {
        Intent intenta=new Intent(getApplicationContext(),hbsales.class);
        startActivity(intenta);
    }
}
