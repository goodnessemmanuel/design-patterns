package com.designpattern.behavioural.chainsofresponsibility.demo;

public class Director extends Handler{
    @Override
    public void handleRequest(Request request) {
            if(request.getRequestType() == RequestType.PURCHASE && request.getAmount() < 1000){
                System.out.println("Directors can approve request amount less 100 euro");
            } else successor.handleRequest(request);
    }
}
