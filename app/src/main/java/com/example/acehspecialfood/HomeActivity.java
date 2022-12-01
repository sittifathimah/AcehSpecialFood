package com.example.acehspecialfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void back(View view) {
        Intent intent = new Intent(HomeActivity.this,MainActivity.class);
        startActivity(intent);
    }

    public void home(View view) {
        Intent intent = new Intent(HomeActivity.this,Makanan.class);
        startActivity(intent);
    }

    public void home1(View view) {
        Intent intent = new Intent(HomeActivity.this,Minuman.class);
        startActivity(intent);
    }

}