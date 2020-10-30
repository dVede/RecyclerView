package com.example.mainactivity.Model;

import androidx.recyclerview.widget.RecyclerView;

import com.example.mainactivity.Interfaces.BibType;
import com.example.mainactivity.ViewHolderFactory;

public class Editorial implements BibType {
    private String author;
    private String title;
    private String pages;
    private String year;
    public Editorial (String author, String title, String pages, String year){
        this.author = !author.isEmpty() ? author : "Empty";
        this.title = !title.isEmpty() ? title : "Empty";
        this.pages = !pages.isEmpty() ? pages : "Empty";
        this.year = !year.isEmpty() ? year : "Empty";
    }

    @Override
    public int getItemViewType() {
        return BibType.EDITORIAL_ROW_TYPE;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder) {
        ViewHolderFactory.EditorialViewHolder editorialViewHolder = (ViewHolderFactory.EditorialViewHolder) viewHolder;
        editorialViewHolder.author.setText(author);
        editorialViewHolder.year.setText(year);
        editorialViewHolder.pages.setText(pages);
        editorialViewHolder.title.setText(title);
    }
}
