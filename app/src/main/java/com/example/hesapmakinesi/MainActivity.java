package com.example.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1;
    EditText number2;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1= findViewById(R.id.number1);
        number2= findViewById(R.id.number2);
        resultText = findViewById(R.id.ResultText);

    }

    public void sum( View view) {
        if (number1.getText().toString().matches(" ") || number2.getText().toString().matches(" ")) {

            resultText.setText("Enter number!");
        } else {
            int numberbir = Integer.parseInt(number1.getText().toString());
            int numberiki = Integer.parseInt(number2.getText().toString());
            int result = numberbir + numberiki;
            resultText.setText("Result: " + result);
        }
    }

    public void deduct(View view) {
        if (number1.getText().toString().matches("") || number2.getText().toString().matches("")) {
            resultText.setText("Enter number!");
        } else {
            int numberbir = Integer.parseInt(number1.getText().toString());
            int numberiki = Integer.parseInt(number2.getText().toString());
            int result = numberbir - numberiki;
            resultText.setText("Result: " + result);
        }
    }

    public void multiply(View view){
        int numberbir= Integer.parseInt(number1.getText().toString());
        int numberiki = Integer.parseInt(number2.getText().toString());
        int result= numberbir*numberiki;
        resultText.setText("Result: "+ result);
    }

    public void divide(View view){
        int numberbir= Integer.parseInt(number1.getText().toString());
        int numberiki = Integer.parseInt(number2.getText().toString());
        int result= numberbir/numberiki;
        resultText.setText("Result: "+ result);
    }

}