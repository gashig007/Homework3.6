package com.example.homework6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.homework6.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.container1,new FirstFragment()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.container2,new SecondFragment()).commit();
    }
}