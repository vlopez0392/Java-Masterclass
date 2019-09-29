package com.company;

import java.util.ArrayList;

public class Monster implements ISaveable {
    // Create a few sample classes that implement your Saveable interface (we've used the idea of a game,
    // with Players and Monsters, but you can create any type of classes that you want).

    //Fields
    private String monsterType = "Zombie Soldier";
    private String mainAttack = "punch";
    private int health = 500;

    @Override
    public ArrayList<String> readValues() {
        return null;
    }

    @Override
    public void populateFields(ArrayList<String> objectValues) {

    }

    @Override
    public ArrayList<String> getFieldNames(){
        return null;
    }
    // Override the toString() method for each of your classes so that they can be easily printed to enable
    // the program to be tested easier.
}
