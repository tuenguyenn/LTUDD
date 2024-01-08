package com.example.myapplication.tuan4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.R;

public class tuan412MainActivity extends AppCompatActivity {
    Button btn;
    TextView tvKq;
    Context context=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan412_main);
        tuan41volleyfn volleyfn= new tuan41volleyfn();
        tvKq=findViewById(R.id.t413tvkq);
        btn=findViewById(R.id.t413btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                volleyfn.getJsonArrayofObject(context,tvKq);
            }
        });
    }
}