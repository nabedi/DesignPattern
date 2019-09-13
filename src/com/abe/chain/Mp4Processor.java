package com.abe.chain;

public class Mp4Processor implements Player {
    private Player nextInChain;

    @Override
    public void setNextInChain(Player next) {
        nextInChain = next;
    }

    @Override
    public void process(CurrentFile file) {
        if (file.getExtension().equalsIgnoreCase("mp4")){
            System.out.println("Playing mp4 file");
        }else{
            nextInChain.process(file);
        }
    }
}
