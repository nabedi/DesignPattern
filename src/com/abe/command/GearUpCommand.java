package com.abe.command;

public class GearUpCommand implements Command {
    Car car;

    public GearUpCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.gearUp();
    }
}
