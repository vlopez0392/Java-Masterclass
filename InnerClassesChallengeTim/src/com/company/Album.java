package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private SongList songList;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songList = new SongList();
    }

    //Add a song to the album
    public boolean addSong(String title, double duration) {
        return this.songList.add(new Song(title, duration));
    }

    //Add a song to the playlist
    //Add by trackNumber
    public boolean addToPlayList(int trackNumber, List<Song> playlist) {
        Song checkedSong = this.songList.findSong(trackNumber);
        if(checkedSong !=null){
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    //Add by title
    public boolean addToPlayList(String title, List<Song> playList) {
        Song checkedSong = this.songList.findSong(title);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

    //Inner class songList
    private class SongList{
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

        public boolean add(Song song){
            if(songs.contains(song)){
                return false;
            }

            this.songs.add(song);
            return true;
        }

        //Find a song
        private Song findSong(String title) {
            for (Song checkedSong : this.songs) {
                if (checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }

        public Song findSong(int trackNumber){
            int index = trackNumber -1;
            if((index>=0) && (index < songs.size())){
                return songs.get(index);
            }
            return null;
        }
    }
}