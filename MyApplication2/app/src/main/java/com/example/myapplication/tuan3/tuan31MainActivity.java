package com.example.myapplication.tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.myapplication.R;

public class tuan31MainActivity extends AppCompatActivity {
    ListView ls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan31_main);
        ls=findViewById(R.id.tuan31ls);
        //nguon du lieu
        String[] arr= new String[]{"Mon1","Mon 2","Mon "};
        ArrayAdapter<String> adapter= new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,arr);
        ls.setAdapter(adapter);

    }
}