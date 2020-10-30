package com.example.mainactivity.Model;

import androidx.recyclerview.widget.RecyclerView;

import com.example.mainactivity.Interfaces.BibType;
import com.example.mainactivity.ViewHolderFactory;

public class Inproceedings implements BibType {
    private String author;
    private String title;
    private String booktitle;
    private String year;
    public Inproceedings (String author, String title, String booktitle, String year){
        this.author = !author.isEmpty() ? author : "Empty";
        this.title = !title.isEmpty() ? title : "Empty";
        this.booktitle = !booktitle.isEmpty() ? booktitle : "Empty";
        this.year = !year.isEmpty() ? year : "Empty";
    }
    @Override
    public int getItemViewType() {
        return BibType.INPROCEEDINGS_ROW_TYPE;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder) {
        ViewHolderFactory.InproceedingsViewHolder inproceedingsViewHolder = (ViewHolderFactory.InproceedingsViewHolder) viewHolder;
        inproceedingsViewHolder.author.setText(author);
        inproceedingsViewHolder.year.setText(year);
        inproceedingsViewHolder.booktitle.setText(booktitle);
        inproceedingsViewHolder.title.setText(title);
    }
}
