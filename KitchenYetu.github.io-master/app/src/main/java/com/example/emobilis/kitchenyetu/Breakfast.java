package com.example.emobilis.kitchenyetu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Breakfast extends AppCompatActivity {
 Button pay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast);
        pay=findViewById(R.id.button);
        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tt=getApplicationContext().getPackageManager().getLaunchIntentForPackage("com.android.stk");
                if (tt!=null){
                    startActivity(tt);
                }
            }
        });
    }
}
