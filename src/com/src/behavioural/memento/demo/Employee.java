package com.src.behavioural.memento.demo;

public class Employee {
    private String name;
    private String phone;
    private String address;

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return name + " : " + phone;
    }


    /**
     * this is the method that will save the state (snapshot)
     * of the memento object whenever it is called
     * @return
     */
    public EmployeeMemento save(){
        return new EmployeeMemento(name, phone);
    }

    public void revert(EmployeeMemento employeeMemento){
        this.name = employeeMemento.getName();
        this.phone = employeeMemento.getPhone();
    }
}
