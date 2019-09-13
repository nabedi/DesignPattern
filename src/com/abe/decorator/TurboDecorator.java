package com.abe.decorator;

public class TurboDecorator extends CarDecorator {
    public TurboDecorator(Car car) {
        super(car);
    }

    @Override
    public void run() {
        car.run();
    }

    @Override
    public int getStatus() {
        return addTurbo();
    }

    private int addTurbo(){
        return car.getStatus()*2;
    }
}
