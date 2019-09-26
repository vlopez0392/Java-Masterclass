package com.company;

public class Song {

    // Create a Song class having Title and Duration for a song.
    //Fields
    private String Title;
    private String duration;

    //Constructor
    public Song(String title, String duration) {
        Title = title;
        this.duration = duration;
    }

    //Getters
    public String getTitle() {
        return Title;
    }

    public String getDuration() {
        return duration;
    }
}
