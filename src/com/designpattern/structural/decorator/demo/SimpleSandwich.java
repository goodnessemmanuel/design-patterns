package com.designpattern.structural.decorator.demo;

public class SimpleSandwich implements Sandwhich{
    @Override
    public String make() {
        return "Bread";
    }
}
