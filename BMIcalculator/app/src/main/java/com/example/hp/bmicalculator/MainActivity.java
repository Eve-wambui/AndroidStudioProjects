package com.example.hp.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView bmi;
EditText heightt,weight;
Button calc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bmi=findViewById(R.id.textView);
        heightt=findViewById(R.id.editText3);
        weight=findViewById(R.id.editText);
        calc=findViewById(R.id.button);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String heigttt=heightt.getText().toString();
                String weightt=weight.getText().toString();

                double calc=Double.parseDouble(weightt)
                        /(Double.parseDouble(heigttt)*Double.parseDouble(heigttt));
                bmi.setText(String.valueOf(calc));

            }
        });

    }
}
