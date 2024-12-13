package com.designpattern.creational.builder.demo;

public enum RAM {
    DEFAULT(512), UPGRADED(1024), MAX(2048);
    private final int size;

    RAM(int size){
        this.size = size;
    }
}
