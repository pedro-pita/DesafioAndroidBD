package com.zicronofandroid.projetobasededados;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    String[] nome,artista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rv = (RecyclerView)findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this));
        addAlbuns();
    }
    void addAlbuns() {
        List<Album> albuns= new ArrayList<Album>();
        Resources res = getResources();
        nome = res.getStringArray(R.array.nomeAlbum);
        artista = res.getStringArray(R.array.artista);
        for(int i=0;i<artista.length;i++){
            Album p1=new Album(nome[i],artista[i]);
            albuns.add(p1);
        }
        albumAdapter mandarAdapter= new albumAdapter(albuns,this);
        rv.setAdapter(mandarAdapter);
    }
    class Album {
        public String nome;
        public String artista;

        Album(String nome, String artista) {
            this.nome = nome;
            this.artista = artista;
        }
    }
}