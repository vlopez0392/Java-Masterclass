package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Player Vick = new Player("Vick", 10 ,15);
        System.out.println(Vick);
        saveObject(Vick);

        Vick.setHitPoints(8);
        Vick.setWeapon("Axe");
        System.out.println(Vick);
        saveObject(Vick);
//        loadObject(Vick);
        System.out.println(Vick);

        //Monster
        ISaveable werewolf = new Monster("Werewolf", 20, 40);
        System.out.println(werewolf);
        saveObject(werewolf);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    //Accepts any type of class that implements the ISaveable interface
    public static void saveObject(ISaveable objectToSave){
        for(int i=0; i<objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) +" to storage device");
        }
    }

    private static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(readValues());
    }
}
