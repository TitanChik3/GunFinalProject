package com.example.gunapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HeActivity extends AppCompatActivity {
    private ListView heList;
    private String[] arrayHe= {"Осколочная граната", "Световая граната", "Шумовая граната","Дымовая граната"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_he);
        heList = findViewById(R.id.heList);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayHe);
        heList.setAdapter(adapter);
    }
}