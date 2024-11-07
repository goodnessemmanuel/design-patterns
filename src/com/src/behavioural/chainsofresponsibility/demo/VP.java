package com.src.behavioural.chainsofresponsibility.demo;

public class VP extends Handler{
    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() != RequestType.CONFERENCE && request.getAmount() < 1500){
            System.out.println("VPs can approve request less than 1500 euro");
        } else successor.handleRequest(request);
    }
}
