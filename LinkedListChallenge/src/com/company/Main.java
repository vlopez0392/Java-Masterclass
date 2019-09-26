package com.company;

public class Main {

    public static void main(String[] args) {

        Album scarface = new Album("Scarface");
        Album frenship = new Album("Frenship");
        Album goWest   = new Album("Go West");

        PlayList playlist = new PlayList("My Playlist");
        playlist.addAlbum(scarface);
        playlist.addAlbum(frenship);
        playlist.addAlbum(goWest);

        playlist.selectAlbum();
    }
}
