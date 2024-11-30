package com.designpattern.behavioural.state.demo;

/**
 * FanWithStatePattern - Demo state pattern.
 * This approach makes unit testing easier
 */
public class FanWithStatePattern extends Fan {

    private final State fanOffState;
    private final State fanLowState;
    private final State fanMediumState;
    private final State fanHighState;

    private State state;
    public FanWithStatePattern() {
        fanOffState = new FanOffState(this);
        fanLowState = new FanLowState(this);
        fanMediumState = new FanMediumState(this);
        fanHighState = new FanHighState(this);
        state = fanOffState;
    }

    @Override
    public void pullChain() {
       state.handleRequest();
    }

    public void setState(State state) {
        this.state = state;
    }
    public State getLowState(){
        return fanLowState;
    }

    public State getMediumState() {
         return fanMediumState;
    }

    public State getHighState() {
        return fanHighState;
    }

    public State getOffState() {
        return fanOffState;
    }

    @Override
    public String toString() {
        return state.toString();
    }
}
