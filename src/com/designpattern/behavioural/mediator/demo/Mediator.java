package com.designpattern.behavioural.mediator.demo;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
    List<Light> lights = new ArrayList<>();
    public Mediator(){}
    public void registerLight(Light light){
        lights.add(light);
    }
    public void turnOffAllLight() {
        for (Light light: lights){
            if(light.isOn())
                light.toggle();
        }
    }

    public void turnOnAllLight() {
        for (Light light: lights){
            if(!light.isOn())
                light.toggle();
        }
    }
    public void turnOnLight(String location){
        for (Light light : lights){
            if(location.equals(light.getLocation()) && !light.isOn()){
                light.toggle();
            }
        }
    }
}
