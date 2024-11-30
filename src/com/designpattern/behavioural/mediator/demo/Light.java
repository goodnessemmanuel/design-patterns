package com.designpattern.behavioural.mediator.demo;

/**
 * the receiver.
 * the encapsulates the state
 *
 */
public class Light {
    private boolean isOn = false;
    private String location;
    public Light(String location){
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public boolean isOn(){
        return isOn;
    }

    public void toggle(){
        if(isOn) {
            off();
            isOn = false;
        } else {
            on();
            isOn = true;
        }
    }
    public void on(){
        System.out.println(location + " light switched on");
    }
    public void off(){
        System.out.println(location + " light is switched off");
    }
}
