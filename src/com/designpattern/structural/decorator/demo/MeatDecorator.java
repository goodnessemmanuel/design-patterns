package com.designpattern.structural.decorator.demo;

public class MeatDecorator extends SandwichDecorator{
    public MeatDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    @Override
    public String make() {
        return this.customSandwich.make() + addMeat();
    }

    private String addMeat() {
        return " beef";
    }
}
