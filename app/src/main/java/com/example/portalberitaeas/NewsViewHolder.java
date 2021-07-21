package com.example.portalberitaeas;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.portalberitaeas.R;

import androidx.cardview.widget.CardView;

public class NewsViewHolder extends RecyclerView.ViewHolder {

    public ImageView image;
    public TextView title;
    public TextView publishedAt;
    public CardView cvNews;
    public View view;

    public NewsViewHolder(View view) {
        super(view);

        cvNews = view.findViewById(R.id.cvNews);
        image = view.findViewById(R.id.image);
        title = view.findViewById(R.id.title);
        publishedAt = view.findViewById(R.id.publishedAt);
        this.view = view;
    }
}