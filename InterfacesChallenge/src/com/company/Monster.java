package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Monster implements ISaveable {
    // Create a few sample classes that implement your Saveable interface (we've used the idea of a game,
    // with Players and Monsters, but you can create any type of classes that you want).

    //Fields
    private String monsterType = "Zombie Soldier";
    private String mainAttack = "punch";
    private int healthPoints = 500;
    private String defenseLevel = "Low";
    private String speedLevel= "Slow";

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
            this.monsterType =  objectValues.get(0);
            this.mainAttack =   objectValues.get(1);
            this.healthPoints = Integer.parseInt(objectValues.get(2));
            this.defenseLevel = objectValues.get(3);
            this.speedLevel =   objectValues.get(4);
        }else{
            System.out.println("Failed to load your object values");
        }
    }

    @Override
    public ArrayList<String> getFieldNames(){
        ArrayList<String> fieldNames = new ArrayList<>();
        fieldNames.add(" Monster Type: ");
        fieldNames.add(" Main Attack: ");
        fieldNames.add(" Health: ");
        fieldNames.add(" Defense Level: ");
        fieldNames.add(" Speed Level: ");
        return fieldNames;
    }
    // Override the toString() method for each of your classes so that they can be easily printed to enable
    // the program to be tested easier.
    public String toString(){
        return "Monster Type: " + this.monsterType + " Main Attack: " + this.mainAttack + " Health: " + this.healthPoints
                + " Defense Points: " + this.defenseLevel + " Speed Level: " + this.speedLevel;
    }

}
