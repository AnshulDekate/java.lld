package com.example.demo.models;

public class Librarian {
    public String name;
    public Library library;

    public Librarian(String name, Library library){
        this.name = name;
        this.library = library;
    }
    public void addBookItem(BookItem bookItem){
        for (Rack rack: this.library.racks){
            if (rack.bookItems.contains(bookItem)) continue;
            else {
                rack.bookItems.add(bookItem);
                bookItem.rack = rack;
                break;
            }
        }
    }
}
