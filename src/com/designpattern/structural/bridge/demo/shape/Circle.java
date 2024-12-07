package com.designpattern.structural.bridge.demo.shape;

/**
 * Circle - a refined abstraction that
 * enables concrete implementation to be composed of the
 * desired color of intended shape
 */
public class Circle extends Shape{
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        this.color.applyColor();
    }
}
