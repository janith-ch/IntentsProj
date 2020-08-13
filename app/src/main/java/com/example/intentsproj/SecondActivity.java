package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
 EditText number3,number4;
 String string1,string2;
 Button ABtn1,SBtn2,MBtn3,DBtn4;
 float result;
 int Num1,Num2;
 String operator;
 TextView TV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        number3 = findViewById(R.id.P2D1);
        number4 = findViewById(R.id.P2D2);
        ABtn1 = findViewById(R.id.button1);
        SBtn2 = findViewById(R.id.button2);
        MBtn3 = findViewById(R.id.button3);
        DBtn4 = findViewById(R.id.button4);
        TV  =  findViewById(R.id.P2dis);

        string1=(getIntent().getStringExtra("N1"));
        string2=(getIntent().getStringExtra("N2"));

        number3.setText(string1);
        number4.setText(string2);

        ABtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Num1 = Integer.parseInt(number3.getText().toString());
                Num2 = Integer.parseInt(number4.getText().toString());
                operator = "+";
                result = Num1+Num2;
                TV.setText(number3.getText().toString()+ " " + operator +" " +number4.getText().toString() +" = "+String.valueOf(result));
            }

        });
        SBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Num1 = Integer.parseInt(number3.getText().toString());
                Num2 = Integer.parseInt(number4.getText().toString());
                operator = "-";
                result = Num1-Num2;
                TV.setText(number3.getText().toString()+ " " + operator +" " +number4.getText().toString() +" = "+String.valueOf(result));
            }

        });
        MBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Num1 = Integer.parseInt(number3.getText().toString());
                Num2 = Integer.parseInt(number4.getText().toString());
                operator = "*";
                result = Num1*Num2;
                TV.setText(number3.getText().toString()+ " " + operator +" " +number4.getText().toString() +" = "+String.valueOf(result));
            }

        });
        DBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Num1 = Integer.parseInt(number3.getText().toString());
                Num2 = Integer.parseInt(number4.getText().toString());
                operator = "/";
                result = Num1/Num2;
                TV.setText(number3.getText().toString()+ " " + operator +" " +number4.getText().toString() +" = "+String.valueOf(result));
            }

        });

    }
}