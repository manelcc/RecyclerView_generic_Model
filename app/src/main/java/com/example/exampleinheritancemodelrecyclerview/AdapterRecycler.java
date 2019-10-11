package com.example.exampleinheritancemodelrecyclerview;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class AdapterRecycler<T extends ModelAdapter> extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private final List<T> items;
    private final OnEventClickExample listener;

    public AdapterRecycler(List<T> listValues, OnEventClickExample listener) {
        this.items = listValues;
        this.listener = listener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolderGeneric(listener,LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_calendar, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolderGeneric)holder).bindView(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
