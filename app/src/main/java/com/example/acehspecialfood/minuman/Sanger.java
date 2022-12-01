package com.example.acehspecialfood.minuman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.acehspecialfood.Minuman;
import com.example.acehspecialfood.R;

public class Sanger extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sanger);
    }

    public void back(View view) {
        Intent intent = new Intent(Sanger.this, Minuman.class);
        startActivity(intent);
    }

}