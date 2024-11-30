package com.designpattern.behavioural.state.demo;

/**
 * Implementation without state pattern.
 * NB: As the number of states increases,
 * there will be too many if, else statements.
 * This is the reason, state pattern will do
 * a better job when the future is not clear  .
 */
public class FanWithoutStatePattern extends Fan {
    private final int OFF = 0;
    private final int LOW = 1;
    private final int MEDIUM = 2;
    private final int HIGH = 3;
    private int state = OFF;

    @Override
    public void pullChain(){
        if(state ==  OFF){
            System.out.println("Switching fan to LOW");
            state = LOW;
        } else if (state == LOW){
            System.out.println("Switching fan to MEDIUM");
            state = MEDIUM;
        } else if (state == MEDIUM){
            System.out.println("Switching fan to HIGH");
            state = HIGH;
        } else if (state == HIGH){
            System.out.println("Switching fan OFF");
            state = OFF;
        }
    }

    @Override
    public String toString() {
        if (state == LOW){
            return "fan is low";
        } else if (state == MEDIUM){
            return "fan is medium";
        }else if (state == HIGH){
            return "fan is high";
        } else {
            return "Fan is OFF";
        }
    }

}
