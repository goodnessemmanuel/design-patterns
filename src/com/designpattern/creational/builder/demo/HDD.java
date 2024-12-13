package com.designpattern.creational.builder.demo;

public enum HDD {

    DEFAULT(1024), UPGRADED(2048), MAX(4096);
    private final int size;
    HDD(int size){
        this.size = size;
    }
}
