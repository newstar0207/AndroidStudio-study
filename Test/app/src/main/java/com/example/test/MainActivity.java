package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) { // onCreate => 가장먼저 실행하는 메소드
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // xml 을 화면에 표시하라는 의미
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher_foreground);

//        Button myButton1;
//
//        myButton1 = (Button) findViewById(R.id.button1);
//
//        myButton1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                TextView textView;
//
//                textView = (TextView) findViewById(R.id.textview1);
//
//                if(textView.getText() == "your button!"){
//                    textView.setText("who am i");
//                }else {
//                    textView.setText("your button!");
//                }
//            }
//        });
    }
}