package com.company.observer;

public class SpreedSheet implements Observer {
    @Override
    public void update() {
        System.out.println("SpreesSheet updated");
    }
}
