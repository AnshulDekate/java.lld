package com.example.demo.models;

import lombok.ToString;

import java.time.LocalDate;

@ToString(exclude = "rack")
public class BookItem {
    public Book info;
    public String barcode;
    public boolean borrowed;
    public Rack rack;
    public LocalDate dueDate;

    public BookItem(Book book, String barcode){
        this.info = book;
        this.barcode = barcode;
    }
}
