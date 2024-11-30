package com.designpattern.behavioural.observer;

import com.designpattern.behavioural.observer.demo.MessageStream;
import com.designpattern.behavioural.observer.demo.PhoneObserver;
import com.designpattern.behavioural.observer.demo.TabletObserver;
import com.designpattern.behavioural.observer.example.observer.Client;
import com.designpattern.behavioural.observer.example.observer.ClientV2;
import com.designpattern.behavioural.observer.example.subject.TweeterMessageStream;
import com.designpattern.behavioural.observer.example.subject.TweeterMessageStreamV2;

public class ObserverPatternDemo {
    public static void main(String[] args) {
//        observerEverydayExample();
        demoCustomObserver();
    }

    private static void demoCustomObserver(){
        //custom observable a.k.a subject called message stream
        MessageStream messageStream = new MessageStream();

        //custom observers
        PhoneObserver phoneClient = new PhoneObserver(messageStream);
        TabletObserver tabletClient = new TabletObserver(messageStream);

        phoneClient.addMessage("New message alert!");
        tabletClient.addMessage("Another new message");

        messageStream.setState("New topic alert!"); //this state will notify all registered clients


    }
    private static void observerEverydayExample(){
        TweeterMessageStream messageStream = new TweeterMessageStream();

        Client client1 = new Client("Joshua");
        Client client2 = new Client("Oche");

        messageStream.addObserver(client1);
        messageStream.addObserver(client2);

        messageStream.someOneTweeted();

        //demo two using updated library because default
        // observables and observer are deprecated since java9

        // The Observable
        TweeterMessageStreamV2 messageStreamV2 = new TweeterMessageStreamV2();

        //the observers
        ClientV2 peter = new ClientV2("Peter");
        ClientV2 john = new ClientV2("John");

        //register the observers to the observable
        messageStreamV2.addTwitterChannel(peter);
        messageStreamV2.addTwitterChannel(john);

        // Stream a message or send notification
        messageStreamV2.setTweet("This is our very first tweet!");
        messageStreamV2.setTweet("We are updating our firewall!");

        System.out.println("Checking if Peter got updated tweet: " + peter.getTweet());

    }
}
