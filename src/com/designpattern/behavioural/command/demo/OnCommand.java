package com.designpattern.behavioural.command.demo;

/**
 * A concrete implementation of Command interface.
 * Note: state is not managed in the command, it
 * comes from the receiver and utilized in the command
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
