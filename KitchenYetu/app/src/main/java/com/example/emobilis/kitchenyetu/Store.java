package com.example.emobilis.kitchenyetu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Store extends AppCompatActivity {
ImageButton a,b,c,d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);
        a=findViewById(R.id.veg);
        b=findViewById(R.id.tubers);
        c=findViewById(R.id.salad);
        d=findViewById(R.id.oil);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent veggie=new Intent(Store.this,market.class);
                startActivity(veggie);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent veggie=new Intent(Store.this,market.class);
                startActivity(veggie);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent veggie=new Intent(Store.this,market.class);
                startActivity(veggie);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent veggie=new Intent(Store.this,market.class);
                startActivity(veggie);
            }
        });
    }
}
