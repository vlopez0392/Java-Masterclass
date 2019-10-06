package com.company;

public class Song {

    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    // We are going to override the toString() method to output any useful information about our object in String
    // representation.

    //Quick way to output the contents of an object. toString() is a part of the Java infrastructure for all objects.
    //toString() is amethod of the Object class -> Every object inherits it.

    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }
}

