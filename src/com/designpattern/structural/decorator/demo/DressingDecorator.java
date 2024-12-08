package com.designpattern.structural.decorator.demo;

public class DressingDecorator extends SandwichDecorator{
    public DressingDecorator(Sandwhich customSandwich) {
        super(customSandwich);
    }

    @Override
    public String make() {
        return customSandwich.make() + addDress();
    }

    private String addDress() {
        return " mustard";
    }
}
