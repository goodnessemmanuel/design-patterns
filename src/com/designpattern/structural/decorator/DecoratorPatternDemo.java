package com.designpattern.structural.decorator;

import com.designpattern.structural.decorator.demo.DressingDecorator;
import com.designpattern.structural.decorator.demo.MeatDecorator;
import com.designpattern.structural.decorator.demo.Sandwhich;
import com.designpattern.structural.decorator.demo.SimpleSandwich;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
//        everydayExample();

        Sandwhich sandwhich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));

        System.out.println(sandwhich.make());
    }

    private static void everydayExample() {
        try{
            File file = new File("./output.txt");
            boolean isCreated = file.createNewFile();
            if(isCreated) {

                OutputStream outputStream = new FileOutputStream(file);

                DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
                dataOutputStream.write("Some sample text".getBytes(StandardCharsets.UTF_8));
                outputStream.close();
                dataOutputStream.close();
                System.out.println("File successfully created and written to!");
            }
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
