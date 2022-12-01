package com.example.acehspecialfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.acehspecialfood.minuman.IeBohTimon;
import com.example.acehspecialfood.minuman.JusNipah;
import com.example.acehspecialfood.minuman.KupiKhop;
import com.example.acehspecialfood.minuman.Sanger;
import com.example.acehspecialfood.minuman.TehTarek;

public class Minuman extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minuman);
    }

    public void back(View view) {
        Intent intent = new Intent(Minuman.this,HomeActivity.class);
        startActivity(intent);
    }

    public void imageview6(View view) {
        Intent intent = new Intent(Minuman.this, KupiKhop.class);
        startActivity(intent);
    }

    public void imageview7(View view) {
        Intent intent = new Intent(Minuman.this, Sanger.class);
        startActivity(intent);
    }

    public void imageview8(View view) {
        Intent intent = new Intent(Minuman.this, IeBohTimon.class);
        startActivity(intent);
    }

    public void imageview9(View view) {
        Intent intent = new Intent(Minuman.this, TehTarek.class);
        startActivity(intent);
    }

    public void imageview10(View view) {
        Intent intent = new Intent(Minuman.this, JusNipah.class);
        startActivity(intent);
    }

}