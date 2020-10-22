package com.example.restaurantibmandroid;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.restaurantibmandroid.restaurant.RestaurantDetailsActivity;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {
    private ArrayList<Item> items;
    private Context context;
    private RecyclerViewListener recyclerViewListener;
    private ItemViewHolder  itemViewHolder;

    public ItemAdapter(ArrayList<Item> items, Context context) {
        this.context=context;
        this.items = items;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        Item item = items.get(position);
        holder.image.setImageDrawable(ContextCompat.getDrawable(context, item.getIcon()));
        holder.title.setText(item.getTitle());
        holder.subtitle.setText(item.getSubtitle());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }


    public class ItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private AppCompatImageView image;
        private AppCompatTextView title;
        private AppCompatTextView subtitle;
        RecyclerViewListener recyclerViewListener;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            title = itemView.findViewById(R.id.title);
            subtitle = itemView.findViewById(R.id.subtitle);

            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View view) {
            //itemViewHolder.onClick(view, getAdapterPosition());
        }


    }

    public interface RecyclerViewListener {
        void onClick(View view, int position);
    }


}

