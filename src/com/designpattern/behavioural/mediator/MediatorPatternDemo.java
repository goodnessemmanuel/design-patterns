package com.designpattern.behavioural.mediator;

import com.designpattern.behavioural.mediator.demo.Light;
import com.designpattern.behavioural.mediator.demo.Mediator;
import com.designpattern.behavioural.mediator.demo.TurnOffAllLightsColleague;
import com.designpattern.behavioural.mediator.demo.TurnOnAllLightsColleague;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        mediatorPatternEverydayExample();
        Mediator mediator = new Mediator();

        Light kitchen = new Light("Kitchen");
        Light bedroom = new Light("Bedroom");
        Light passage = new Light("Passage");

        mediator.registerLight(kitchen);
        mediator.registerLight(bedroom);
        mediator.registerLight(passage);

        TurnOnAllLightsColleague turnOnAllLightsColleague = new TurnOnAllLightsColleague(mediator);
        turnOnAllLightsColleague.execute();

        TurnOffAllLightsColleague turnOffAllLight = new TurnOffAllLightsColleague(mediator);
        turnOffAllLight.execute();
    }

    public static void mediatorPatternEverydayExample(){
        System.out.println("About to schedule tasks");
        mediatorPatternExampleTimerSchedule(3L);
        System.out.println("Task scheduled.");
    }

    /**
     * timer method to schedule
     * some tasks after specified seconds
     * @param seconds - time in seconds before scheduling task
     */
    public static void mediatorPatternExampleTimerSchedule(Long seconds){

        Timer timer = new Timer();
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

        TimerTask lightOutWithBeep = new TimerTask() {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            @Override
            public void run() {
                System.out.println("It is light out, please turn off all device and go to bed!...");
                toolkit.beep();
                timer.cancel();
                timer.purge();
            }
        };

        // timer mediating between tasks objects via its schedule method
        timer.schedule(studyTask, seconds * 1000);
        timer.schedule(lightOut, seconds * 2 * 1000);
        timer.schedule(lightOutWithBeep, seconds * 3 * 1000);
    }
}
