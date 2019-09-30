package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // In Main, write a method that takes an object that implements the interface as a parameter and
        // "saves" the values e.g. calls the method defined in the interface.

        //Read values and write fields of a player
        ISaveable player = new Player();
        ArrayList<String> playerValues = player.readValues();
        player.populateFields(playerValues);

        System.out.println(player.toString());

        //Read values and write fields of a player
        ISaveable monster = new Monster();
        ArrayList<String> monsterValues = monster.readValues();
        monster.populateFields(monsterValues);

        System.out.println(monster.toString());

    }
}
