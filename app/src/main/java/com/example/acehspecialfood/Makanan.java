package com.example.acehspecialfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.acehspecialfood.makanan.AsamKeueung;
import com.example.acehspecialfood.makanan.JruekDrien;
import com.example.acehspecialfood.makanan.Keumamah;
import com.example.acehspecialfood.makanan.KuahBeulangong;
import com.example.acehspecialfood.makanan.KuahPliekU;

public class Makanan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makanan);
    }

    public void back(View view) {
        Intent intent = new Intent(Makanan.this,HomeActivity.class);
        startActivity(intent);
    }

    public void imageview1(View view) {
        Intent intent = new Intent(Makanan.this, Keumamah.class);
        startActivity(intent);
    }

    public void imageview2(View view) {
        Intent intent = new Intent(Makanan.this, AsamKeueung.class);
        startActivity(intent);
    }

    public void imageview3(View view) {
        Intent intent = new Intent(Makanan.this, KuahBeulangong.class);
        startActivity(intent);
    }

    public void imageview4(View view) {
        Intent intent = new Intent(Makanan.this, JruekDrien.class);
        startActivity(intent);
    }

    public void imageview5(View view) {
        Intent intent = new Intent(Makanan.this, KuahPliekU.class);
        startActivity(intent);
    }

}