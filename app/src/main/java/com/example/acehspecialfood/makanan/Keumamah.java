package com.example.acehspecialfood.makanan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.acehspecialfood.Makanan;
import com.example.acehspecialfood.R;

public class Keumamah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keumamah);
    }

    public void back(View view) {
        Intent intent = new Intent(Keumamah.this, Makanan.class);
        startActivity(intent);
    }

}