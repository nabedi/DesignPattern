package com.abe.decorator;

public class TestDecorator {
    public static void main(String[] args) {
        Car esemkaBima = new EsemkaBima();
        esemkaBima.run();
        System.out.println("Current speed "+esemkaBima.getStatus());

        Car turboDecorator = new TurboDecorator(esemkaBima);
        turboDecorator.run();
        System.out.println("Current speed "+turboDecorator.getStatus());
    }
}
