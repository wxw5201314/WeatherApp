package com.example.weatherappdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.litepal.LitePal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LitePal.getDatabase(); //创建数据库

    }
}