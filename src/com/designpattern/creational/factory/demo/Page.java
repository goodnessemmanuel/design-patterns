package com.designpattern.creational.factory.demo;

/**
 * a common class for any kind of a
 * website page (e.g blog, post, cart, contactus, etc)
 */
public abstract class Page {
    protected String title;
    public Page(String title) {
        this.title = title;
    }
}
