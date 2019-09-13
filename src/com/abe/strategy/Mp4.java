package com.abe.strategy;

public class Mp4 implements MusicPlayer {
    @Override
    public void playing() {
        System.out.println("On playing MP4 music");
    }
}
