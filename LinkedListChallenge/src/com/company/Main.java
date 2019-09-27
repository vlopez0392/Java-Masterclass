package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Album Scarface = new Album("Scarface");
        Scarface.addSong("Que Le Paso", "2:45");
        Scarface.addSong("Planet Rock", "5:19");

        Album Frenship = new Album("FRENSHIP");
        Frenship.addSong("1000 nights", "4:00");
        Frenship.addSong("Capsize", "3:57");

        Album GoWest   = new Album("Go West");
        GoWest.addSong("One Way Street" , "4:36");
        GoWest.addSong("Call me", "4:09");


        PlayList playlist = new PlayList("My Playlist");
        playlist.addAlbum(Scarface);
        playlist.addAlbum(Frenship);
        playlist.addAlbum(GoWest);

        System.out.println();
        buildPlaylist(playlist);
    }

    private static void buildPlaylist(PlayList playList){ //Builds the playlists
        Scanner scanner = new Scanner(System.in);

        System.out.println("Building your playlist now! First, let's browse your albums and choose some songs: ");
        Album currentAlbum = playList.selectAlbum(true);

        ArrayList<Song> currentSongs = currentAlbum.getAlbumSongs();
        ListIterator<Song> songListIterator = currentSongs.listIterator();

        Song currentSong;
        LinkedList<Song> myPlaylist = playList.getPlaylist();

        boolean continueBuilding = true;
        boolean goingForward = true;
        boolean firstPass = true;

        printOptions();
        System.out.println("Enter choice: ");
        boolean isAnInt = scanner.hasNextInt();

        while(continueBuilding) {
            if (isAnInt) {
                if(firstPass){
                    firstPass = false;
                }else{
                    System.out.println("Enter choice: ");
                }

                int option = scanner.nextInt();
                scanner.nextLine();

                switch (option) {
                    case 1:
                        System.out.println("Now browsing your albums: ");
                        Album newAlbum = playList.selectAlbum(false);

                        if (newAlbum != null) {
                            currentAlbum = newAlbum;
                            currentSongs = newAlbum.getAlbumSongs();
                            songListIterator = currentSongs.listIterator();
                        }
                        printOptions();
                        break;
                    case 2:
                        System.out.println("Printing songs in: " + currentAlbum.getAlbumTitle());
                        currentAlbum.displaySongs(currentSongs);
                        System.out.println();
                        printOptions();
                        break;

                    case 3:
                        if (!goingForward) {
                            if (songListIterator.hasNext()) {
                                songListIterator.next();
                            }
                            goingForward = true;
                        }

                        if (songListIterator.hasNext()) {
                            currentSong = songListIterator.next();
                            System.out.println("Current song: " + currentSong.getTitle() + " Duration: " + currentSong.getDuration());

                        } else {
                            System.out.println("Reached the end of the list. ");
                            goingForward = false;
                        }
                        break;

                    case 4:
                        if (goingForward) {
                            if (songListIterator.hasPrevious()) {
                                songListIterator.previous();
                            }
                            goingForward = false;
                        }

                        if (songListIterator.hasPrevious()) {
                            currentSong = songListIterator.previous();
                            System.out.println("Current song: " + currentSong.getTitle() + " Duration: " + currentSong.getDuration());

                        } else {
                            System.out.println("Reached the beginning of the list! ");
                            goingForward = true;
                        }

                        break;
                    case 5:
                        if (goingForward) {
                            if (songListIterator.hasPrevious()) {
                                currentSong = songListIterator.previous();
                            } else {
                                currentSong = songListIterator.next();
                            }
                            goingForward = false;
                        } else {
                            if (songListIterator.hasNext()) {
                                currentSong = songListIterator.next();
                            } else {
                                currentSong = songListIterator.previous();
                            }
                            goingForward = true;
                        }
                        if (myPlaylist.contains(currentSong)) {
                            System.out.println("Song is already in playlist! ");
                        } else {
                            System.out.println("Successfully added " + currentSong.getTitle() + " to your playlist! \n");
                            myPlaylist.add(currentSong);
                        }
                        printOptions();
                        break;

                    case 6:
                        playList.displaySongs(myPlaylist);

                        if(!myPlaylist.isEmpty()){
                            System.out.println("Enter the name of the song you want to remove: ");
                            String songName = scanner.nextLine();

                            if(playList.findSong(songName, myPlaylist)){
                                int remove = playList.findSongByIndex(songName, myPlaylist);

                                System.out.println("Successfully removed " + myPlaylist.get(remove).getTitle() + " From your playlist! \n");
                                myPlaylist.remove(remove);

                            }else{
                                System.out.println("The song: " + songName +" is not in your playlist. ");
                            }
                        }
                        break;

                    case 7:
                        System.out.println("Now printing the songs in your playlist:");
                        playList.displaySongs(myPlaylist);
                        break;

                    case 8:
                        System.out.println("Entering player mode... ");
                        if(playList.playerMode(myPlaylist)){
                            System.out.println("Back to edit mode... \n" );
                        }else{
                            System.out.println("Please add some songs to your playlist.\n");
                        }
                        printOptions();
                        break;
                    case 9:
                        printOptions();
                        break;
                    case 10:
                        System.out.println("PlayList building done... ");
                        continueBuilding = false;
                        break;
                    default:
                        System.out.println("Unknown input ");
                        break;
                }
            } else {
                System.out.println("Wrong input. Please try again! ");
            }
        }
        scanner.close();
    }

    private static void printOptions(){
        System.out.println("Press to: ");
        System.out.println("1 - Browse your albums");
        System.out.println("2 - Print the songs in the current album ");
        System.out.println("3 - Go to the next song");
        System.out.println("4 - Go to the previous song ");
        System.out.println("5 - Add the current song to the playlist");
        System.out.println("6 - Remove the current song from the playlist");
        System.out.println("7 - Print the current songs in your playlist");
        System.out.println("8 - Enter Player mode");
        System.out.println("9 - Print the options ");
        System.out.println("10 - To quit \n");
    }
}
