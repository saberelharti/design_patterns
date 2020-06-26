package com.company.state;

public class Selection implements Tools {

    @Override
    public void mouseDown() {
        System.out.println("Change selection icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw dashed rectangle");
    }
}
