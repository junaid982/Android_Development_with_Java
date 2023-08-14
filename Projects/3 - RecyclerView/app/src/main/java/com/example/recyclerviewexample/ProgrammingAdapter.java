package com.example.recyclerviewexample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewexample.interfaces.AppInterfaces;

public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.ProgrammingViewHolder> {

    String[] languages;
    AppInterfaces.AdapterClick adapterClick;
    public ProgrammingAdapter(String[] languages, AppInterfaces.AdapterClick adapterClick) {
        this.languages = languages;
        this.adapterClick = adapterClick;
    }

    @NonNull
    @Override
    public ProgrammingAdapter.ProgrammingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v =  LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_layout,parent , false);
        return new ProgrammingViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgrammingAdapter.ProgrammingViewHolder holder, int position) {
        holder.textTitle.setText(languages[position]);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adapterClick.onClick(holder.getAdapterPosition());

            }
        });
    }

    @Override
    public int getItemCount() {
        return languages.length;
    }

    public class ProgrammingViewHolder extends RecyclerView.ViewHolder {
        ImageView imgIcon ;
        TextView textTitle;
        public ProgrammingViewHolder(@NonNull View itemView) {
            super(itemView);
            imgIcon = itemView.findViewById(R.id.imgIcon);
            textTitle = itemView.findViewById(R.id.textTitle);
        }
    }
}
