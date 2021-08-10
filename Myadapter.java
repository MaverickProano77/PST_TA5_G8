package com.example.amst8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Myadapter extends RecyclerView.Adapter<Myadapter.MyViewHolder> {
    Context context;
    ArrayList<Peliculas> peliculasArrayList;

    public Myadapter(Context context, ArrayList<Peliculas> peliculasArrayList) {
        this.context = context;
        this.peliculasArrayList = peliculasArrayList;
    }

    @NonNull
    @Override
    public Myadapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.libro,parent,false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Myadapter.MyViewHolder holder, int position) {

        Peliculas p = peliculasArrayList.get(position);
        Glide.with(context).load(p.getImagen_url()).into(holder.imagenLibro);

        holder.titulo.setText(p.titulo);
        holder.autor.setText(p.autor);
        holder.editorial.setText(p.editorial);
        //holder.ima.setText(p.titulo);

    }

    @Override
    public int getItemCount() {
        return peliculasArrayList.size();
    }
    public static class  MyViewHolder extends RecyclerView.ViewHolder{
        TextView titulo, autor, editorial;
        ImageView imagenLibro;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imagenLibro = itemView.findViewById(R.id.imageView3);
            titulo= itemView.findViewById(R.id.txtitulo);
            autor=itemView.findViewById(R.id.txtAutor);
            editorial=itemView.findViewById(R.id.txtEditorial);

        }
    }
}
