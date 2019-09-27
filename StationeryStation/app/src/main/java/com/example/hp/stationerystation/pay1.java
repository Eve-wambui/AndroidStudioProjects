package com.example.hp.stationerystation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pay1 extends AppCompatActivity {
Button simtk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay1);
        simtk=findViewById(R.id.sim);
        simtk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launch=getApplicationContext().getPackageManager().getLaunchIntentForPackage("com.android.stk");
                if (launch!=null){
                    startActivity(launch);
                }
            }
        });
    }
}
