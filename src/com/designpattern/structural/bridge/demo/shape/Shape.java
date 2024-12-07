package com.designpattern.structural.bridge.demo.shape;

/**
 * Shape - Abstraction for various shapes
 * this shapes can be any shape with a color
 * we don't yet know.
 * the applyColor abstract signature is now the bridge between a
 * abstract class shape and the color interface
 * With this approach, we separated Color implementation
 * from the Shape abstraction.
 * The bridge that joins a shape and color is now the composition
 */
public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }


    public abstract void applyColor();
}
