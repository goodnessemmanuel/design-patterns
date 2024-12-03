package com.designpattern.structural.adapter.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * EmployeeClient - class that retrieves employee
 * from different datasource and aggregate them
 * for final use
 */
public class EmployeeClient {
    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        //One source of employee. (maybe from a database)
        EmployeeDB employeeDB = new EmployeeDB("123", "Silver", "Andrew", "andrew@ymail.com");
        employees.add(employeeDB);

        //another source of employee (e.g a legacy source that can't or shouldn't  be modified)
        EmployeeLdap employeeLdap = new EmployeeLdap("ssn389", "Joan", "Duo", "joan@gmail.com");

        //if you attempt to add the employeeLdap directly to the employees list it won't work
        // bcos of the difference in type and structure and further change cannot be done to it.
        //for that reason, we need an adapter that can help plug in the employeeLdap
        employees.add(new EmployeeLdapAdapter(employeeLdap.getCn(), employeeLdap.getFirstname(), employeeLdap.getSurname(), employeeLdap.getEmailAddress()));


        // imilar if you attempt to add the employeeCsv directly to the employees list it won't also work
        // bcos of the difference in type and structure and further change cannot be done to it.
        //for that reason, we need still adapter that can help plug in the employeeCsv
        EmployeeCsv employeeCsv = new EmployeeCsv("286,Isreal,David,david@outlook.com");

        employees.add(new EmployeeCsvAdapter(employeeCsv));

        return employees;
    }
}
