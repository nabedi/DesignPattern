package com.abe.chain;

public interface Player {
    void setNextInChain(Player next);
    void process(CurrentFile file);
}
