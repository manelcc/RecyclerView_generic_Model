package com.example.exampleinheritancemodelrecyclerview;

import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolderGeneric extends RecyclerView.ViewHolder {

    private final OnEventClickExample listener;

    public ViewHolderGeneric(OnEventClickExample listener, @NonNull View itemView) {
        super(itemView);
        this.listener = listener;
    }

    public <T extends ModelAdapter> void bindView(T items) {

        Log.e("manel","el titulo es "+items.getTitle());
        //Cuidado ahora casteo a la concrecion del modelo porque conozco de que tipo es.
        Log.e("manel","el id es "+((ExternModel)items).getId());
        items.getDescription();
        items.getLabel();
        items.getTitle();

        if("111".equalsIgnoreCase(((ExternModel) items).getId())){
            listener.onEventAction(items);
        }
    }
}
