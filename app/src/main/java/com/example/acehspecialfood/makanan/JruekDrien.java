package com.example.acehspecialfood.makanan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.acehspecialfood.Makanan;
import com.example.acehspecialfood.R;

public class JruekDrien extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jruek_drien);
    }

    public void back(View view) {
        Intent intent = new Intent(JruekDrien.this, Makanan.class);
        startActivity(intent);
    }

}