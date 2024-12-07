package com.designpattern.structural.bridge;

import com.designpattern.structural.bridge.demo.formatter.*;
import com.designpattern.structural.bridge.demo.shape.Blue;
import com.designpattern.structural.bridge.demo.shape.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BridgePatternDemo {
    public static void main(String[] args) {
//        everydayBridgeExample();

        //custom demo
        Color green = new Green();

        Shape circle = new Circle(green);

        Color red = new Red();

        Shape square = new Square(red);

        Color blue = new Blue();

        Shape blueSquare = new Square(blue);

        circle.applyColor();
        square.applyColor();
        blueSquare.applyColor();

        //custom demo 2

        Movie movie = new Movie("New moon", "2023", "Romance");

        Formatter printerFormatter = new PrintFormatter();

        MoviePrinter moviePrinter = new MoviePrinter(movie);

       String output =  moviePrinter.print(printerFormatter);

        System.out.println(output);




    }


    /**
     * the bridge is acting between the driver and the abstraction that interacts with the database
     * so client end up interacting with the database and creating the tables, etc without knowing
     * about the bridge and abstraction between
     */
    private static void everydayBridgeExample(){
//        DriverManager.registerDriver();

        try {
            Connection conn = DriverManager.getConnection("jdbc:h2:memo:test");

            Statement stmt = conn.prepareStatement("SELECT * FROM table_name");

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            //clean up
        }


    }
}
