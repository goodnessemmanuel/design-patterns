package com.designpattern.behavioural.state.demo;

public class FanLowState implements State{
    private final FanWithStatePattern fan;
    public FanLowState(FanWithStatePattern fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Switching fan on to medium");
        fan.setState(fan.getMediumState());
    }

    @Override
    public String toString() {
        return "fan is low";
    }
}
