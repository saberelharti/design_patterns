package com.company.strategy;

public class PngCompressor implements Compressor {
    @Override
    public void compress() {
        System.out.println("Compress image using PNG");
    }
}
