package com.abe.chain;

public class TestChain {
    public static void main(String[] args) {
        Player player = new Mp3Processor();
        Player player1 = new Mp4Processor();
        player.setNextInChain(player1);

        player.process(new CurrentFile("Mp3"));
        player.process(new CurrentFile("Mp4"));
    }
}
