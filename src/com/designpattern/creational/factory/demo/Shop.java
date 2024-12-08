package com.designpattern.creational.factory.demo;

/**
 * Shop - a sample concrete implementation
 * of a specific type of website.
 */
public class Shop extends Website {
    @Override
    public void createWebsite() {
        pages.add(new HomePage());
        pages.add(new ProductPage());
        pages.add(new CartPage());
        pages.add(new AboutPage());
    }

    @Override
    public String toString() {
        return pages.toString();
    }
}
