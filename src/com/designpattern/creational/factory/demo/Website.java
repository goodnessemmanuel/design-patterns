package com.designpattern.creational.factory.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Website - an abstract factory that
 * exposes a common interface (i.e. createWebsite())
 * through which different website types
 * e.g shops, blogs, music website, etc can be built
 *
 */
public abstract class Website {
    protected List<Page> pages = new ArrayList<>();

    public Website() {
        createWebsite();
    }

    /**
     * createWebsite - common interface method
     * exposed for the creation of various website
     * via creating and adding pages
     */
    public abstract void createWebsite();

}
