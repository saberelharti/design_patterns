package com.company.strategy;

public class BlackAndWitheFilter implements Filter{
    @Override
    public void apply() {
        System.out.println("Filter image using black and white");
    }
}
