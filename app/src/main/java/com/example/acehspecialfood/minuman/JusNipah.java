package com.example.acehspecialfood.minuman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.acehspecialfood.Makanan;
import com.example.acehspecialfood.Minuman;
import com.example.acehspecialfood.R;
import com.example.acehspecialfood.makanan.AsamKeueung;

public class JusNipah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jus_nipah);
    }

    public void back(View view) {
        Intent intent = new Intent(JusNipah.this, Minuman.class);
        startActivity(intent);
    }

}