package com.example.gunapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FiregunActivity extends AppCompatActivity {

    private ListView firegunList;
    private String[] arrayFiregun = {"M416(5,56 мм)", "Снайперская винтовка Мосина(7,62 мм)", "Пистолет Макарова(9 мм)", "Ак-74(5,45 мм)", "Пистолет-пулемет Шпагина(7,62 мм)", "Glock 17(9 мм)", "P90(5,7 мм)","Снайперская винтовка Драгунова(7,62 мм)","Ump-45(9 мм)","M249(5,56 мм)","ПП-19(9x19 мм)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firegun);

        firegunList = findViewById(R.id.firegungunList);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayFiregun);
        firegunList.setAdapter(adapter);


    }
}