package com.company.strategy;

public class ImageStorage {

    public void storeImage(String fileName, Compressor compressor, Filter filter) {
        compressor.compress();
        filter.apply();
        System.out.println("Store image with " + fileName);
    }

}
