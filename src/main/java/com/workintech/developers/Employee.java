package com.workintech.developers;

public class Employee {
    private long id;
    private String name;
    private double salary;


    //getters in order

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }


    //setters in order

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    //constructor that can set all 3 vars
    public Employee(long id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    // work method (printer)

    public void work() {
        System.out.println("Employee starts to working");
    }
}
