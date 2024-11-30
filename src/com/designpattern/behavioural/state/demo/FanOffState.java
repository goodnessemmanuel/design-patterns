package com.designpattern.behavioural.state.demo;

public class FanOffState implements State{
    private final FanWithStatePattern fan;
    public FanOffState(FanWithStatePattern fan) {
        this.fan = fan;
    }

    /**
     * NB: A state is only aware of the next state it should communicate.
     * It does not know how the actual implementation is in the fan object
     * itself
     */
    @Override
    public void handleRequest() {
        System.out.println("Switching fan on to low");
        fan.setState(fan.getLowState());
    }

    @Override
    public String toString() {
        return "fan is off";
    }
}
