package com.example.tempconversionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText input1;
    EditText input2;
    TextView outputText1;
    TextView outputText2;
    Button button1;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = findViewById(R.id.tempEnter1);
        input2 = findViewById(R.id.tempEnter2);
        outputText1  = findViewById(R.id.output1);
        outputText2 = findViewById(R.id.output2);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);



        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String word = input1.getText().toString();
                double num = Double.parseDouble(word);
                double conv = (num*(9/5))+32; //to fahrenheit
                String out = Double.toString(conv);
                outputText1.setText(out);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String word = input2.getText().toString();
                double num2 = Double.parseDouble(word);
                double conv2 = (num2-32)*(5/9); // to celsius
                String out2 = Double.toString(conv2);
                outputText2.setText(out2);

            }
        });
    }
}