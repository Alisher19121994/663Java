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

public class Adapter_Books extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<Books> list;
    Context context;

    public Adapter_Books(ArrayList<Books> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.books, parent, false);
        return new MyView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
      Books books = list.get(position);
        if (holder instanceof MyView) {
            ((MyView) holder).imageView.setImageResource(books.image);
            ((MyView) holder).textView1.setText(books.title);
            ((MyView) holder).textView2.setText(books.costs);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyView extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView1;
        TextView textView2;

        public MyView(@NonNull View itemView) {
            super(itemView);
            textView1 = itemView.findViewById(R.id.books_text_id);
            textView2 = itemView.findViewById(R.id.books_cost_id);
            imageView = itemView.findViewById(R.id.books_image_id);
        }
    }
}
