package com.abe.command;

public class CommandTest {
    public static void main(String[] args) {
        Persneling persneling = new Persneling();
        Car car = new Car();

        Command gearUp = new GearUpCommand(car);
        Command gearDown = new GearDownCommand(car);

        persneling.setCommand(gearUp);
        persneling.switchPersneling();
        persneling.switchPersneling();
        car.getState();
        persneling.setCommand(gearDown);
        persneling.switchPersneling();
        car.getState();
    }
}
