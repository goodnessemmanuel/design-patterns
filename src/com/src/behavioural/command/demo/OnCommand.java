package com.src.behavioural.command.demo;

/**
 * A concrete implementation of Command interface
 */
public class OnCommand implements Command{
    private final Light light;
    public OnCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }
}
