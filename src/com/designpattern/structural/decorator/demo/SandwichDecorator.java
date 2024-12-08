package com.designpattern.structural.decorator.demo;

public abstract class SandwichDecorator implements Sandwich {
    protected Sandwich customSandwich;
    public SandwichDecorator(Sandwich customSandwich){
        this.customSandwich = customSandwich;
    }

}
