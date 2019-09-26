package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class PlayList {
    // Songs from different albums can be added to the playlist and will appear in the list in the order
    // they are added.
    // Once the songs have been added to the playlist, create a menu of options to:-
    // Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
    // List the songs in the playlist
    // A song must exist in an album before it can be added to the playlist (so you can only play songs that
    // you own).
    // Hint:  To replay a song, consider what happened when we went back and forth from a city before we
    // started tracking the direction we were going.
    // As an optional extra, provide an option to remove the current song from the playlist
    // (hint: listiterator.remove()

    //Fields
    private String playListName;
    private ArrayList<Album> albums;

    //Constructor
    public PlayList(String playListName) {
        this.playListName = playListName;
        this.albums = new ArrayList<>();
    }

    //Getters
    public String getPlayListName() {
        return playListName;
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    //Add Album
    public void addAlbum(Album album){
        if(findAlbum(album.getAlbumTitle())){
            System.out.println("That album is already part of your library");
        }else{
            System.out.println("Adding album: " + album.getAlbumTitle());
            this.albums.add(album);
        }
    }

    //Find a song, if song has same name do NOT add to the album regardless of duration!
    private boolean findAlbum(String albumName){
        Iterator<Album> albumIterator = this.albums.iterator();

        while(albumIterator.hasNext()){
            String name = albumIterator.next().getAlbumTitle().toLowerCase();

            if(toLowerCase(albumName).equals(name)){
                return true;
            }
        }
        return false;
    }

    private String toLowerCase(String string){
        return string.toLowerCase();
    }

    //Choose albums
    public Album selectAlbum(){
        if(this.albums.isEmpty()){
            System.out.println("No albums to browse from!");
            return null;
        }

        boolean continueBrowsing = true;
        ListIterator<Album> albumListIterator = this.albums.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean goingForward = true;

        while(continueBrowsing){
            printOptions();
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int option = scanner.nextInt();
                scanner.nextLine();

                switch(option){
                    case 1:
                        if(!goingForward){
                            if(albumListIterator.hasNext()){
                                albumListIterator.next();
                            }
                            goingForward = true;
                        }

                        if(albumListIterator.hasNext()){
                            System.out.println("Album #" + albumListIterator.nextIndex() + ": "
                                    + albumListIterator.next().getAlbumTitle());
                        }else{
                            System.out.println("No more albums here, reached the end of your library");
                            goingForward = false;
                        }
                        break;

                    case 2:
                        if(goingForward){
                            if(albumListIterator.hasPrevious()){
                                albumListIterator.previous();
                            }
                            goingForward = false;
                        }

                        if(albumListIterator.hasPrevious()){
                            System.out.println("Album #" + albumListIterator.previousIndex() + ": "
                                    + albumListIterator.previous().getAlbumTitle());
                        }else{
                            System.out.println("Reached the beginning of your album library!");
                            goingForward = true;
                        }
                        break;

                    case 3:
                        Album decision;
                        if(goingForward){
                            decision = albumListIterator.previous();
                        }else{
                            decision = albumListIterator.next();
                        }

                        System.out.println("You have chosen : " + decision.getAlbumTitle() + " to build your playlist! ");
                        return decision;

                    case 4:
                        System.out.println("You didn't choose your album! Please try again next time :) ");
                        continueBrowsing = false;
                        break;
                    default:
                        System.out.println("Unknown input ");
                        break;
                }
            }else{
                System.out.println("Wrong input! Please try again! ");
            }
        }
        return null;
    }

    private void printOptions(){
        System.out.println("Press to: ");
        System.out.println("1 - Go to the next album ");
        System.out.println("2 - Go to the previous album ");
        System.out.println("3 - Select the current album ");
        System.out.println("4 - To quit \n");
    }
}
