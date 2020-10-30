package com.example.mainactivity.Model;

import androidx.recyclerview.widget.RecyclerView;

import com.example.mainactivity.Interfaces.BibType;
import com.example.mainactivity.ViewHolderFactory;

public class Misc implements BibType {
    private String author;
    private String title;
    private String year;
    public Misc (String author, String title, String year){
        this.author = !author.isEmpty() ? author : "Empty";
        this.title = !title.isEmpty() ? title : "Empty";
        this.year = !year.isEmpty() ? year : "Empty";
    }
    @Override
    public int getItemViewType() {
        return BibType.MISC_ROW_TYPE;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder) {
        ViewHolderFactory.MiscViewHolder miscViewHolder = (ViewHolderFactory.MiscViewHolder) viewHolder;
        miscViewHolder.author.setText(author);
        miscViewHolder.year.setText(year);
        miscViewHolder.title.setText(title);
    }
}
