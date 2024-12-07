package com.designpattern.structural.bridge.demo.shape;

import com.designpattern.structural.bridge.demo.shape.Color;

public class Blue implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying blue color!");
    }
}
