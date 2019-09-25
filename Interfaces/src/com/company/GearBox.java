package com.company;

public class GearBox {

    private boolean clutchIn;

    //Example: Implement a method to determine if the clutch is in:
    public void operateClutch(String inOrOut){
        this.clutchIn = inOrOut.equalsIgnoreCase("in");
    }

    //This is not the best way to implement this method. Consider the following:
    public void operateClutch(boolean inOrOut){
        this.clutchIn = inOrOut;
    }

    //Now, because we have changed the above method, we may or may not have affected other parts of the code.
    //This could be a serious problem. -> Then, interfaces provide a "contract" that the methods defined in the interface
    //WILL NOT change. -> Provides robustness to your code.




}
