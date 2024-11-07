package com.src.behavioural.command;

import com.src.behavioural.command.demo.*;

import java.util.ArrayList;
import java.util.List;

public class CommandPatternDemo {

    public static void main(String[] args) {
//        everydayExampleWithRunnableInterface();
        demoCustomExample();
    }

    /**
     * method to demo custom command
     * design pattern example
     */
    public static void demoCustomExample() {
        Light bedroomLight = new Light(); //receiver
        Light kitchenLight = new Light(); //receiver
        Switch lightSwitch = new Switch(); // the invoker

//        Command onCommand = new OnCommand(kitchenLight);
//        lightSwitch.storeAndExecute(onCommand);
        //The storeAndExecute method of the switch invoker
        // that invokes the actual command execute through
        // the storeAndExecute(command) method
        //lightSwitch.storeAndExecute(onCommand); // the invoker

        Command toggleCommand = new ToggleCommand(bedroomLight);
        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);
//        lightSwitch.storeAndExecute(toggleCommand);
//        lightSwitch.storeAndExecute(toggleCommand);


        //macro command
        List<Light> lights = new ArrayList<>();
        lights.add(bedroomLight);
        lights.add(kitchenLight);
        Command allLightCommand = new AllLightsCommand(lights);
        lightSwitch.storeAndExecute(allLightCommand);
    }

    /**
     * demo command pattern using the runnable API
     * which is an everyday example of a command pattern
     */
    public static void everydayExampleWithRunnableInterface() {

        Task task1 = new Task(100, 300); // encapsulates request
        Task task2 = new Task(50, 80);

        //the thread calls the invoker (i.e. start method) which will in turn invokes the execute(i.e. run()) method of our Task
        Thread thread1 = new Thread(task1);
        thread1.start(); //the invoker that makes the request completely decoupled from the processor

        Thread thread2 = new Thread(task2);
        thread2.start();
    }
    static class Task implements Runnable{
        private final int num1;
        private final int num2;
        // request will be completely encapsulated by this task object
        public Task(int num1, int num2){
            this.num1 = num1;
            this.num2 = num2;
        }

        @Override
        public void run() { //execute method
            //NB: there is no much of a receiver in this though because what we are doing
            // is just adding two numbers together
            System.out.println("sum of the properties is: " + (num1 + num2));
        }
    }
}
