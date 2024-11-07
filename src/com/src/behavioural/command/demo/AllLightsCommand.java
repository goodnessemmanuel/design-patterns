package com.src.behavioural.command.demo;

import java.util.List;

/**
 * A concrete command.
 * NB: This command does not know the state of the
 * receiver (i.e. the light) but it runs operations
 * based on whatever the state is in the light receiver
 */
public class AllLightsCommand implements Command{
    private final List<Light> lights;
    public AllLightsCommand(List<Light> lights){
        this.lights = lights;
    }
    @Override
    public void execute() {
        for (Light light : lights) {
            if(light.isOn())
                light.toggle();
        }
    }
}
