package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(PlayingCat.isCatPlaying(true, 42));  //Cat Playing
        System.out.println(PlayingCat.isCatPlaying(false, 25)); //Cat Playing
        System.out.println(PlayingCat.isCatPlaying(true, 46));  //Cat NOT playing - Not in range
    }
}
