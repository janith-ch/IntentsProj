package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
         Button btn;
         EditText number1,number2;
         String string1, string2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1 = findViewById(R.id.P1I1);
        number2 = findViewById(R.id.P1I2);
        btn = findViewById(R.id.B1);

    }
          protected void onResume() {
              super.onResume();
              btn.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View view) {
                      Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                      string1 = number1.getText().toString();
                      string2 = number2.getText().toString();

                      intent.putExtra("N1",string1);
                      intent.putExtra("N2",string2);
                      startActivity(intent);

                      Context context = getApplicationContext();
                      CharSequence message = "you just clicked the ok button";
                      int duration = Toast.LENGTH_SHORT;
                      Toast toast = Toast.makeText(context,message,duration);
                      toast.setGravity(Gravity.TOP| Gravity.LEFT,0,0);
                      toast.show();
                  }
              });
          }

}