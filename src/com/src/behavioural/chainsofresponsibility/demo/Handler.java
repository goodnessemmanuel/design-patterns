package com.src.behavioural.chainsofresponsibility.demo;

public abstract class Handler {
    protected Handler successor;

     public void setSuccessor(Handler successor){
        this.successor = successor;
    }

    public abstract void handleRequest(Request request);

}
