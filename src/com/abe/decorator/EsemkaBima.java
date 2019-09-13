package com.abe.decorator;

public class EsemkaBima implements Car {

    @Override
    public void run() {
        System.out.println("Car is running");
    }

    @Override
    public int getStatus() {
        return 100;
    }
}
