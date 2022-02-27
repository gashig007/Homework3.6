package com.example.homework6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TextView;

import com.example.homework6.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
private ActivitySecondBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.text.setText(getIntent().getStringExtra("text"));
        binding.text1.setText(getIntent().getStringExtra("text1"));
    }
}