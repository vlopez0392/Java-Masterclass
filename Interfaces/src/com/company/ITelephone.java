package com.company;

public interface ITelephone { //Convention -> First character of the interface name starts with uppercase I. -> Denotes an interface

    //Methods to be implemented by the classes.  -> This is the "contract"
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();

    //The public access modifier is redundant for interface methods. They will be implemented anyhow.
}
