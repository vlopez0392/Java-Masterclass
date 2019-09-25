package com.company;

public class DeskPhone implements ITelephone { //Use the implements keyword to implement an interface

    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    //The class must implement the methods from the interface if it implements it even though the implementation of such methods
    //is not required -> Implementation may be very simple (e.g. output "not needed")

    @Override
    public void powerOn() {
        System.out.println("No action taken, deskPhone does not have a power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on deskPhone");
    }

    @Override
    public void answer() {
        if(this.isRinging){
            System.out.println("Answering desk phone");
            isRinging = false;
        }

        System.out.println("Desk phone is not ringing");
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == this.myNumber){
            this.isRinging = true;
            System.out.println("Ring ring");
        }
        this.isRinging = false;
        return false;
    }

    @Override
    public boolean isRinging() {
        return this.isRinging;
    }
}
