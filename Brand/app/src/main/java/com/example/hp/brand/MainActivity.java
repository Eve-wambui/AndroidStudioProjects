package com.example.hp.brand;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread bb=new Thread(){
            //execute thread
            public void run(){
                try{
                    //the progress bar will load for five seconds
                    sleep(3 * 1000);
                    //getApplicationContext(),-->same as MainActivity.this
                    Intent jj =new Intent(MainActivity.this,Home.class);
                    startActivity(jj);
                    finish();
                } catch (Exception e){
                }
            }
        };
        bb.start();
    }
}
