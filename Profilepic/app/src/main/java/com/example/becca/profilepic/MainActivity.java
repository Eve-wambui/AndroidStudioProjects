package com.example.becca.profilepic;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
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
                j.setImageResource(R.drawable.a);
                Intent pickpic=new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(pickpic,1);
            }

        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent imageReturnedIntent) {
        super.onActivityResult(requestCode, resultCode, imageReturnedIntent);
        switch (requestCode){
            case 0:
                if (resultCode==RESULT_OK){
                    //bundle is used to pass data between various android activities
                    Bundle extras=imageReturnedIntent.getExtras();
                    Bitmap imageBitmap=(Bitmap)extras.get("data");
                    j.setImageBitmap(imageBitmap);
                }
                break;
            case 1:
                if (requestCode==RESULT_OK){
                    Uri imageselected=imageReturnedIntent.getData();
                    j.setImageURI(imageselected);
                }
                break;
        }
    }
}
