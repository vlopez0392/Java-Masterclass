package com.company;

public class Player { //Models a player in a computer

    public String fullName;     //These fields are NOT encapsulated within the Player Class
    public int health;
    public String weapon;

    public void loseHealth(int damage){     //Manages the process of player losing health through this component.
        this.health = this.health - damage;

        if(this.health <= 0){
            System.out.println("Player knocked out");
            //Reduce number of lives remaining for the player
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}
