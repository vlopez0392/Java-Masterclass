package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    //Add a song to the album
    public boolean addSong(String title, double duration){
        if(findSong(title) == null){
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    //Find a song
    private Song findSong(String title){
        for(Song checkedSong: this.songs){  // For-each loop -> No need for explicit indexed loop control -> Easier to read
                                            // Java will probably execute the usual code internally
                                            // Java will create the checkedSong variable and assign it to every entry in the songs arrayList.
            if(checkedSong.getTitle().equals(title)){
                return checkedSong;
            }
        }
        return null;
    }

    //Add a song to the playlist

    //Add by trackNumber
    public boolean addToPlayList(int trackNumber, List<Song> playlist){
        int index = trackNumber -1;
        if(index >= 0 && index <=this.songs.size()){
            playlist.add(this.songs.get(index));
            return true;
        }

        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    //Add by title
    public boolean addToPlayList(String title, List<Song> playList){
        Song checkedSong = findSong(title);
        if(checkedSong != null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

    //Interfaces annotation:
    // -> We can change the LinkedList<Song> parameter to a List<Song> parameter.
    // -> Java implements interfaces extensively and thus this changes are allowed.
    // -> Recall that classes that implement an interface may be instantiated even if they point to an interface reference variable.

    //Interfaces make your code more flexible. -> Declaring a List reference variable allows you to instantiate either an
    //ArrayList or a LinkedList

}
