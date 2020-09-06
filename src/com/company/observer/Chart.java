package com.company.observer;

public class Chart implements Observer {
    @Override
    public void update() {
        System.out.println("Chart value updated");
    }
}
