package com.example.acehspecialfood.makanan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.acehspecialfood.HomeActivity;
import com.example.acehspecialfood.Makanan;
import com.example.acehspecialfood.R;

public class KuahBeulangong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuah_beulangong);
    }
    public void back(View view) {
        Intent intent = new Intent(KuahBeulangong.this, Makanan.class);
        startActivity(intent);
    }

}