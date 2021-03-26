package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText number1, number2;
    Button btnAdd, btnMul, btnSub, btnDiv, btnRem;
    TextView textResuit;
    String num1, num2;
    Double resuit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("간단한 계산기");

        number1 = (EditText) findViewById(R.id.edittext1);
        number2 = (EditText) findViewById(R.id.edittext2);

        btnAdd = (Button) findViewById(R.id.BtnAdd);
        btnSub = (Button) findViewById(R.id.BtnSub);
        btnMul = (Button) findViewById(R.id.BtnMul);
        btnDiv = (Button) findViewById(R.id.BtnDiv);
        btnRem = (Button) findViewById(R.id.BtnRem);

        textResuit = (TextView) findViewById(R.id.TextResuit);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = number1.getText().toString();
                num2 = number2.getText().toString();
                resuit = Double.parseDouble(num1) + Double.parseDouble(num2);
                textResuit.setText("resuit : " + resuit.toString());
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = number1.getText().toString();
                num2 = number2.getText().toString();
                if (num2.equals("0")) {
                    Toast.makeText(getApplicationContext(), "0으로 나눌수 없어요", Toast.LENGTH_SHORT).show();
                } else {
                    resuit = Double.parseDouble(num1) / Double.parseDouble(num2);
                    textResuit.setText("resuit : " + resuit.toString());
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = number1.getText().toString();
                num2 = number2.getText().toString();
                resuit = Double.parseDouble(num1) - Double.parseDouble(num2);
                textResuit.setText("resuit : " + resuit.toString());
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = number1.getText().toString();
                num2 = number2.getText().toString();
                resuit = Double.parseDouble(num1) * Double.parseDouble(num2);
                textResuit.setText("resuit : " + resuit.toString());
            }
        });

        btnRem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = number1.getText().toString();
                num2 = number2.getText().toString();
                if (num2.equals("0")) {
                    Toast.makeText(getApplicationContext(), "0으로 나눌수 없어요", Toast.LENGTH_SHORT).show();
                } else {
                    resuit = Double.parseDouble(num1) % Double.parseDouble(num2);
                    textResuit.setText("resuit : " + resuit.toString());
                }
            }
        });
    }
}