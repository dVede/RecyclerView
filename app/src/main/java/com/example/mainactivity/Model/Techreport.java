package com.example.mainactivity.Model;

import androidx.recyclerview.widget.RecyclerView;

import com.example.mainactivity.Interfaces.BibType;
import com.example.mainactivity.ViewHolderFactory;

public class Techreport implements BibType {
    private String author;
    private String title;
    private String publisher;
    private String year;
    public Techreport (String author, String title, String publisher, String year){
        this.author = !author.isEmpty() ? author : "Empty";
        this.title = !title.isEmpty() ? title : "Empty";
        this.publisher = !publisher.isEmpty() ? publisher : "Empty";
        this.year = !year.isEmpty() ? year : "Empty";
    }

    @Override
    public int getItemViewType() {
        return BibType.TECHREPORT_ROW_TYPE;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder) {
        ViewHolderFactory.TechreportViewHolder techreportViewHolder = (ViewHolderFactory.TechreportViewHolder) viewHolder;
        techreportViewHolder.author.setText(author);
        techreportViewHolder.year.setText(year);
        techreportViewHolder.publisher.setText(publisher);
        techreportViewHolder.title.setText(title);
    }
}
