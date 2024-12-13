package com.designpattern.creational.builder;

import com.designpattern.creational.builder.demo.Computer;
import com.designpattern.creational.builder.demo.HDD;
import com.designpattern.creational.builder.demo.RAM;

public class BuilderPatternDemo {

    public static void main(String[] args) {
        everydayExample();

        //custom demo
        Computer.ComputerBuilder builder = new Computer.ComputerBuilder()
                .addHDD(HDD.DEFAULT).addRam(RAM.MAX).hasGigabitWifi(true).hasUsbc(true);

        Computer computer = builder.build();

        System.out.println("Hard disk size: " + computer.getDiskSize());
        System.out.println("Ram size: " + computer.getRamSize());
        System.out.println("Has wifi: " + computer.isHasGigabitWifi());
        System.out.println("Has usbc: " + computer.isHasUsbc());
    }

    private static void everydayExample() {
        StringBuilder builder = new StringBuilder();
        builder.append("This is an example ");
        builder.append("of the builder pattern");
        builder.append("It has methods to append");
        builder.append("almost anything we want to a String. ");
        builder.append(42);

        String builderString = builder.toString();

        System.out.println(builderString);
    }
}
