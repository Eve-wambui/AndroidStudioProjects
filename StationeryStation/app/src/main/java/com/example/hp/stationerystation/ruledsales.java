package com.example.hp.stationerystation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ruledsales extends AppCompatActivity implements View.OnClickListener {
    EditText amount;
    TextView tCost,tPurchase;
    Button cost,purchase,confirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruledsales);
        amount=findViewById(R.id.editText);
        tCost=findViewById(R.id.textView4);
        tPurchase=findViewById(R.id.textView11);
        cost=findViewById(R.id.button);
        purchase=findViewById(R.id.button2);
        confirm=findViewById(R.id.button3);
        //set onclick listeners
        cost.setOnClickListener(this);
        purchase.setOnClickListener(this);
        confirm.setOnClickListener(this);
        amount.addTextChangedListener(eve);
    }
    private TextWatcher eve=new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String input=String.valueOf(amount.getText());
            cost.setEnabled(!input.isEmpty());
            purchase.setEnabled(!input.isEmpty());
            confirm.setEnabled(!input.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };
    public void onClick(View view){
        int quant=(int)Double.parseDouble(amount.getText().toString());

        switch (view.getId()){
            case R.id.button:
                int x=quant*97;
                tCost.setText(String.valueOf(x));
                break;
            case R.id.button2:
                int y=(quant*97)+150;
                tPurchase.setText(String.valueOf(y));
                break;
            case R.id.button3:
                Intent ee=new Intent(getApplicationContext(),pay1.class);
                startActivity(ee);
        }


    }
}
