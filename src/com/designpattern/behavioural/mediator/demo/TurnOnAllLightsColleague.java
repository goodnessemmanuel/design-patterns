package com.designpattern.behavioural.mediator.demo;

public class TurnOnAllLightsColleague implements Colleague {
    private final Mediator  mediator;
    public TurnOnAllLightsColleague(Mediator mediator){
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOnAllLight();
    }
}
