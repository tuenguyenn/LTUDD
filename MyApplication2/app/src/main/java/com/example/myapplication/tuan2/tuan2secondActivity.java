package com.example.myapplication.tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.R;

public class tuan2secondActivity extends AppCompatActivity {
    TextView tv1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan2second);
        tv1= findViewById(R.id.tuan2tv1);
        //nhan hang
        Intent i1=getIntent();
        // do hang
        String n1,n2;
        n1=i1.getExtras().getString("so1");
        n2=i1.getExtras().getString("so2");
        float so1,so2;
        so1=Float.parseFloat(n1);
        so2=Float.parseFloat(n2);
        float tong= so1+so2;
        tv1.setText(String.valueOf(tong));
    }
}