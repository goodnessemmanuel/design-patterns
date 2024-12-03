package com.designpattern.creational.singleton.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBSingleton {
    private static Connection conn;
    private DBSingleton(){
        try {
            conn = DriverManager.getConnection("jdbc:h2:mem:test");
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    /**
     * Since recent versions of java (versions older than java 8),
     * there is now double check locking for thread safety. a better singleton solution
     * to tackle thread safety and locking issue is the 'initialisation on demand' using a
     * lazy holder as implemented below.
     * LazyHolder - this inner class approach ensure the singleton
     * is thread safe by adding a double ended lock
     */
   private static class LazyHolder{
        private static final DBSingleton INSTANCE = new DBSingleton();
    }

    /**
     * getInstance - this instance will be thread safe,
     * and lazy loads at the same time
     * @return - only one DBSingleton instance
     */
    public static DBSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    public Connection getConnection(){
       return conn;
    }
}
