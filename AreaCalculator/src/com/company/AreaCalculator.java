package com.company;

public class AreaCalculator {
//    Write a method named area with one double parameter named radius.
//    The method needs to return a double value that represents the area of a circle.

//    If the parameter radius is negative then return -1.0 to represent an invalid value.
//    Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.

//    The method needs to return an area of a rectangle.
//    If either or both parameters is/are a negative return -1.0 to indicate an invalid value.

    public static double area(double radius){
        if(radius >=0){
            double area = Math.PI*radius*radius;
            System.out.println("The area of the circle is " + area);
            return area;
        }
        return -1;
    }

    public static double area(double x, double y){
        if(x >=0 && y>=0){
            double area = x*y;
            System.out.println("The area of the rectangle is " + area);
            return area;
        }
        return -1;
    }
}
