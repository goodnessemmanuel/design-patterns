package com.designpattern.creational.factory.demo;

/**
 * Blog - a sample concrete implementation
 * of a specific type of website.
 */
public class Blog extends Website {
    @Override
    public void createWebsite() {
        pages.add(new HomePage());
        pages.add(new PostPage());
        pages.add(new ContactPage());
    }

    @Override
    public String toString() {
        return pages.toString();
    }
}
