package com.example.mulact;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Intent in;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1= findViewById(R.id.button1);
        b1.setOnClickListener(arg0 -> {
            in = new Intent(this, SecondActivity.class);
            startActivity(in);
        });
    }
}   