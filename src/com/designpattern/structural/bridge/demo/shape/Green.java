package com.designpattern.structural.bridge.demo.shape;

public class Green implements Color{
    @Override
    public void applyColor() {
        System.out.println("Applying color green!");
    }
}
