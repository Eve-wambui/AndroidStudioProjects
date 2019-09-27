package com.example.hp.stationerystation;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class callit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_callit);
    }

    public void callus(View view) {
        String phonenumber="+254711858625";
        Intent callit=new Intent
                (Intent.ACTION_DIAL, Uri.fromParts("tel",phonenumber,null));
        startActivity(callit);

    }

    public void mail(View view) {
        Intent mail=new Intent(Intent.ACTION_SENDTO,Uri.fromParts("mailto","wambui17evelyne@gmail.com",null));
        mail.putExtra(Intent.EXTRA_SUBJECT,"STATIONERY STATION");
        mail.putExtra(Intent.EXTRA_TEXT,"");
        startActivity(Intent.createChooser(mail,"Share mail via"));
    }
}
