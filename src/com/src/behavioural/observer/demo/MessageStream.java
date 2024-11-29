package com.src.behavioural.observer.demo;

import java.util.ArrayDeque;
import java.util.Deque;

public class MessageStream extends Subject{

    Deque<String> messagesHistory = new ArrayDeque<>();

    @Override
    public void setState(String message) {
        messagesHistory.add(message);
        this.notifyObservers();
    }

    @Override
    public String getState() {
        return messagesHistory.getLast();
    }
}
