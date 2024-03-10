package com.example.demo.models;

import lombok.ToString;

import java.time.LocalDate;
import java.util.HashSet;

@ToString
public class User {
    public int id;
    public String name;
    public HashSet<BookItem> bookItems;

    public User(int id, String name ){
        this.id = id;
        this.name = name;
        this.bookItems = new HashSet<>();
    }
    public void borrowBook(BookItem b){
        this.bookItems.add(b);
        b.borrowed = true;
        b.dueDate = LocalDate.now().plusDays(10);
    }

    public void returnBook(BookItem b){
        this.bookItems.remove(b);
        b.borrowed = false;
        b.dueDate = null;
    }

}
