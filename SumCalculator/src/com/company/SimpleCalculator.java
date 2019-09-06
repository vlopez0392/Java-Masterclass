package com.company;

public class SimpleCalculator {

//    Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with names firstNumber
//    and secondNumber both of type double.

//    Write the following methods (instance methods):
//    *Method named getFirstNumber without any parameters, it needs to return the value of firstNumber field.
//    *Method named getSecondNumber without any parameters, it needs to return the value of secondNumber field.
//    *Method named setFirstNumber with one parameter of type double, it needs to set the value of the firstNumber field.
//    *Method named setSecondNumber with one parameter of type double, it needs to set the value of the secondNumberfield.
//    *Method named getAdditionResult without any parameters, it needs to return the result of adding the field values
//    of firstNumber and secondNumber.
//    *Method named getSubtractionResult without any parameters, it needs to return the result of subtracting the field
//    values of secondNumber from the firstNumber.
//    *Method named getMultiplicationResult without any parameters, it needs to return the result of multiplying the
//    field values of firstNumber and secondNumber.
//    *Method named getDivisionResult without any parameters it needs to return the result of dividing the field values
//    of firstNumber by the secondNumber.
//    In case the value of secondNumber is 0 then return 0.


    //Fields
    private double firstNumber;
    private double secondNumber;

    //Getters
    public double getFirstNumber(){
        return this.firstNumber;
    }

    public double getSecondNumber(){
        return this.secondNumber;
    }

    //Setters
    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }

    //Get calculator operations
    public double getAdditionResult(){
        return (this.firstNumber+this.secondNumber);
    }

    public double getSubtractionResult(){
        return (this.firstNumber-this.secondNumber);
    }

    public double getMultiplicationResult(){
        return (this.firstNumber*this.secondNumber);
    }

    public double getDivisionResult(){
        if(secondNumber!=0){
            return (this.firstNumber/this.secondNumber);
        }else{
            return 0.0;
        }
    }
}

