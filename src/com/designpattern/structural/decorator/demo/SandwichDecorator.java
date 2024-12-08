package com.designpattern.structural.decorator.demo;

public abstract class SandwichDecorator implements Sandwhich{
    protected Sandwhich customSandwich;
    public SandwichDecorator(Sandwhich customSandwich){
        this.customSandwich = customSandwich;
    }

}
