package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Album {
    // The program will have an Album class containing a list of songs.
    //Fields
    private String albumTitle;
    private SongList albumSongs;

    //Constructor
    public Album(String albumTitle) {
        this.albumTitle = albumTitle;
        this.albumSongs = new SongList();

    }

    //Getters
    public String getAlbumTitle() {
        return albumTitle;
    }

    //Display Songs
    public void displaySongs(ArrayList<Song> songs){
        if(songs.isEmpty()){
            System.out.println("No songs in your playlist.");
        }else{
            for(Song song: songs){
                System.out.println("=============================");
                System.out.println("SONG NAME: " + song.getTitle() +
                        " | " + "DURATION: " + song.getDuration());
                System.out.println("=============================");
            }
        }
    }

    public ArrayList<Song> getAlbumSongs(){
        return this.albumSongs.getSongsFromSongList();
    }

    public void addSong(String song, String duration){
        this.albumSongs.addSong(song, duration);
    }

    private String toLowerCase(String string){
        return string.toLowerCase();
    }

    // Modify the playlist challenge so that the Album class uses an inner class.
    // Instead of using an ArrayList to hold its tracks, it will use an inner class called SongList
    // The inner SongList class will use an ArrayList and will provide a method to add a song.
    // It will also provide findSong() methods which will be used by the containing Album class
    // to add songs to the playlist.
    // Neither the Song class or the Main class should be changed.

    private class SongList{
        private ArrayList<Song> songArrayList;

        //Constructor
        public SongList() {
            this.songArrayList = new ArrayList<>();
        }

        //Add song
        public void addSong(String songName, String duration){
            if(findSong(songName)){
                System.out.println("That song is already part of your album");
            }else{
                System.out.println("Adding song: " + songName + " to album: " + albumTitle);
                this.songArrayList.add(new Song(songName, duration));
            }
        }

        //Find a song, if song has same name do NOT add to the album regardless of duration!
        private boolean findSong(String songName){
            Iterator<Song> songIterator = this.songArrayList.iterator();

            while(songIterator.hasNext()){
                String name = songIterator.next().getTitle().toLowerCase();

                if(toLowerCase(songName).equals(name)){
                    return true;
                }
            }
            return false;
        }

        public ArrayList<Song> getSongsFromSongList(){
            return this.songArrayList;
        }
    }
}
