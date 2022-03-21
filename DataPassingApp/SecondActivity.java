package com.example.datapassingapp;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class SecondActivity extends Activity {
    TextView tv;
    String na;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        tv=(TextView)findViewById(R.id.textView2);

        Intent in=getIntent();

        na=in.getStringExtra("myName");

        tv.setText("Welcome"+" \t"+na);


    }

}
