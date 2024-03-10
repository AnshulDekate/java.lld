package com.example.demo.models;

import lombok.ToString;

import java.util.ArrayList;

@ToString
public class Library {
    public String location;
    public ArrayList<Rack> racks;

    public Library(String location, int numOfRacks){
        this.racks = new ArrayList<>();
        for (int i=0; i<numOfRacks; i++){
            Rack rack = new Rack();
            this.racks.add(rack);
        }
        this.location = location;
    }

}
