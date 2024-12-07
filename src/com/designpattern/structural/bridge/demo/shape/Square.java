package com.designpattern.structural.bridge.demo.shape;

/**
 * Square - Another refined abstraction that
 * enables concrete implementation to be composed of the
 * desired color of intended shape
 */
public class Square extends Shape{
    public Square(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        this.color.applyColor();
    }
}
