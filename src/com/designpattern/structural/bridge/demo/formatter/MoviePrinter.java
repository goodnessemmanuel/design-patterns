package com.designpattern.structural.bridge.demo.formatter;

import java.util.ArrayList;
import java.util.List;

/**
 * MoviePrinter - a concrete implementation of Printer bridge
 * NB: You can have as much concrete impl as you want
 * depending on your use case. e.g. Newspaper printer
 */
public class MoviePrinter extends Printer{
    private final Movie movie;

    public MoviePrinter(Movie movie) {
        this.movie = movie;
    }

    @Override
    public List<Detail> getDetails() {
        List<Detail> details = new ArrayList<>();
        details.add(new Detail("Title", movie.getTitle()));
        details.add(new Detail("Year", movie.getYear()));
        return details;
    }

    @Override
    public String getHeader() {
        return movie.getType();
    }
}
