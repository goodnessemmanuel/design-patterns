package com.src.behavioural.observer.example.subject;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class TweeterMessageStreamV2 {
    private String tweet;
    private final PropertyChangeSupport propertyChangeSupport;

    public TweeterMessageStreamV2() {
        propertyChangeSupport = new PropertyChangeSupport(this);
    }

    public void addTwitterChannel(PropertyChangeListener listener){
        propertyChangeSupport.addPropertyChangeListener(listener);
    }
    public void removeTwitterChannel(PropertyChangeListener listener){
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    public void setTweet(String newTweet) {
        propertyChangeSupport.firePropertyChange("tweet", this.tweet, newTweet);
        this.tweet = newTweet;
    }
}
