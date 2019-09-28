package com.company;

import java.util.*;

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
    private LinkedList<Song> playlist;

    //Constructor
    public PlayList(String playListName) {
        this.playListName = playListName;
        this.albums = new ArrayList<>();
        this.playlist = new LinkedList<>();
    }

    //Getters
    public String getPlayListName() {
        return playListName;
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public LinkedList<Song> getPlaylist() {
        return playlist;
    }

    //Add Album
    public void addAlbum(Album album){
        if(findAlbum(album.getAlbumTitle())){
            System.out.println("That album is already part of your library");
        }else{
            System.out.println("Adding album: " + album.getAlbumTitle() + " to your library");
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

    //Choose albums
    public Album selectAlbum(boolean first){  //Select album to choose songs from!
        if(this.albums.isEmpty()){
            System.out.println("No albums to browse from!");
            return null;
        }

        boolean continueBrowsing = true;
        ListIterator<Album> albumListIterator = this.albums.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean goingForward = true;

        printOptions();
        while(continueBrowsing){
            System.out.println("Enter choice: ");
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
                            System.out.println("Album #" + (albumListIterator.nextIndex()+1) + ": "
                                    + albumListIterator.next().getAlbumTitle() + "\n");
                        }else{
                            System.out.println("No more albums here, reached the end of your library. \n");
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
                            System.out.println("Album #" + (albumListIterator.previousIndex()+1) + ": "
                                    + albumListIterator.previous().getAlbumTitle() + " \n");
                        }else{
                            System.out.println("Reached the beginning of your album library. \n");
                            goingForward = true;
                        }
                        break;

                    case 3:
                        Album decision ;
                        if(goingForward){
                            if(albumListIterator.hasPrevious()){
                                decision = albumListIterator.previous();
                            }else{
                                decision = albumListIterator.next();
                            }
                        }else{
                            if(albumListIterator.hasNext()){
                                decision = albumListIterator.next();
                            }else{
                                decision = albumListIterator.previous();
                            }
                        }
                        System.out.println("You have chosen : " + decision.getAlbumTitle() + " to build your playlist. \n");
                        return decision;

                    case 4:
                        printOptions();
                        break;

                    case 5:
                        System.out.println("You didn't choose your album! Please try again next time :) \n");
                        if(first){
                            Album defaultAlbum = this.albums.get(0);
                            System.out.println("Choosing first album in your library as default: " + defaultAlbum.getAlbumTitle());
                            return defaultAlbum;
                        }

                        return null;

                    default:
                        System.out.println("Unknown input, please input a valid option. ");
                        printOptions();
                        break;
                }
            }else{
                System.out.println("Wrong input! Please try again! ");
                scanner.nextLine();
                printOptions();
            }
        }
        scanner.close();
        return null;
    }

    public boolean playerMode(LinkedList<Song> playListSongs){   //Player mode -> Tracker for songs

        if(playListSongs.isEmpty()) {
            System.out.println("No songs in this playlist.");
            return false;
        }
            boolean continueBrowsing = true;
            ListIterator<Song> songListIterator = playListSongs.listIterator();
            
            Scanner scanner = new Scanner(System.in);
            boolean goingForward = true;

            printPlayerOptions();
            
            while(continueBrowsing){
                System.out.println("Enter choice: ");
                boolean isAnInt = scanner.hasNextInt();

                if(isAnInt){
                    int option = scanner.nextInt();
                    scanner.nextLine();

                    switch(option){
                        case 1:
                            if(!goingForward){
                                if(songListIterator.hasNext()){
                                    songListIterator.next();
                                }
                                goingForward = true;
                            }

                            if(songListIterator.hasNext()){
                                System.out.println("Now playing song #: " + (songListIterator.nextIndex()+1) + ": "
                                        + songListIterator.next().getTitle() + "\n");
                            }else{
                                System.out.println("No more albums here, reached the end of your playlist. \n");
                                goingForward = false;
                            }
                            break;

                        case 2:
                            if(goingForward){
                                if(songListIterator.hasPrevious()){
                                    songListIterator.previous();
                                }
                                goingForward = false;
                            }

                            if(songListIterator.hasPrevious()){
                                System.out.println("Now playing song #: " + (songListIterator.previousIndex()+1) + ": "
                                        + songListIterator.previous().getTitle() + " \n");
                            }else{
                                System.out.println("Reached the beginning of your playlist. \n");
                                goingForward = true;
                            }
                            break;

                        case 3:
                            Song decision ;
                            if(goingForward){
                                if(songListIterator.hasPrevious()){
                                    decision = songListIterator.previous();
                                }else{
                                    decision = songListIterator.next();
                                }
                                goingForward = false;
                            }else{
                                if(songListIterator.hasNext()){
                                    decision = songListIterator.next();
                                }else{
                                    decision = songListIterator.previous();
                                }
                                goingForward = true;
                            }
                            System.out.println("Now playing in replay: " + decision.getTitle() + "\n");
                            break;

                        case 4:
                            printPlayerOptions();
                            break;

                        case 5:
                            System.out.println("Exiting player, see you next time! :) \n");
                            return true;

                        default:
                            System.out.println("Unknown input, please input a valid option ");
                            printPlayerOptions();
                            break;
                    }
                }else{
                    System.out.println("Wrong input! Please try again! ");
                    scanner.nextLine();
                    printPlayerOptions();
                }
            }

            return false;
    }

    //Print songs
    public void displaySongs(LinkedList<Song> songs){
        if(songs.isEmpty()){
            System.out.println("No songs in your playlist.");
        }else{
            System.out.println("=============================");
            for(Song song: songs){
                System.out.println("SONG NAME: " + song.getTitle() +
                        " | " + "DURATION: " + song.getDuration());
            }
            System.out.println("=============================");
        }
    }

    //Find Song
    public boolean findSong(String songName, LinkedList<Song> playlist){
        songName = songName.toLowerCase();

        for(Song song: playlist){
            if(songName.equals(song.getTitle().toLowerCase())){
                return true;
            }
        }
        return false;
    }

    //Get Song
    public int findSongByIndex(String songName, LinkedList<Song> playlist){
        songName = songName.toLowerCase();
        String currentSongTitle;

        for(int i = 0 ; i<playlist.size(); i++){
                currentSongTitle = playlist.get(i).getTitle();

                if(toLowerCase(currentSongTitle).equals(toLowerCase(songName))){
                    return i;
                }
            }
        return -1;
    }

    private void printPlayerOptions(){
        System.out.println("Press to: ");
        System.out.println("1 - Play next song ");
        System.out.println("2 - Play the previous song ");
        System.out.println("3 - Repeat the song ");
        System.out.println("4 - Print the options ");
        System.out.println("5 - To go back to edit mode \n");
    }

    private void printOptions(){
        System.out.println("Press to: ");
        System.out.println("1 - Go to the next album ");
        System.out.println("2 - Go to the previous album ");
        System.out.println("3 - Select the current album ");
        System.out.println("4 - Print the options ");
        System.out.println("5 - To quit \n");
    }

    private String toLowerCase(String string){
        return string.toLowerCase();
    }
}
