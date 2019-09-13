package com.abe.command;

public class Car {
    private int currentGear = 0;

    public void gearUp(){
        currentGear++;
    }

    public void gearDown(){
        currentGear--;
    }

    public void getState(){
        System.out.println("Current gear is "+currentGear);
    }

}
