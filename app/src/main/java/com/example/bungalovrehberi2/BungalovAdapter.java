package com.example.bungalovrehberi2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.bungalovrehberi2.BungalovList.Ev;

import java.util.List;

public class BungalovAdapter extends RecyclerView.Adapter<BungalovAdapter.BungalovViewHolder> {
    private List<Ev> evList;

    public BungalovAdapter(List<Ev> evList) {
        this.evList = evList;
    }

    @NonNull
    @Override
    public BungalovViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bungalov, parent, false);
        return new BungalovViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BungalovViewHolder holder, int position) {
        Ev ev = evList.get(position);
        holder.textViewName.setText(ev.getIsim());
        holder.textViewMaxKisi.setText(String.valueOf(ev.getMax_kisi()));
        Glide.with(holder.itemView.getContext()).load(ev.getFile()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return evList.size();
    }

    static class BungalovViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewMaxKisi;
        ImageView imageView;

        BungalovViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewName = itemView.findViewById(R.id.textViewName);
            textViewMaxKisi = itemView.findViewById(R.id.textViewMaxKisi);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
