package com.example.a663java;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter_H extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<Hor_0> list;
    Context context;

    public Adapter_H(ArrayList<Hor_0> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.products_view_horizontal, parent, false);
        return new MyView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Hor_0 hor_0 = list.get(position);
        if (holder instanceof MyView) {
            ((MyView) holder).textView.setText(hor_0.title);
            ((MyView) holder).imageView.setImageResource(hor_0.image);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyView extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;

        public MyView(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.hor_text_id);
            imageView = itemView.findViewById(R.id.hor_image_id);
        }
    }
}
