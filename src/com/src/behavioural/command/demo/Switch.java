package com.src.behavioural.command.demo;

//invoker
public class Switch {
    public void storeAndExecute(Command command){
        command.execute();
    }
}