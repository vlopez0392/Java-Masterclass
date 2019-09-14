package com.company;

class Movie{
    private String name;

    public Movie(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String plot(){
        return "No plot here";
    }
}

//We are going to create 5 additional classes which are going to inherit from this base class
class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay(){
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over Planet Earth";
    }
}

class MazeRunner extends Movie{
    public MazeRunner(){
        super("MazeRunner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

class StarWars extends Movie{
    public StarWars(){
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe";
    }
}

class ForgettableMovie extends Movie{
    public ForgettableMovie(){
        super("Forgettable movie"); //We will demonstrate the use of polymorphism by NOT overriding the plot method
    }
}

public class Main {

    public static void main(String[] args) {
        for(int i=1; i<11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " :" + movie.getName() + "\n"
                                             + "Plot: "+ movie.plot() + "\n"); //This line shows how polymorphism works.
                                                                               //We obtain the functionality based on the
                                                                               //object we created.

        }
    }

    public static Movie randomMovie(){                   //Its purpose is to return a random movie. Can return any subclass
                                                         //that inherits from movie. Moreover, every subclass IS-A movie.

        int randomNumber = (int) (Math.random()*5) + 1;   //We need to generate a random number first.
                                                          //Math.random() will generate a double in the range 0-1
        System.out.println("Random number generated was: " + randomNumber);

        switch(randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new ForgettableMovie();
        }

        return null; //Handles a different case.
    }
}
