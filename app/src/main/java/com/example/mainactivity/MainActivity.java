package com.example.mainactivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mainactivity.Adapter.MyAdapter;
import com.example.mainactivity.Interfaces.BibType;
import com.example.mainactivity.Model.Article;
import com.example.mainactivity.Model.Book;
import com.example.mainactivity.Model.Editorial;
import com.example.mainactivity.Model.Incollection;
import com.example.mainactivity.Model.Inproceedings;
import com.example.mainactivity.Model.Misc;
import com.example.mainactivity.Model.Software;
import com.example.mainactivity.Model.Techreport;
import com.example.mainactivity.Model.Unpublished;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import name.ank.lab4.BibDatabase;
import name.ank.lab4.BibEntry;
import name.ank.lab4.Keys;
import name.ank.lab4.Types;

public class MainActivity extends AppCompatActivity {

    private BibDatabase database;
    private ArrayList<BibType> bibData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        initialize();

        database.getCfg().maxValid = 105L;
        long size = database.getCfg().maxValid;
        for (int i = 0; i < size; i++) {
            try {
                BibEntry entry = database.getEntry(i);
                Types type = entry.getType();
                switch (type) {
                    case ARTICLE:
                        bibData.add(
                                new Article(entry.getField(Keys.AUTHOR), entry.getField(Keys.TITLE),
                                        entry.getField(Keys.JOURNAL), entry.getField(Keys.YEAR))
                        );
                        break;
                    case BOOK:
                        bibData.add(
                                new Book(entry.getField(Keys.AUTHOR), entry.getField(Keys.TITLE),
                                        entry.getField(Keys.PUBLISHER), entry.getField(Keys.YEAR))
                        );
                        break;
                    case INCOLLECTION:
                        bibData.add(
                                new Incollection(entry.getField(Keys.AUTHOR), entry.getField(Keys.TITLE),
                                        entry.getField(Keys.BOOKTITLE), entry.getField(Keys.PUBLISHER),
                                        entry.getField(Keys.YEAR))
                        );
                        break;
                    case INPROCEEDINGS:
                        bibData.add(
                                new Inproceedings(entry.getField(Keys.AUTHOR), entry.getField(Keys.TITLE),
                                        entry.getField(Keys.BOOKTITLE), entry.getField(Keys.YEAR))
                        );
                        break;
                    case MISC:
                        bibData.add(
                                new Misc(entry.getField(Keys.AUTHOR), entry.getField(Keys.TITLE),
                                        entry.getField(Keys.YEAR))
                        );
                        break;
                    case TECHREPORT:
                        bibData.add(
                                new Techreport(entry.getField(Keys.AUTHOR), entry.getField(Keys.TITLE),
                                        entry.getField(Keys.PUBLISHER), entry.getField(Keys.YEAR))
                        );
                        break;
                    case UNPUBLISHED:
                        bibData.add(
                                new Unpublished(entry.getField(Keys.AUTHOR), entry.getField(Keys.TITLE),
                                        entry.getField(Keys.YEAR))
                        );
                        break;
                    case EDITORIAL:
                        bibData.add(
                                new Editorial(entry.getField(Keys.AUTHOR), entry.getField(Keys.TITLE),
                                        entry.getField(Keys.PAGES), entry.getField(Keys.YEAR))
                        );
                        break;
                    case SOFTWARE:
                        bibData.add(
                                new Software(entry.getField(Keys.AUTHOR), entry.getField(Keys.TITLE),
                                        entry.getField(Keys.TECH), entry.getField(Keys.YEAR))
                        );
                        break;
                }
            } catch (NullPointerException ex) {
                break;
            }
        }
        LinearLayoutManager recyclerLayoutManager = new LinearLayoutManager(this);
        MyAdapter adapter = new MyAdapter(bibData);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(
                recyclerView.getContext(),
                recyclerLayoutManager.getOrientation()
        );
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(recyclerLayoutManager);
        recyclerView.addItemDecoration(dividerItemDecoration);
    }

    private void initialize() {
        try {
            database = new BibDatabase(new InputStreamReader(getResources()
                    .openRawResource(R.raw.articles)));
        } catch (IOException ex) {
            System.out.println("Error");
        }
    }
}