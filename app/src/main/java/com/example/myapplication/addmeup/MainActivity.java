package com.example.myapplication.addmeup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText firstNumber;
    private EditText secondNumber;
    private TextView addResult;
    private Button btnAdd;

    double num1,num2,sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    firstNumber = (EditText) findViewById(R.id.editText);
    secondNumber = (EditText) findViewById(R.id.editText2);
    addResult = (TextView) findViewById(R.id.result);
    btnAdd = (Button) findViewById(R.id.button);

    btnAdd.setOnClickListener(new View.OnClickListener() {

        public void onClick(View v) {
try {
    num1 = Double.parseDouble(firstNumber.getText().toString());
    num2 = Double.parseDouble(secondNumber.getText().toString());
    sum = num1 + num2;
    addResult.setText(Double.toString(sum));
}catch(NumberFormatException e)
{
    addResult.setText("Invalid Input");
}
        }
    });


    }
}
