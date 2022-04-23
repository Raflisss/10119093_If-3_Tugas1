package com.example.hitwer_10119093;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//Rafli Solihudin (10119093)-IF3
//Tanggal : 23-04-2022
public class MainActivity extends AppCompatActivity {
    private Button buttonT;
    private Button buttonP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View decorView = getWindow().getDecorView();

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        buttonT = findViewById(R.id.button5);
        buttonP = findViewById(R.id.button);

        buttonT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, profile.class);
                startActivity(intent);
            }
        });

        buttonP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Login.class);
                startActivity(intent);
            }
        });
    }
}