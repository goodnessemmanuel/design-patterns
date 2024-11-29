package com.src.behavioural.observer.demo;

public class PhoneObserver extends Observer {

    public PhoneObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void addMessage(String message){
        subject.setState(message + " - sent from phone");
    }

    @Override
    public void update() {
        System.out.println("Phone stream: " + subject.getState());
    }
}
