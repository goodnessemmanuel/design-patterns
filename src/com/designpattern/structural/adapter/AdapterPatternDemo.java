package com.designpattern.structural.adapter;

import com.designpattern.structural.adapter.demo.Employee;
import com.designpattern.structural.adapter.demo.EmployeeClient;

import java.util.Arrays;
import java.util.List;

public class AdapterPatternDemo {
    public static void main(String[] args) {
//        everydayExampleAdapter();

        EmployeeClient client = new EmployeeClient();
        List<Employee> employeeList = client.getEmployees();

        System.out.println(employeeList);

    }

    private static void everydayExampleAdapter() {
        Integer [] arrayOfInts = new Integer[] {2, 3, 5}; //this an array of integer
        System.out.println(Arrays.toString(arrayOfInts));

        List<Integer> listOfInts = Arrays.asList(arrayOfInts); //using Arrays.asList adapter converts it to a List of integers
        System.out.println(listOfInts);
    }
}
