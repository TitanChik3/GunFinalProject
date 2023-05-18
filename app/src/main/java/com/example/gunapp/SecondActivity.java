package com.example.gunapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SecondActivity extends AppCompatActivity {

    private ImageButton imageButtonColdgun;
    private ImageButton imageButtonFiregun;
    private ImageButton imageButtonHe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        imageButtonColdgun = findViewById(R.id.imageButtonColdgun);
        imageButtonFiregun = findViewById(R.id.imageButtonFiregun);
        imageButtonHe = findViewById(R.id.imageButtonHe);

        imageButtonColdgun.setOnClickListener(listener);
        imageButtonFiregun.setOnClickListener(listener);
        imageButtonHe.setOnClickListener(listener);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            switch (view.getId()) {
                case R.id.imageButtonColdgun:
                    Intent intentColdgun = new Intent(getApplicationContext(), ColdgunActivity.class);
                    intentColdgun.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                    startActivity(intentColdgun);
                    break;
                case R.id.imageButtonFiregun:
                    Intent intentFiregun = new Intent(getApplicationContext(), FiregunActivity.class);
                    intentFiregun.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intentFiregun);
                    break;
                case R.id.imageButtonHe:
                    Intent intentHe = new Intent(getApplicationContext(), HeActivity.class);
                    intentHe.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                    startActivity(intentHe);
                    break;
            }
        }
    };
}