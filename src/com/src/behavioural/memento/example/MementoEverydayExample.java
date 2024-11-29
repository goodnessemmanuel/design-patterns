package com.src.behavioural.memento.example;

import java.io.*;

public class MementoEverydayExample {
    private final String fileName = "employee.ser";

    public void demo() {
        Employee employee = new  Employee();
        employee.setName("Thompson Doe");
        employee.setPhone("080-7766-2023");
        employee.setAddress("11 Kingston avenue josh villa");

        serialize(employee);

        Employee newEmployee = deserialize();
        System.out.println(newEmployee);

    }

    private Employee deserialize() {
        Employee employee = null;
        try (FileInputStream fileInput = new FileInputStream(fileName);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInput)
        ) {
            employee = (Employee) objectInputStream.readObject();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        return employee;
    }

    private void serialize(Employee employee) {

        try (FileOutputStream fileOutput = new FileOutputStream(fileName);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutput)
        ) {
            objectOutputStream.writeObject(employee);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
