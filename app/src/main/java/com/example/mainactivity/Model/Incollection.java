package com.example.mainactivity.Model;

import androidx.recyclerview.widget.RecyclerView;

import com.example.mainactivity.Interfaces.BibType;
import com.example.mainactivity.ViewHolderFactory;

public class Incollection implements BibType {
    private String author;
    private String title;
    private String booktitle;
    private String publisher;
    private String year;
    public Incollection (String author, String title, String booktitle, String publisher, String year){
        this.author = !author.isEmpty() ? author : "Empty";
        this.title = !title.isEmpty() ? title : "Empty";
        this.booktitle = !booktitle.isEmpty() ? booktitle : "Empty";
        this.publisher = !publisher.isEmpty() ? publisher : "Empty";
        this.year = !year.isEmpty() ? year : "Empty";
    }
    @Override
    public int getItemViewType() {
        return BibType.INCOLLECTION_ROW_TYPE;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder) {
        ViewHolderFactory.IncollectionViewHolder incollectionViewHolder = (ViewHolderFactory.IncollectionViewHolder) viewHolder;
        incollectionViewHolder.author.setText(author);
        incollectionViewHolder.year.setText(year);
        incollectionViewHolder.booktitle.setText(booktitle);
        incollectionViewHolder.title.setText(title);
        incollectionViewHolder.publisher.setText(publisher);
    }
}
