package com.example.myapplication.tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.R;

public class tuan2MainActivity extends AppCompatActivity {
    EditText txt1,txt2;
    Button btn1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan2_main);
        txt1=findViewById(R.id.tuan2et1);

        txt2= findViewById(R.id.tuan2et2);
        btn1= findViewById(R.id.but1);

        btn1.setOnClickListener(v -> {
            Intent i= new Intent(tuan2MainActivity.this, tuan2secondActivity.class);
            i.putExtra("so1",txt1.getText().toString());
            i.putExtra("so2",txt2.getText().toString());
            startActivity(i);

        });
    }
}