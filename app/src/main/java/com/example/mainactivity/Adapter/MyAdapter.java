package com.example.mainactivity.Adapter;

import android.os.Build;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mainactivity.Interfaces.BibType;
import com.example.mainactivity.ViewHolderFactory;

import java.util.ArrayList;
import java.util.Objects;

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<BibType> bibData;
    public MyAdapter (ArrayList<BibType> bibData){
        this.bibData = bibData;
    }

    @Override
    public int getItemViewType(int position) {
        int pos = position != 0? position % bibData.size() : position;
        return bibData.get(pos).getItemViewType();
    }

    @NonNull
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return Objects.requireNonNull(ViewHolderFactory.create(parent, viewType));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        int pos = position != 0? position % bibData.size() : position;
        bibData.get(pos).onBindViewHolder(holder);
    }

    @Override
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }
}
