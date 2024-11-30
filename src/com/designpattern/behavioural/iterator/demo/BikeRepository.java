package com.designpattern.behavioural.iterator.demo;

import java.util.Iterator;

/**
 * demo iterator. custom bike repository object
 */
public class BikeRepository implements Iterable<String> {
    private int index;
    private String[] bikes = new String[index];
    public void addBike(String name) {
        if(bikes.length == index) {
            String[] temp = new String[index + 5];
            System.arraycopy(bikes, 0, temp, 0, bikes.length);
            bikes = temp;
        }
        bikes[index++] = name;
    }

    public String[] getBikes() {
        return bikes;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<>() {
            int currentIndex = 0;
            @Override
            public boolean hasNext() {
                return currentIndex < bikes.length && bikes[currentIndex] != null;
            }

            @Override
            public String next() {
                return bikes[currentIndex++];
            }
        };
    }
}
