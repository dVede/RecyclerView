package com.example.mainactivity.Model;

import androidx.recyclerview.widget.RecyclerView;

import com.example.mainactivity.Interfaces.BibType;
import com.example.mainactivity.ViewHolderFactory;

public class Software implements BibType {
    private String author;
    private String title;
    private String tech;
    private String year;
    public Software (String author, String title, String tech, String year){
        this.author = !author.isEmpty() ? author : "Empty";
        this.title = !title.isEmpty() ? title : "Empty";
        this.tech = !tech.isEmpty() ? tech : "Empty";
        this.year = !year.isEmpty() ? year : "Empty";
    }
    @Override
    public int getItemViewType() {
        return BibType.SOFTWARE_ROW_TYPE;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder) {
        ViewHolderFactory.SoftwareViewHolder softwareViewHolder = (ViewHolderFactory.SoftwareViewHolder) viewHolder;
        softwareViewHolder.author.setText(author);
        softwareViewHolder.year.setText(year);
        softwareViewHolder.tech.setText(tech);
        softwareViewHolder.title.setText(title);
    }
}
