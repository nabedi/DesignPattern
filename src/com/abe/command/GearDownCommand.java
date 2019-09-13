package com.abe.command;

public class GearDownCommand implements Command {
    Car car;

    public GearDownCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.gearDown();
    }
}
