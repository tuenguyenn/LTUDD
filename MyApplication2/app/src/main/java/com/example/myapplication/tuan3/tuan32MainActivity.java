package com.example.myapplication.tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.myapplication.R;

import java.util.ArrayList;

public class tuan32MainActivity extends AppCompatActivity {
    ListView lv;
    t32adapter adapter;
    ArrayList<T32contact> ls=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan32_main);
        lv= findViewById(R.id.tuan32ls);
        ls.add(new T32contact("nguyen van a","18",R.drawable.android));
        ls.add(new T32contact("nguyen van meo","20",R.drawable.apple));
        ls.add(new T32contact("lê van a","18",R.drawable.kimbap));
        ls.add(new T32contact("nguyen van dau","21",R.drawable.kimchi));
        ls.add(new T32contact("nguyen minh don","23",R.drawable.kimnamjoo));
        ls.add(new T32contact("nguyen van a","18",R.drawable.android));
        ls.add(new T32contact("nguyen van meo","20",R.drawable.apple));
        ls.add(new T32contact("lê van a","18",R.drawable.kimbap));
        ls.add(new T32contact("nguyen van dau","21",R.drawable.kimchi));
        ls.add(new T32contact("nguyen minh don","23",R.drawable.kimnamjoo));
        adapter= new t32adapter(ls,this);
        lv.setAdapter(adapter);

    }
}