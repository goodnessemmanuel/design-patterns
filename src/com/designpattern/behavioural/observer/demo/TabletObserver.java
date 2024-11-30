package com.designpattern.behavioural.observer.demo;

/**
 * Concrete observer class
 */
public class TabletObserver extends Observer {

    public TabletObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void addMessage(String message){
        subject.setState(message + " - sent from tablet");
    }
    @Override
    public void update() {
        System.out.println("Tablet stream: " + subject.getState());
    }
}
