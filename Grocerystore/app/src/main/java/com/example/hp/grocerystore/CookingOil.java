package com.example.hp.grocerystore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CookingOil extends AppCompatActivity {
Button mpesa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cooking_oil);
        mpesa=findViewById(R.id.button);
        mpesa.setOnClickListener(new View.OnClickListener() {
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
