package com.example.ezcommerce5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import static androidx.recyclerview.widget.RecyclerView.*;

public class Adaptery extends RecyclerView.Adapter<Adaptery.MyViewHolder> {

        private Context mContext;
        private List<Movie> moviesList;


    public Adaptery(Context mContext, List<Movie> moviesList) {
        this.mContext = mContext;
        this.moviesList = moviesList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movie_item, parent, false);
        //LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        //v = layoutInflater.inflate(R.layout.movie_item, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.id.setText(moviesList.get(position).getId());
        holder.title.setText(moviesList.get(position).getName());

        //Glide
        Glide.with(mContext)
                .load(moviesList.get(position).getImage())
                .into(holder.img);

    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder{

        public TextView title;
        public TextView id;
        public ImageView img;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.textView4);
            id = itemView.findViewById(R.id.textView5);
            img = itemView.findViewById(R.id.imageView);
        }
    }


}
