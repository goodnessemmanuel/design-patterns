package com.designpattern.creational.singleton;

import com.designpattern.creational.singleton.demo.DBSingleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {
//        everydaySingletonExample();
        //custom demo
        DBSingleton dbSingleton1 = DBSingleton.getInstance();
        System.out.println("dbSingleton1 - " + dbSingleton1);

        DBSingleton dbSingleton2 = DBSingleton.getInstance();
        System.out.println("dbSingleton2 - " + dbSingleton2);

        System.out.println("dbSingleton1 == dbSingleton2: " +(dbSingleton1 == dbSingleton2));
    }

    /**
     * singleton has only one instance
     * throughout the application lifecycle
     */
    public static void everydaySingletonExample(){
        Runtime runtime1 = Runtime.getRuntime();
        System.out.println("runtime1 - " + runtime1);
        runtime1.gc(); //calling garbage collector to confirm runtime instance
        Runtime runtime2 = Runtime.getRuntime();
        System.out.println("runtime2 - " + runtime2);

        System.out.println("runtime1 == runtime2: " +(runtime1 == runtime2));
    }
}
