package com.designpattern.behavioural.mediator.demo;

public class TurnOffAllLightsColleague implements Colleague {
    private final Mediator  mediator;
    public TurnOffAllLightsColleague(Mediator mediator){
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOffAllLight();
    }
}
