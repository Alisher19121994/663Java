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

public class Adapter_Explores extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<Explores> list;
    Context context;

    public Adapter_Explores(ArrayList<Explores> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.explores, parent, false);
        return new MyView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
      Explores explores = list.get(position);
        if (holder instanceof MyView) {
            ((MyView) holder).imageView.setImageResource(explores.image);
            ((MyView) holder).textView1.setText(explores.title);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyView extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView1;

        public MyView(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.explore_image_id);
            textView1 = itemView.findViewById(R.id.explore_text_id);
        }
    }
}
