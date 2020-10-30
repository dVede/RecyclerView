package com.example.mainactivity.Model;

import androidx.recyclerview.widget.RecyclerView;

import com.example.mainactivity.Interfaces.BibType;
import com.example.mainactivity.ViewHolderFactory;

public class Book implements BibType {
    private String author;
    private String title;
    private String publisher;
    private String year;
    public Book (String author, String title, String publisher, String year){
        this.author = !author.isEmpty() ? author : "Empty";
        this.title = !title.isEmpty() ? title : "Empty";
        this.publisher = !publisher.isEmpty() ? publisher :"Empty";
        this.year = !year.isEmpty() ? year : "Empty";
    }

    @Override
    public int getItemViewType() {
        return BibType.BOOK_ROW_TYPE;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder) {
        ViewHolderFactory.BookViewHolder bookViewHolder = (ViewHolderFactory.BookViewHolder) viewHolder;
        bookViewHolder.author.setText(author);
        bookViewHolder.year.setText(year);
        bookViewHolder.publisher.setText(publisher);
        bookViewHolder.title.setText(title);
    }
}
