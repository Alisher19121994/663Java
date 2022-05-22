package com.example.a663java;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter_G_2 extends  RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<G_2> list;
    Context context;

    public Adapter_G_2(ArrayList<G_2> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.products_gridview_2, parent, false);
        return new MyView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        G_2 g_2 = list.get(position);
        if (holder instanceof MyView) {
            ((MyView) holder).imageView.setImageResource(g_2.image);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyView extends RecyclerView.ViewHolder {
        ImageView imageView;

        public MyView(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.grid_popular_image_id);
        }
    }
}
