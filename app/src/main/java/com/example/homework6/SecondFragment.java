package com.example.homework6;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.homework6.databinding.FragmentSecondBinding;

import java.util.ArrayList;

public class SecondFragment extends Fragment implements OnClick{
    private FragmentSecondBinding fragmentSecondBinding;
    private ArrayList<Music> musics;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container2,
                             Bundle savedInstanceState) {
        fragmentSecondBinding = FragmentSecondBinding.inflate(LayoutInflater.from(getContext()), container2, false);
        return fragmentSecondBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        MusicAdapter musicAdapter = new MusicAdapter(musics, this);
        fragmentSecondBinding.recycler.setAdapter(musicAdapter);
    }

    private void loadData() {
        musics = new ArrayList<>();
        musics.add(new Music("Morgenshtern", "я когда нибудь уйду", "02:40", "1"));
        musics.add(new Music("Мот, Jony", "Будь моим огнем или водопадом", "03:20", "2"));
        musics.add(new Music("The Kid LAROI", "WITHOUT YOU", "02:41","3"));
        musics.add(new Music("Kirkiimad", "Я лего 15 тысяч", "02:23","4"));
        musics.add(new Music("escape, Konfuz", "Не смотри", "02:32","5"));
        musics.add(new Music("FEDUK", "Хлопья летять наверх", "04:22","6"));
        musics.add(new Music("Ed Sheeran", "Shape of You", "03:53","7"));
        musics.add(new Music("Alan Walker", "Faded", "02:40","8"));
        musics.add(new Music("Morgenshtern", "Дуло", "02:06","9"));
        musics.add(new Music("Morgenshtern", "Show", "01:38","10"));

    }

    @Override
    public void onClick(Music music) {
        Intent intent = new Intent(requireActivity(),SecondActivity.class);
        intent.putExtra("text", music.getSinger());
        intent.putExtra("text1", music.getMusic());
        startActivity(intent);
    }
}