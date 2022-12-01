package com.example.acehspecialfood.minuman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.acehspecialfood.Minuman;
import com.example.acehspecialfood.R;

public class KupiKhop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kupi_khop);
    }

    public void back(View view) {
        Intent intent = new Intent(KupiKhop.this, Minuman.class);
        startActivity(intent);
    }

}