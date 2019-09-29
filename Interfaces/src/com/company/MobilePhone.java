package com.company;

public class MobilePhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    //Implement the interface methods
    @Override
    public void powerOn() {
        this.isOn = true;
        System.out.println("Mobile Phone powered up");
    }

    @Override
    public void dial(int phoneNumber) {
        if(this.isOn){
            System.out.println("Now ringing");
        }else{
            System.out.println("Phone is switched off");
        }
    }

    @Override
    public void answer() {
        if(this.isRinging){
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == this.myNumber && isOn){
            this.isRinging = true;
            System.out.println("Melody playing");
        }
        this.isRinging = false;
        System.out.println("Mobile Phone not on or number different");
        return false;
    }

    @Override
    public boolean isRinging() {
        return this.isRinging;
    }
}
