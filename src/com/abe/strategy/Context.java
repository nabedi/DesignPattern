package com.abe.strategy;

public class Context {
    private MusicPlayer musicPlayer;

    public Context(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public void executeMusicPlayer(){
        musicPlayer.playing();
    }
}
