package com.company;

public class Song {

    // Create a Song class having Title and Duration for a song.
    //Fields
    private String title;
    private String duration;

    //Constructor
    public Song(String title, String duration) {
        this.title = title;
        this.duration = duration;
    }

    //Getters
    public String getTitle() {
        return title;
    }

    public String getDuration() {
        return duration;
    }
}
