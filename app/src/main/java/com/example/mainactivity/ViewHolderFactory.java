package com.example.mainactivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mainactivity.Interfaces.BibType;

public class ViewHolderFactory {

    public static class ArticleViewHolder extends RecyclerView.ViewHolder {
        public TextView author;
        public TextView title;
        public TextView journal;
        public TextView year;

        public ArticleViewHolder(@NonNull View itemView) {
            super(itemView);
            author = itemView.findViewById(R.id.article_author);
            title = itemView.findViewById(R.id.article_title);
            journal = itemView.findViewById(R.id.article_journal);
            year = itemView.findViewById(R.id.article_year);
        }
    }

    public static class BookViewHolder extends RecyclerView.ViewHolder {
        public TextView author;
        public TextView title;
        public TextView publisher;
        public TextView year;

        public BookViewHolder(@NonNull View itemView) {
            super(itemView);
            author = itemView.findViewById(R.id.book_author);
            title = itemView.findViewById(R.id.book_title);
            publisher = itemView.findViewById(R.id.book_publisher);
            year = itemView.findViewById(R.id.book_year);
        }
    }

    public static class EditorialViewHolder extends RecyclerView.ViewHolder {
        public TextView author;
        public TextView title;
        public TextView pages;
        public TextView year;

        public EditorialViewHolder(@NonNull View itemView) {
            super(itemView);
            author = itemView.findViewById(R.id.editorial_author);
            title = itemView.findViewById(R.id.editorial_title);
            pages = itemView.findViewById(R.id.editorial_pages);
            year = itemView.findViewById(R.id.editorial_year);
        }
    }

    public static class IncollectionViewHolder extends RecyclerView.ViewHolder {
        public TextView author;
        public TextView title;
        public TextView booktitle;
        public TextView publisher;
        public TextView year;

        public IncollectionViewHolder(@NonNull View itemView) {
            super(itemView);
            author = itemView.findViewById(R.id.incollection_author);
            title = itemView.findViewById(R.id.incollection_title);
            booktitle = itemView.findViewById(R.id.incollection_booktitle);
            publisher = itemView.findViewById(R.id.incollection_publisher);
            year = itemView.findViewById(R.id.incollection_year);
        }
    }

    public static class InproceedingsViewHolder extends RecyclerView.ViewHolder {
        public TextView author;
        public TextView title;
        public TextView booktitle;
        public TextView year;

        public InproceedingsViewHolder(@NonNull View itemView) {
            super(itemView);
            author = itemView.findViewById(R.id.inproceedings_author);
            title = itemView.findViewById(R.id.inproceedings_title);
            booktitle = itemView.findViewById(R.id.inproceedings_booktitle);
            year = itemView.findViewById(R.id.inproceedings_year);
        }
    }

    public static class MiscViewHolder extends RecyclerView.ViewHolder {
        public TextView author;
        public TextView title;
        public TextView year;

        public MiscViewHolder(@NonNull View itemView) {
            super(itemView);
            author = itemView.findViewById(R.id.misc_author);
            title = itemView.findViewById(R.id.misc_title);
            year = itemView.findViewById(R.id.misc_year);
        }
    }

    public static class SoftwareViewHolder extends RecyclerView.ViewHolder {
        public TextView author;
        public TextView title;
        public TextView tech;
        public TextView year;

        public SoftwareViewHolder(@NonNull View itemView) {
            super(itemView);
            author = itemView.findViewById(R.id.software_author);
            title = itemView.findViewById(R.id.software_title);
            tech = itemView.findViewById(R.id.software_tech);
            year = itemView.findViewById(R.id.software_year);
        }
    }

    public static class TechreportViewHolder extends RecyclerView.ViewHolder {
        public TextView author;
        public TextView title;
        public TextView publisher;
        public TextView year;

        public TechreportViewHolder(@NonNull View itemView) {
            super(itemView);
            author = itemView.findViewById(R.id.techreport_author);
            title = itemView.findViewById(R.id.techreport_title);
            publisher = itemView.findViewById(R.id.techreport_institution);
            year = itemView.findViewById(R.id.techreport_year);
        }
    }

    public static class UnpublishedViewHolder extends RecyclerView.ViewHolder {
        public TextView author;
        public TextView title;
        public TextView year;

        public UnpublishedViewHolder(@NonNull View itemView) {
            super(itemView);
            author = itemView.findViewById(R.id.unpublished_author);
            title = itemView.findViewById(R.id.unpublished_title);
            year = itemView.findViewById(R.id.unpublished_note);
        }
    }

    public static RecyclerView.ViewHolder create(ViewGroup parent, int rowType) {
        switch (rowType) {
            case BibType.ARTICLE_ROW_TYPE:
                View articleView = LayoutInflater.from(parent.getContext()).inflate(R.layout.article_type, parent, false);
                return new ViewHolderFactory.ArticleViewHolder(articleView);
            case BibType.BOOK_ROW_TYPE:
                View bookView = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_type, parent, false);
                return new ViewHolderFactory.BookViewHolder(bookView);
            case BibType.EDITORIAL_ROW_TYPE:
                View editorialView = LayoutInflater.from(parent.getContext()).inflate(R.layout.editorial_type, parent, false);
                return new ViewHolderFactory.EditorialViewHolder(editorialView);
            case BibType.INCOLLECTION_ROW_TYPE:
                View incollectionView = LayoutInflater.from(parent.getContext()).inflate(R.layout.incollection_type, parent, false);
                return new ViewHolderFactory.IncollectionViewHolder(incollectionView);
            case BibType.INPROCEEDINGS_ROW_TYPE:
                View inproceedingsView = LayoutInflater.from(parent.getContext()).inflate(R.layout.inproceedings_type, parent, false);
                return new ViewHolderFactory.InproceedingsViewHolder(inproceedingsView);
            case BibType.MISC_ROW_TYPE:
                View miscView = LayoutInflater.from(parent.getContext()).inflate(R.layout.misc_type, parent, false);
                return new ViewHolderFactory.MiscViewHolder(miscView);
            case BibType.SOFTWARE_ROW_TYPE:
                View softwareView = LayoutInflater.from(parent.getContext()).inflate(R.layout.software_type, parent, false);
                return new ViewHolderFactory.SoftwareViewHolder(softwareView);
            case BibType.TECHREPORT_ROW_TYPE:
                View techreportView = LayoutInflater.from(parent.getContext()).inflate(R.layout.techreport_type, parent, false);
                return new ViewHolderFactory.TechreportViewHolder(techreportView);
            case BibType.UNPUBLISHED_ROW_TYPE:
                View unpublishedView = LayoutInflater.from(parent.getContext()).inflate(R.layout.unpublished_type, parent, false);
                return new ViewHolderFactory.UnpublishedViewHolder(unpublishedView);
            default:
                return null;
        }
    }
}
