package com.src.behavioural.mediator;

import com.src.behavioural.mediator.demo.Light;
import com.src.behavioural.mediator.demo.Mediator;
import com.src.behavioural.mediator.demo.TurnOffAllLightsColleague;
import com.src.behavioural.mediator.demo.TurnOnAllLightsColleague;

import java.util.Timer;
import java.util.TimerTask;

public class MediatorPatternDemo {
    public static void main(String[] args) {
//      mediatorPatternEverydayExample();
        Mediator mediator = new Mediator();

        Light kitchen = new Light("Kitchen");
        Light bedroom = new Light("Bedroom");
        Light passage = new Light("Passage");

        mediator.registerLight(kitchen);
        mediator.registerLight(bedroom);
        mediator.registerLight(passage);

//        TurnOnAllLightsColleague turnOnAllLightsColleague = new TurnOnAllLightsColleague(mediator);
//        turnOnAllLightsColleague.execute();

//        TurnOffAllLightsColleague turnOffAllLight = new TurnOffAllLightsColleague(mediator);
//        turnOffAllLight.execute();
    }
    public static void mediatorPatternEverydayExample(){
        TimerTask studyTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Time to study is over...");
            }
        };

        TimerTask lightOut = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Its time for light out...");
            }
        };

        Timer timer = new Timer();
        // timer mediating between tasks objects via its schedule method
        timer.schedule(studyTask, 1000);
        timer.schedule(lightOut, 1000 * 2);
        timer.cancel();
        timer.purge();
    }
}
