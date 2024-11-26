package com.src.behavioural.iterator;

import com.src.behavioural.iterator.demo.BikeRepository;

import java.util.*;

public class IteratorPatternDemo {


    public static void main(String[] args) {
//        everydayDemoWithList();
        BikeRepository bikeRepository = new BikeRepository();

        bikeRepository.addBike("Innoson");
        bikeRepository.addBike("Fuji");
        bikeRepository.addBike("Jincheng");
        bikeRepository.addBike("Bajaj");
        bikeRepository.addBike("Fenster");
//        System.out.println(Arrays.toString(bikeRepository.getBikes()));

//        Iterator<String> bikeIterator = bikeRepository.iterator();
//
//        while (bikeIterator.hasNext()){
//            System.out.println(bikeIterator.next());
//        }
        //NB: Once iterable interface is implemented in a class,
        //the enhanced forloop can also be used in place of the while loop above
        for (String bike : bikeRepository){
            System.out.println(bike);
        }
    }

    /**
     * Using iterator provides more functionality
     * to your collection
     */
    private static void everydayDemoWithList(){
//        List<String> names = new ArrayList<>();
        Set<String> names = new HashSet<>();

        names.add("James");
        names.add("Jones");
        names.add("Samuel");

//        Iterator<String> namesItr = names.iterator();
//
//        while (namesItr.hasNext()){
//            String name = namesItr.next();
//            System.out.println("name in list is: " + name );
//            namesItr.remove();
//        }

        //NB: For each  loop uses iterator instance under the hood hence above iterator
        // logic could be simplified as below. Only that you can not remove element
        // in iterator otherwise ConcurrentModificationException
        for (String name : names){
            System.out.println("name in list is: " + name );
        }
        System.out.println("container size: " + names.size());

    }
}
