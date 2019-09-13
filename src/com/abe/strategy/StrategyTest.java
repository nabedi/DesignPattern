package com.abe.strategy;

public class StrategyTest {

    public static void main(String[] args) {
        Context context = new Context(new Mp3());
        context.executeMusicPlayer();

        context = new Context(new Mp4());
        context.executeMusicPlayer();
    }
}
