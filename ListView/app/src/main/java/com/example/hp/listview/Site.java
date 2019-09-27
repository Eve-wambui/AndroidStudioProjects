package com.example.hp.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Site extends AppCompatActivity {
WebView onlineweb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_site);
        onlineweb=findViewById(R.id.web2);
        onlineweb.loadUrl("https://www.google.com");

    }
}
