package com.abe.chain;

public class Mp3Processor implements Player {
    private Player nextInChain;

    public void setNextInChain(Player nextInChain) {
        this.nextInChain = nextInChain;
    }

    @Override
    public void process(CurrentFile file) {
        if (file.getExtension().equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file");
        }else{
            nextInChain.process(file);
        }
    }
}
