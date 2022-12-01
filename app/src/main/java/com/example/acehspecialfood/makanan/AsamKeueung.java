package com.example.acehspecialfood.makanan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.acehspecialfood.Makanan;
import com.example.acehspecialfood.R;

public class AsamKeueung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asam_keueung);
    }

    public void back(View view) {
        Intent intent = new Intent(AsamKeueung.this, Makanan.class);
        startActivity(intent);
    }

}