package com.designpattern.structural.bridge.demo.formatter;

public class Movie {
    private String title;
    private String year;
    private String type;

    public Movie(String title, String year, String type) {
        this.title = title;
        this.year = year;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public String getType() {
        return type;
    }
}
