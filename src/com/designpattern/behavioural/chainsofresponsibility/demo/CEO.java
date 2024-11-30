package com.designpattern.behavioural.chainsofresponsibility.demo;

public class CEO extends Handler{
    @Override
    public void handleRequest(Request request) {
        System.out.println("CEOs can approve any request");
    }
}
