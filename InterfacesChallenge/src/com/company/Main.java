package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // In Main, write a method that takes an object that implements the interface as a parameter and
        // "saves" the values e.g. calls the method defined in the interface.

        Player player = new Player();
        ArrayList<String> playerValues = player.readValues();
        player.populateFields(playerValues);
        System.out.println(player.toString());
    }
}
