package com.example.acehspecialfood.minuman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.acehspecialfood.Makanan;
import com.example.acehspecialfood.Minuman;
import com.example.acehspecialfood.R;
import com.example.acehspecialfood.makanan.AsamKeueung;

public class TehTarek extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teh_tarek);
    }

    public void back(View view) {
        Intent intent = new Intent(TehTarek.this, Minuman.class);
        startActivity(intent);
    }

}