package com.abe.strategy;

public class Mp3 implements MusicPlayer {
    @Override
    public void playing() {
        System.out.println("On playing MP3 music");
    }
}
