package com.example.mainactivity.Model;

import androidx.recyclerview.widget.RecyclerView;

import com.example.mainactivity.Interfaces.BibType;
import com.example.mainactivity.ViewHolderFactory;

public class Unpublished implements BibType {
    private String author;
    private String title;
    private String year;
    public Unpublished (String author, String title, String year){
        this.author = !author.isEmpty() ? author : "Empty";
        this.title = !title.isEmpty() ? title : "Empty";
        this.year = !year.isEmpty() ? year : "Empty";
    }
    @Override
    public int getItemViewType() {
        return BibType.UNPUBLISHED_ROW_TYPE;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder) {
        ViewHolderFactory.UnpublishedViewHolder unpublishedViewHolder = (ViewHolderFactory.UnpublishedViewHolder) viewHolder;
        unpublishedViewHolder.author.setText(author);
        unpublishedViewHolder.year.setText(year);
        unpublishedViewHolder.title.setText(title);
    }
}
