package com.example.hp.myapplication2;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button call,share,sms,capture,simtk,email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        call=findViewById(R.id.button5);
        share=findViewById(R.id.button9);
        sms=findViewById(R.id.button6);
        capture=findViewById(R.id.button7);
        simtk=findViewById(R.id.button8);
        email=findViewById(R.id.button);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phonenumber="+254722377202";
                Intent callit=new Intent
                        (Intent.ACTION_DIAL, Uri.fromParts("tel",phonenumber,null));
                startActivity(callit);
            }
        });
        //launching sim tool kit
        simtk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launch=getApplicationContext().getPackageManager().getLaunchIntentForPackage("com.android.stk");
                if (launch!=null){
                    startActivity(launch);
                }
            }
        });
        //setting onclick listener for capturing image
        capture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent image=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(image,0);
            }
        });
        //setting onclick listener for sms
        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent smsit=new Intent(Intent.ACTION_MAIN);
                //state sms package and type that can be sent
                smsit.setType("vnd.android-dir/mms-sms");
                startActivity(smsit);
            }
        });
        //setting onclick listener for the share button
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shareit=new Intent(Intent.ACTION_SEND);
                shareit.setType("plain/text");
                startActivity(Intent.createChooser(shareit,"SHARE NOW"));
            }
        });
        //email onclick listener
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mail=new Intent(Intent.ACTION_SENDTO,Uri.fromParts("mailto","wambui17evelyne@gmail.com",null));
                mail.putExtra(Intent.EXTRA_SUBJECT,"ANDROID CLASS");
                mail.putExtra(Intent.EXTRA_TEXT,"Thank you for choosing us");
                startActivity(Intent.createChooser(mail,"Share mail via"));
            }
        });
    }
}

