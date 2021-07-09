package com.example.idenditycard;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PeopleAdapter extends RecyclerView.Adapter<PeopleViewHolder> {
    private ArrayList<People> peopleList;
    public PeopleAdapter(ArrayList<People> peopleArrayList){
        peopleList = peopleArrayList;
    }

    @Override
    public PeopleViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new PeopleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PeopleViewHolder holder, int position) {
        People people= peopleList.get(position);
        holder.setData(people);
    }

    @Override
    public int getItemCount() {
        return peopleList.size();
    }
}
