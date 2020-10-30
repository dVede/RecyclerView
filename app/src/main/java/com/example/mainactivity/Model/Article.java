package com.example.mainactivity.Model;

import androidx.recyclerview.widget.RecyclerView;

import com.example.mainactivity.Interfaces.BibType;
import com.example.mainactivity.ViewHolderFactory;

public class Article implements BibType {
    private String author;
    private String title;
    private String journal;
    private String year;
    public Article (String author, String title, String journal, String year){
        this.author = !author.isEmpty() ? author : "Empty";
        this.title = !title.isEmpty() ? title : "Empty";
        this.journal = !journal.isEmpty() ? journal : "Empty";
        this.year = !year.isEmpty() ? year : "Empty";
    }

    @Override
    public int getItemViewType() {
        return BibType.ARTICLE_ROW_TYPE;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder) {
        ViewHolderFactory.ArticleViewHolder articleViewHolder = (ViewHolderFactory.ArticleViewHolder) viewHolder;
        articleViewHolder.author.setText(author);
        articleViewHolder.year.setText(year);
        articleViewHolder.journal.setText(journal);
        articleViewHolder.title.setText(title);
    }
}
