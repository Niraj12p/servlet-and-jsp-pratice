package org.niraj.webapplication;



import java.io.*;
public class Person implements Serializable {
    private String name;
    private double salary;
    public Person()
    {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}
