package com.company.command.fx;

public class Button {

    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    // Click
    public void click() {
        command.execute();
    }
}
