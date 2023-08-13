package com.example.recyclerviewexample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.ProgrammingViewHolder> {

    private String[] data;
    public ProgrammingAdapter(String[] data){
        this.data = data;
    }


    @NonNull
    @Override
    public ProgrammingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_layout , parent , false);
        return new ProgrammingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgrammingViewHolder holder, int position) {
        String title = data[position];
        holder.textTitle.setText(title);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ProgrammingViewHolder extends RecyclerView.ViewHolder{
        ImageView imgIcon ;
        TextView textTitle;
        public ProgrammingViewHolder(@NonNull View itemView) {
            super(itemView);
            imgIcon = itemView.findViewById(R.id.imgIcon);
            textTitle = itemView.findViewById(R.id.textTitle);
        }
    }

}
