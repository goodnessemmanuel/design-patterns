package com.designpattern.behavioural.observer.demo;

/**
 * Client interface - custom Observer
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
