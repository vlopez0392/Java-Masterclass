package com.company;

public class EnhancedPlayer { //A properly encapsulated Class

    //Encapsulation -> Fields of our Class are not accessible to outside classes
    private String name;
    private int hitPoints = 100; //If validation fails, assign a default health value of 100
    private String weapon;

    public EnhancedPlayer(String name, int hitPoints, String weapon) {
        this.name = name;
        this.hitPoints = hitPoints;

        if(hitPoints > 0 && hitPoints <= 100){  //Validation -> Accepts only values for the health field varying from 0 to 100
            this.hitPoints = hitPoints;
        }
        this.weapon = weapon;
    }

    //Manages the process of player losing health through this component.
    public void loseHealth(int damage){
        this.hitPoints = this.hitPoints - damage;

        if(this.hitPoints <= 0){
            System.out.println("Player knocked out");
            //Reduce number of lives remaining for the player
        }
    }

    //Notice that internal naming of the field is not required outside of this class. The getter is still called getHealth();
    public int getHealth(){
        return this.hitPoints;
    }
}
