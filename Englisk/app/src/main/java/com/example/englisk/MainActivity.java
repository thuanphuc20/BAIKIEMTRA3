package com.example.englisk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView;
        ArrayList<Thi> arraylist;
        AdapterT adapter;

        listView = findViewById(R.id.list_item);
        arraylist = new ArrayList<>();
        arraylist.add(new Thi("hien tai don","S + V inf"));
        arraylist.add(new Thi("qua khu don","S + V2"));

       adapter = new AdapterT( MainActivity.this,R.layout.layou_thi, arraylist );
        listView.setAdapter(adapter);
    }
}