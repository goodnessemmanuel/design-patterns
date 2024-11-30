package com.designpattern.behavioural.observer.example.observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ClientV2 implements PropertyChangeListener {
    private String tweet;
    private final String name;

    public ClientV2(String name) {
        this.name = name;
    }

    public String getTweet() {
        return tweet;
    }

    public void setTweet(String tweet) {
        this.tweet = tweet;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println(name + " was notified!");
        String newTweet = (String) evt.getNewValue();
        System.out.println("previous info: " + evt.getOldValue() + " , \nNew info: " + newTweet);
        this.setTweet(newTweet);
    }
}
