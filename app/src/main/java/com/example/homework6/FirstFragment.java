package com.example.homework6;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.homework6.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {
private FragmentFirstBinding fragmentFirstBinding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container1,
                             Bundle savedInstanceState) {
        fragmentFirstBinding = FragmentFirstBinding.inflate(LayoutInflater.from(getContext()), container1, false);
        return fragmentFirstBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}