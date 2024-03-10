package com.example.demo.models;

import java.util.ArrayList;
import java.util.HashMap;

public class Search {
    public Library library;
    public HashMap<String, ArrayList<BookItem>> byISBN;
    public HashMap<String, ArrayList<BookItem>> byTitle;
    public HashMap<String, ArrayList<BookItem>> byAuthor;
    public HashMap<String, ArrayList<BookItem>> byPublisher;



    public Search (Library library){
        this.library = library;
        this.byISBN = new HashMap<>();
        this.byTitle = new HashMap<>();
        this.byAuthor = new HashMap<>();
        this.byPublisher = new HashMap<>();

        for (Rack rack: this.library.racks){
            for (BookItem bookItem: rack.bookItems){
                if (!this.byISBN.containsKey(bookItem.info.ISBN)){
                    this.byISBN.put(bookItem.info.ISBN, new ArrayList<>());
                }
                if (!this.byTitle.containsKey(bookItem.info.title)){
                    this.byTitle.put(bookItem.info.title, new ArrayList<>());
                }
                if (!this.byAuthor.containsKey(bookItem.info.author)){
                    this.byAuthor.put(bookItem.info.author, new ArrayList<>());
                }
                if (!this.byPublisher.containsKey(bookItem.info.publisher)){
                    this.byPublisher.put(bookItem.info.publisher, new ArrayList<>());
                }
                this.byISBN.get(bookItem.info.ISBN).add(bookItem);
                this.byTitle.get(bookItem.info.title).add(bookItem);
                this.byAuthor.get(bookItem.info.author).add(bookItem);
                this.byPublisher.get(bookItem.info.publisher).add(bookItem);
            }
        }

    }

}
