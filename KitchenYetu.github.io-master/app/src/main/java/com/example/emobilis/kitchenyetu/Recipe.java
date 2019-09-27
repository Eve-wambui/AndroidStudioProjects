package com.example.emobilis.kitchenyetu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Recipe extends AppCompatActivity{
    ImageButton a,b,c,d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);
        a=findViewById(R.id.imageButton);
        b=findViewById(R.id.imageButton2);
        c=findViewById(R.id.imageButton3);
        d=findViewById(R.id.imageButton4);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e=new Intent(Recipe.this,Breakfast.class);
                startActivity(e);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f=new Intent(Recipe.this,pasta.class);
                startActivity(f);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e=new Intent(Recipe.this,Breakfast.class);
                startActivity(e);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e=new Intent(Recipe.this,Breakfast.class);
                startActivity(e);
            }
        });


    }
}
