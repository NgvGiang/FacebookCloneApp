package com.example.fbclone;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fbclone.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}