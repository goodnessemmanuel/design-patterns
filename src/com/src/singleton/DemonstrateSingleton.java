package com.src.singleton;

/**
 * Singleton is used when you want to guarantee
 * there is only one instance of an object inside
 * our application.
 * note:
 * singleton does not take any parameter either
 * in the constructor or the static method
 */
public class DemonstrateSingleton {
    //the volatile keyword enhances thread safety together with synchronization
    //from multiple thread assessment during resources sharing
    //setting instance to null prior to the new instantiation makes lazy loading possible
    private static volatile DemonstrateSingleton instance = null;
    private DemonstrateSingleton(){}

    public static DemonstrateSingleton getInstance(){
        if(instance == null){
            //ensure no reflection occur that leads to another instantiation within the jvm at runtime
            synchronized (DemonstrateSingleton.class) {
                if(instance == null)
                    instance = new DemonstrateSingleton();
            }
        }

        return instance;
    }
}
