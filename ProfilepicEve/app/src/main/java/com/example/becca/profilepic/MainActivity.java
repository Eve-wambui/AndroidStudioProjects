package com.example.becca.profilepic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
    CircleImageView j;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        j=(CircleImageView) findViewById(R.id.profile_image);
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                j.setImageResource(R.drawable.paul);
            }
                Intent pickpic=new
        });
    }
}
