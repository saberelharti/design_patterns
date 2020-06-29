package com.company.strategy;

public class JpgCompressor implements Compressor {
    @Override
    public void compress() {
        System.out.println("Compress image using JPG");
    }
}
