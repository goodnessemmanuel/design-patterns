package com.designpattern.creational.factory.demo;

public enum WebsiteType {
    SHOP("Shop"),
    BLOG("Blog"),
    ;

    private final String name;

    WebsiteType(String name) {
        this.name = name;
    }
}
