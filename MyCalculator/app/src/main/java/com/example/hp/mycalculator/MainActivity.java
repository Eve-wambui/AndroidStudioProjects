package com.example.hp.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//define variables to hold the views
    TextView mAnswer;
    EditText firstnum,secondnum;
    Button mAdd,mSub,mMult,mDiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAnswer=findViewById(R.id.textView);
        firstnum=findViewById(R.id.editText);
        secondnum=findViewById(R.id.editText2);
        mAdd=findViewById(R.id.button);
        mDiv=findViewById(R.id.button4);
        mMult=findViewById(R.id.button2);
        mSub=findViewById(R.id.button3);

        //setting onclick listeners
        mAdd.setOnClickListener(this);
        mDiv.setOnClickListener(this);
        mMult.setOnClickListener(this);
        mSub.setOnClickListener(this);

    }
    public void onClick(View view){
        String fnum=firstnum.getText().toString();
        String snum=secondnum.getText().toString();
       //check if field is empty
        /*a toast refers to a message that is
        * displayed for a short time*/
        if (fnum.isEmpty() || snum.isEmpty()){
            Toast.makeText(this, "Fill in all the slots", Toast.LENGTH_SHORT).show();
        } else{
            switch (view.getId()){
                case R.id.button:
                    double add=Double.parseDouble(fnum)+
                            Double.parseDouble(snum);
                    mAnswer.setText(String.valueOf(add));
                    break;
                case R.id.button3:
                    double sub=Double.parseDouble(fnum)-
                            Double.parseDouble(snum);
                    mAnswer.setText(String.valueOf(sub));
                    break;
                case R.id.button2:
                    double mult=Double.parseDouble(fnum)*
                            Double.parseDouble(snum);
                    mAnswer.setText(String.valueOf(mult));
                    break;
                case R.id.button4:
                    double div=Double.parseDouble(fnum)/
                            Double.parseDouble(snum);
                    mAnswer.setText(String.valueOf(div));
                    break;
                    default:
                        Toast.makeText(this, "Enter valid values", Toast.LENGTH_SHORT).show();

            }
        }
    }
    //helps to track changes on the pointer
    public void onPointerCaptureChanged
    (boolean hasCapture){

    }
}
