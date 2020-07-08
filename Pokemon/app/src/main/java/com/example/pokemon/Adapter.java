package com.example.pokemon;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter {

    ArrayList<pokemon> pocArray;

    public Adapter(ArrayList<pokemon> pocArray){this.pocArray=pocArray;}

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
          View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.pokemonlist,parent,false);
          ViewHolder vh = new ViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder) holder).img.setImageResource(pocArray.get(position).getImage());
        ((ViewHolder) holder).pokemonName.setText(pocArray.get(position).getName());
        ((ViewHolder) holder).pokemonTotal.setText(pocArray.get(position).getTotal()+"");
    }

    @Override
    public int getItemCount() {
        return pocArray.size(); }



    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView img;
        public TextView pokemonName;
        public TextView pokemonTotal;
        public View view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        view=itemView;
        pokemonName = itemView.findViewById(R.id.textView1);
        pokemonTotal = itemView.findViewById(R.id.textView3);
        img = itemView.findViewById(R.id.imageView);
        }
    }
}
