package com.example.hp.stationstationery;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
Button Contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Contact=findViewById(R.id.contact);
        Contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phonenumber="+254711858625";
                Intent callit=new Intent
                        (Intent.ACTION_DIAL, Uri.fromParts("tel",phonenumber,null));
                startActivity(callit);
            }
        });

    }

    public void retail(View view) {
        Intent retail=new Intent(MainActivity2.this,Retail.class);
        startActivity(retail);

    }
    public void wholesale(View view){
        Intent evie=new Intent(MainActivity2.this,Wholesale.class);
        startActivity(evie);

    }
}
