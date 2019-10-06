package com.company;

public class Main {

    public static void main(String[] args) {
        //Abstraction - Abstraction is when you define the functionality of what needs to be done without implementing the
        //details. What needs to be done VS. How it will be done

        //Interfaces are purely abstract.  - They don't specify any aspects of the implementations.
                                        // - Implementation is left to the classes that implement the interface.

        //Abstract classes -> Are classes that define methods but do not provide the details of the implementations
                        // -> Implementation details are left to the classes the inherit from the abstract class. (Different from interfaces)

        //Test
        Dog dog = new Dog("Yorkie");
        dog.eat();
        dog.breathe();

        Parrot parrot = new Parrot("Australian Ringneck");
        parrot.eat();
        parrot.breathe();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.eat();
        penguin.breathe();
        penguin.fly();

        //Discussion: Difference between abstract class & Interfaces
        //How do we decide which one to use? -> Consider the relationships IS-A vs HAS-A / CAN
        //Example: A dog and a bird are both animals so it makes sense to implement an abstract animal superclass from which
        //they will inherit from rather than implementing from an Animal interface.

        //A parrot is also a bird. -> But there is a problem. Birds aren't the only animals that can fly (bees, bats and other
        // animals can also fly) -> Better design -> Implement a can fly interface.

        //Summary: Abstract classes vs Interfaces
        //- An abstract class can have member variables that can be inherited. Interfaces can have variables but they have
        //  to be declared public static final, which, will act as constants and will have a static scope -> Non-static variables
        //  require an instance to be created.
        //
        //- Abstract classes can have constructors while interfaces can't.
        //
        //- All methods of an interface are automatically public while abstract class methods can have any access modifier.
    }
}
