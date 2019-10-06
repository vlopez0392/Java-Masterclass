package com.company;

import java.util.Scanner;
public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {

    //Example 2 - Local class
//        class clickListener implements Button.OnClickListener{
//            public clickListener(){
//                System.out.println("I've been attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        }

    //Example 3 Anonymous class
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listen();

        //Example 1 - Inner Class
        //GearBox mcLaren = new GearBox(6);
        //GearBox.Gear first = mcLaren.new Gear(1,12.3); //New-syntax
        //System.out.println(first.driveSpeed(1000));

//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(1);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(1000));
//        mcLaren.changeGear(2);
//        System.out.println(mcLaren.wheelSpeed(3000));
//
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(3);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(6000));
    }

    private static void listen(){
        boolean quit = false;
        while(!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}

//Inner classes: In Java, it is possible to nest a class inside another class.
//Four types of nested classes:
// 1- Static nested class
//      - Mainly used to associate a class with its outer class. In terms of behavior, it is similar to the outer class
//      but it is packaged in the outer class rather than in the package. Cannot access non-static member of its top
//      class without first instantiating the top level class.

