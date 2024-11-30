package com.designpattern.behavioural.state.demo;

public class FanMediumState implements State {
    private final FanWithStatePattern fan;

    public FanMediumState(FanWithStatePattern fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Switching fan on to high");
        fan.setState(fan.getHighState());
    }

    @Override
    public String toString() {
        return "fan is medium";
    }
}
