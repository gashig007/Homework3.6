package com.example.homework6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homework6.databinding.ItemMusicBinding;

import java.util.ArrayList;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.MusicViewHolder> {
    private ArrayList<Music> musics;
    private OnClick onClick;

    public MusicAdapter(ArrayList<Music> musics, OnClick onClick) {
        this.musics = musics;
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public MusicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MusicViewHolder(ItemMusicBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MusicViewHolder holder, int position) {
        holder.bind(musics.get(position));
    }

    @Override
    public int getItemCount() {
        return musics.size();
    }


    class MusicViewHolder extends RecyclerView.ViewHolder {
        private ItemMusicBinding binding;

        public MusicViewHolder(@NonNull ItemMusicBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void bind(Music music) {
            binding.music.setText(music.getMusic());
            binding.singer.setText(music.getSinger());
            binding.time.setText(music.getTime());
            binding.number.setText(music.getNumber());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onClick.onClick(musics.get(getAdapterPosition()));
                }
            });
        }
    }
}
