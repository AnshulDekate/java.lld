package com.example.demo.models;

import lombok.ToString;

import java.util.HashSet;

@ToString
public class Rack {
    public HashSet<BookItem> bookItems;
    public Rack(){
        this.bookItems = new HashSet<>();
    }

}
