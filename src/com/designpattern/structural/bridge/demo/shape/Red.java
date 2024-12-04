package com.designpattern.structural.bridge.demo.shape;

public class Red implements Color{
    @Override
    public void applyColor() {
        System.out.println("Applying color red!");
    }
}
