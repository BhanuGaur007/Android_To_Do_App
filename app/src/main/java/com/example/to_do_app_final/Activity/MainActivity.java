package com.example.to_do_app_final.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.to_do_app_final.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Home");

    }
}