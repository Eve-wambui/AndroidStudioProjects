package com.example.becca.swipe;

import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {
    private GestureDetectorCompat mymotion;
MediaPlayer sound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mymotion=new GestureDetectorCompat(this,new LearnGesture());
        sound=MediaPlayer.create(MainActivity.this,R.raw.alan);
        //learn gesture is a file class
    }
    public boolean onTouchEvent(MotionEvent event){
        this.mymotion.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
    class LearnGesture extends GestureDetector.SimpleOnGestureListener{
        //a simple gesture listener is to tell which gesture has been made

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            if (e2.getX()>e1.getX()) {
//this is if you swipe from left to right
                Intent jiji=
                        new Intent(getApplicationContext(),Main2Activity.class);
                finish();
                //finish is to stop main activity
                startActivity(jiji);
                if (sound.isPlaying()){
                    sound.pause();
                }
            }
           else
                 if (e2.getX()<e1.getX())
                     //{
//                     Intent pic = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//                     startActivityForResult(pic, 0);
//                 }
                 sound.start();

                  return true;
        }
    }
}
