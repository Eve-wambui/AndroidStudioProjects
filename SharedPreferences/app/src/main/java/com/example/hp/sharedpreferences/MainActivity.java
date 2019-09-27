package com.example.hp.sharedpreferences;

import android.content.SharedPreferences;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
//define variables to hold the views
    android.support.v7.widget.Toolbar mToolbar;
    Button mBlue,mGreen,mRed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //find items based on id
        mToolbar=findViewById(R.id.toolbar2);
        mBlue=findViewById(R.id.button2);
        mGreen=findViewById(R.id.button3);
        mRed=findViewById(R.id.button4);
        //then set title for toolbar
        mToolbar.setTitle("MY TOOLBAR");
        if (getColor()!=getResources().getColor(R.color.colorPrimary));
        mToolbar.setBackgroundColor(getColor());
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
            getWindow().setStatusBarColor(getColor());
        }
        mBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mToolbar.setBackgroundColor(getResources().getColor(R.color.colorBlue));
                if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
                    getWindow().setStatusBarColor(getResources().getColor(R.color.colorBlue));
                }
                storeColors(getResources().getColor(R.color.colorBlue));
            }
        });
        mGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mToolbar.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
                    getWindow().setStatusBarColor(getResources().getColor(R.color.colorGreen));
                }
                storeColors(getResources().getColor(R.color.colorGreen));
            }
        });
        mRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mToolbar.setBackgroundColor(getResources().getColor(R.color.colorRed));
                if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
                    getWindow().setStatusBarColor(getResources().getColor(R.color.colorRed));
                }
                storeColors(getResources().getColor(R.color.colorRed));
            }
        });

    }
    private void storeColors(int color){
        SharedPreferences mSharedPreferences=getSharedPreferences("ToolbarColor",MODE_PRIVATE);
        SharedPreferences.Editor editor=mSharedPreferences.edit();
        editor.putInt("color",color);
        editor.apply();
    }
    private int getColor(){
        SharedPreferences mSharedPreferences=getSharedPreferences(""+"ToolbarColor",MODE_PRIVATE);
        int selectedColor=mSharedPreferences.getInt("color",getResources().getColor(R.color.colorPrimary));
        return selectedColor;
    }
}
