package com.company.state;

public class Brush implements Tools {

    @Override
    public void mouseDown() {
        System.out.println("Change the brush icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw the line");
    }
}
