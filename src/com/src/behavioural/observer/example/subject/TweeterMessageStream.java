package com.src.behavioural.observer.example.subject;

import java.util.Observable;

public class TweeterMessageStream extends Observable {
    public void someOneTweeted(){
        setChanged();
        notifyObservers();
    }
}
