package com.src.behavioural.chainsofresponsibility;

import com.src.behavioural.chainsofresponsibility.demo.*;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChainOfResponsibilityEverydayDemo {


    public static void main(String[] args) {
//        everydayExample();

        Director john = new Director();
        VP tony = new VP();
        CEO oche = new CEO();

        john.setSuccessor(tony);
        tony.setSuccessor(oche);

        Request purchaseRequest = new Request(RequestType.PURCHASE, 950);
        john.handleRequest(purchaseRequest);

        //Although john, a director was notified of this request but he can only handle < 1000
        // it will pass down the chain to tony, who is a VP and can handle purchase amount > 1000
        Request purchaseRequest1200 = new Request(RequestType.PURCHASE, 1200);
        john.handleRequest(purchaseRequest1200);

        //Below request is conference, tony and john won't be able to handle it.
        //So the request will be passed down the chain until who is capable to handle, in this case the CEO
        Request conferenceRequest = new Request(RequestType.CONFERENCE, 2000);
        john.handleRequest(conferenceRequest);
    }

    /**
     * The java logger api was implemented using
     * the chain of responsibility principle
     */
    public static void everydayExample() {
        Logger logger = Logger.getLogger(ChainOfResponsibilityEverydayDemo.class.getName());

        //level to set log at
        logger.setLevel(Level.FINER);

        ConsoleHandler handler = new ConsoleHandler();

        //level to publish at
        handler.setLevel(Level.FINEST);
        logger.addHandler(handler); //building the chain of handlers


        logger.finest("Finest level of logging"); // this won't print because the handler level is set to FINER which is lower in hierarchy than FINEST
        logger.finer("Finer level, but not as fine as finest");
        logger.fine("Fine, but not as fine as finer or finest");
    }
}
