package com.abe.command;

public class Persneling {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void switchPersneling(){
        command.execute();
    }
}
