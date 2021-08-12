package com.example.unitconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {//set On Click Listener() is a interface --> eta basically boltese j button er moddhe ekta on click listener set kore dewar jonno r button ache amr XML file er moddhe;
            @Override
            public void onClick(View v) {
                //r ei method boltese j button er moddhe on click listener dile ki hobe eta bole dewar jonno spicific vabe; j button click korle on that click ei kaj ta hobe ;
                Toast.makeText(MainActivity.this,"Submission Completed", Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();//value dear jonno j edit text field ta banaisi oitar moddhe j number ta enter kora hobe user dara oi number tare ami as String nitesi;
                int kg = Integer.parseInt(s);//tarpor oi String tare amra integer hishebe return kortesi parseInt() er maddhome;
                double pound = 2.204623 * kg;
                textView.setText("The Corresponding value in Pounds is " + pound);
            }
        });

        //1 kg == 2.204623 Pound;




















    }
}