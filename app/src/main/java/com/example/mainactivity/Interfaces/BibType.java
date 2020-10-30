package com.example.mainactivity.Interfaces;

import androidx.recyclerview.widget.RecyclerView;

public interface BibType {
    int ARTICLE_ROW_TYPE = 0;
    int BOOK_ROW_TYPE = 1;
    int EDITORIAL_ROW_TYPE = 2;
    int INCOLLECTION_ROW_TYPE = 3;
    int INPROCEEDINGS_ROW_TYPE = 4;
    int MISC_ROW_TYPE = 5;
    int TECHREPORT_ROW_TYPE = 6;
    int UNPUBLISHED_ROW_TYPE = 7;
    int SOFTWARE_ROW_TYPE = 8;

    int getItemViewType();

    void onBindViewHolder(RecyclerView.ViewHolder viewHolder);

}
