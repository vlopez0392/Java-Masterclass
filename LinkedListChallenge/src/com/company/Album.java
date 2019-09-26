package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Album {

    // The program will have an Album class containing a list of songs.
    //Fields
    private String albumTitle;
    private ArrayList<Song> albumSongs;

    //Constructor
    public Album(String albumTitle) {
        this.albumTitle = albumTitle;
        this.albumSongs = new ArrayList<>();
    }

    //Getters
    public String getAlbumTitle() {
        return albumTitle;
    }

    public ArrayList<Song> getAlbumSongs() {
        return albumSongs;
    }

    /////Functionality
    //Add song
    public void addSong(String songName, String duration){
        if(findSong(songName)){
            System.out.println("That song is already part of your album");
        }else{
            System.out.println("Adding song: " + songName + " to album: " + this.albumTitle);
            this.albumSongs.add(new Song(songName, duration));
        }
    }

    //Find a song, if song has same name do NOT add to the album regardless of duration!
    private boolean findSong(String songName){
        Iterator<Song> songIterator = this.albumSongs.iterator();

        while(songIterator.hasNext()){
            String name = songIterator.next().getTitle().toLowerCase();

            if(toLowerCase(songName).equals(name)){
                return true;
            }
        }
        return false;
    }

    private String toLowerCase(String string){
        return string.toLowerCase();
    }
}
