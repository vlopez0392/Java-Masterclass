package com.company;

public class Main {

    public static void main(String[] args) {
	    Player player = new Player(); //Default constructor

        // player.name = "Vick"; -> Any time we change a field name we must also make the change here.
                               //-> For big applications and commercial code this might be a problem.
                               //-> We may also forget to initialize the fields externally ->Better to use a constructor
                               //-> We can validate the data with the constructor.

                               //Providing manual access to fields does not guarantee that the input data will be valid.
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = "+ player.healthRemaining());

        damage = 11;
        //Problem -> We can take control of the player class externally.
        player.health = 200;    //We don't want external classes to control the player health.

        player.loseHealth(damage);
        System.out.println("Remaining health = "+ player.healthRemaining());
    }
}
