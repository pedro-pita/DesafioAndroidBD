package com.zicronofandroid.projetobasededados;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class albumAdapter extends RecyclerView.Adapter<albumAdapter.AlbumViewHolder> {

    List<MainActivity.Album> albuns;

    albumAdapter(List<MainActivity.Album> albuns, MainActivity mainActivity) {
        this.albuns = albuns;
    }

    @Override
    public AlbumViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
        AlbumViewHolder pvh = new AlbumViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(AlbumViewHolder viewHolder, int i) {
        viewHolder.nomeView.setText(albuns.get(i).nome);
        viewHolder.artistaView.setText(albuns.get(i).artista);
    }

    @Override
    public int getItemCount() {
        return albuns.size();
    }

    public static class AlbumViewHolder extends RecyclerView.ViewHolder {
        TextView nomeView;
        TextView artistaView;

        AlbumViewHolder(View itemView) {
            super(itemView);
            nomeView = (TextView) itemView.findViewById(R.id.nomeView);
            artistaView = (TextView) itemView.findViewById(R.id.artista);
        }
    }
}
