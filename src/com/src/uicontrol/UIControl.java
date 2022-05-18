package com.src.uicontrol;

public abstract class UIControl {
    public void enable(){
        System.out.println("Tool enabled");
    }

    public void focus(){
        System.out.println("Tool is focused");
    }

    public void setPosition(){
        System.out.println("Tool position is set");
    }

    public abstract void draw();
}
