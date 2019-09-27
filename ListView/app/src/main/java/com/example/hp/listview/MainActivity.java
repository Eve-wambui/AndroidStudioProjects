package com.example.hp.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button offline,online,whatsapp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        offline=findViewById(R.id.button2);
        online=findViewById(R.id.button);
        whatsapp=findViewById(R.id.button3);
        //set onclick listener
        offline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent to open the next page holding the webview
                Intent eve=new Intent(getApplicationContext(),Webit.class);
                startActivity(eve);
            }
        });

        online.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent load=new Intent(getApplicationContext(),Site.class);
                startActivity(load);
            }
        });
        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendit=new Intent();
                //assign intent action to perform
                sendit.setAction(Intent.ACTION_SEND);
                //set the text that is to be shared
                sendit.putExtra(Intent.EXTRA_TEXT,"My android app");
                //define type
                sendit.setType("text/plain");
                //specify package
                sendit.setPackage("com.whatsapp");
                startActivity(sendit);
            }
        });

    }
}
