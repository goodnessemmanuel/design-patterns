package com.designpattern.behavioural.state.demo;

public class FanHighState implements State {
    private final FanWithStatePattern fan;

    public FanHighState(FanWithStatePattern fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Switching fan on to off");
        fan.setState(fan.getOffState());
    }

    @Override
    public String toString() {
        return "fan is high";
    }
}
