package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Player implements ISaveable{
    // Create a few sample classes that implement your Saveable interface (we've used the idea of a game,
    // with Players and Monsters, but you can create any type of classes that you want).

    //Fields
    private String playerName = "Unnamed";
    private int level = 1;
    private int health = 100;
    private int magicPower = 100;
    private String weapon = "None";
    private String armorType = "No armor";

    //No constructor in this implementation. We read and write the values

    //Getters
    public String getPlayerName() {
        return playerName;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public String getWeapon() {
        return weapon;
    }

    public String getArmorType() {
        return armorType;
    }

    @Override
    public ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();
        ArrayList<String> fieldNames = getFieldNames();
        Scanner scanner = new Scanner(System.in);

        int repeatLoop = fieldNames.size();
        int counter = 0;

        while(counter < repeatLoop){
            System.out.println("Please enter " + fieldNames.get(counter));
            String valueToSave = scanner.nextLine();
            values.add(valueToSave);

            counter++;
        }
        return values;
    }

    @Override
    public void populateFields(ArrayList<String> objectValues) {
        if(!objectValues.isEmpty()){
            this.playerName = objectValues.get(0);
            this.level =      Integer.parseInt(objectValues.get(1));
            this.health =     Integer.parseInt(objectValues.get(2));
            this.magicPower = Integer.parseInt(objectValues.get(3));
            this.weapon =     objectValues.get(4);
            this.armorType =  objectValues.get(5);
        }else{
            System.out.println("Failed to load your object values");
        }
    }

    @Override
    public ArrayList<String> getFieldNames(){
        ArrayList<String> fieldNames = new ArrayList<>();
        fieldNames.add(" Player Name: ");
        fieldNames.add(" Level: ");
        fieldNames.add(" Health: ");
        fieldNames.add(" Magic Power: ");
        fieldNames.add(" Weapon: ");
        fieldNames.add(" Armor Type: ");
        return fieldNames;
    }

    // Override the toString() method for each of your classes so that they can be easily printed to enable
    // the program to be tested easier.
    public String toString(){
        return "Player name: " + this.playerName + " Health: " + this.health + " Magic Power: " + this.magicPower +
               " Weapon: " + this.weapon + " Armor Type: " + this.armorType;
    }
}
