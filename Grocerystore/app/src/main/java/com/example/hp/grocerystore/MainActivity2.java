package com.example.hp.grocerystore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {
ImageButton oil,aisle,basket,bar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //identify button based on their ids
        oil=findViewById(R.id.imageButton);
        aisle=findViewById(R.id.imageButton2);
        basket=findViewById(R.id.imageButton3);
        bar=findViewById(R.id.imageButton4);
        //setting onclick listeners for each image button
        oil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent evie=new Intent(MainActivity2.this,CookingOil.class);
                startActivity(evie);
            }
        });
        aisle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent eve=new Intent(MainActivity2.this,CookingOil.class);
                startActivity(eve);
            }
        });
        basket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent doll=new Intent(MainActivity2.this,CookingOil.class);
                startActivity(doll);
            }
        });
        bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent blue=new Intent(MainActivity2.this,CookingOil.class);
                startActivity(blue);
            }
        });
    }
}
