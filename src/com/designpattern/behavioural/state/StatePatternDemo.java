package com.designpattern.behavioural.state;

import com.designpattern.behavioural.state.demo.Fan;
import com.designpattern.behavioural.state.demo.FanWithStatePattern;
import com.designpattern.behavioural.state.demo.FanWithoutStatePattern;

public class StatePatternDemo {
    public static void main(String[] args) {
        sampleNonStatePattern();
    }

    public static void sampleNonStatePattern() {
        Fan fan = new FanWithoutStatePattern();  //this implementation is with too many nested if else
        fan = new FanWithStatePattern(); // implementation with state pattern that eliminates the if else's

        fan.pullChain();
        System.out.println(fan); //low

        fan.pullChain();
        System.out.println(fan); //medium

        fan.pullChain();
        System.out.println(fan); //high

        fan.pullChain();
        System.out.println(fan);  //off

    }
}
