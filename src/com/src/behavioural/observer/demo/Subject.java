package com.src.behavioural.observer.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject class - custom observable abstract class
 */
public abstract class Subject {

    List<Observer> observers = new ArrayList<>();

    abstract void setState(String message);

    abstract String getState();

    public void attach(Observer observer){
        observers.add(observer);
    }
    public void detach(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers){
            observer.update();
        }
    }


}
