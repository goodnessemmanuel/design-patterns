package com.src.singleton;

public class Main {
    public static void main(String[] args) {
        //sample inbuilt jvm singleton

        testInbuiltJavaSingleton();
        demonstrateCustomSingleton();
    }

    /**
     * this illustration shows how java runtime environment
     * returns only a single instance of the class(i.e. Runtime). This
     * is possible only with the singleton design
     */
    public static void testInbuiltJavaSingleton(){
        var runtime1 = Runtime.getRuntime();
        System.out.println(runtime1); //outputs java.lang.Runtime@f6f4d33 in my case
        var runtime2 = Runtime.getRuntime();
        System.out.println(runtime2); //same as runtime1
    }

    public static void demonstrateCustomSingleton(){
        var singleton1 = DemonstrateSingleton.getInstance();
        System.out.println(singleton1); //outputs com.src.singleton.DemonstrateSingleton@3f99bd52 in my case
        var singleton2 = DemonstrateSingleton.getInstance();
        System.out.println(singleton2); //same as singleton1
    }
}
